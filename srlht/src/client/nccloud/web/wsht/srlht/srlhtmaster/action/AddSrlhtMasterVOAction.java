package nccloud.web.wsht.srlht.srlhtmaster.action;
import java.util.HashMap;
import java.util.Map;
import nc.pub.billcode.vo.BillCodeContext;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.srlht.srlht.AggSrlhtMasterVO;
import nc.itf.wsht.srlht.srlhtmaster.ISrlhtMasterVOService;


/**
 * 新增Action
 */
public class AddSrlhtMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggSrlhtMasterVO[] vos = this.getVOs(param, AggSrlhtMasterVO.class);
		
		//获得实体VO
		ISrlhtMasterVOService service = ServiceLocator.find(ISrlhtMasterVOService.class);
		AggSrlhtMasterVO vo = service.preAddAggSrlhtMasterVO(vos[0],userJson);
		Map<String,Object> externalData = new HashMap<>();
		BillCodeContext context = service.getBillCodeContext("srlhtsrlht");
		externalData.put("billCodeContext",context);
		return buildResult(param,true,externalData,vo);
		
	}

}