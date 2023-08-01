package nccloud.web.wsht.zclht.zclhtmaster.action;
import java.util.HashMap;
import java.util.Map;
import nc.pub.billcode.vo.BillCodeContext;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.zclht.zclht.AggZclhtMasterVO;
import nc.itf.wsht.zclht.zclhtmaster.IZclhtMasterVOService;


/**
 * ����Action
 */
public class AddZclhtMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json����ת��
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//��ȡ����
		Map<String,Object> userJson = param.getUserJson();

		AggZclhtMasterVO[] vos = this.getVOs(param, AggZclhtMasterVO.class);
		
		//���ʵ��VO
		IZclhtMasterVOService service = ServiceLocator.find(IZclhtMasterVOService.class);
		AggZclhtMasterVO vo = service.preAddAggZclhtMasterVO(vos[0],userJson);
		Map<String,Object> externalData = new HashMap<>();
		BillCodeContext context = service.getBillCodeContext("zclhtzclht");
		externalData.put("billCodeContext",context);
		return buildResult(param,true,externalData,vo);
		
	}

}