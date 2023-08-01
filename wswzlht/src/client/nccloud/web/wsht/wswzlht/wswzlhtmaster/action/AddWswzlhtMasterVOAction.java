package nccloud.web.wsht.wswzlht.wswzlhtmaster.action;
import java.util.HashMap;
import java.util.Map;
import nc.pub.billcode.vo.BillCodeContext;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.wsht.wswzlht.AggWswzlhtMasterVO;
import nc.itf.wsht.wswzlht.wswzlhtmaster.IWswzlhtMasterVOService;


/**
 * 新增Action
 */
public class AddWswzlhtMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggWswzlhtMasterVO[] vos = this.getVOs(param, AggWswzlhtMasterVO.class);
		
		//获得实体VO
		IWswzlhtMasterVOService service = ServiceLocator.find(IWswzlhtMasterVOService.class);
		AggWswzlhtMasterVO vo = service.preAddAggWswzlhtMasterVO(vos[0],userJson);
		Map<String,Object> externalData = new HashMap<>();
		BillCodeContext context = service.getBillCodeContext("wshtwswzlht");
		externalData.put("billCodeContext",context);
		return buildResult(param,true,externalData,vo);
		
	}

}