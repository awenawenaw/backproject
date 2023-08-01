package nccloud.web.wsh.hwtzd.hwtzdmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.hwtzd.hwtzd.AggHwtzdMasterVO;
import nc.itf.wsh.hwtzd.hwtzdmaster.IHwtzdMasterVOService;


/**
 * 新增Action
 */
public class AddHwtzdMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggHwtzdMasterVO[] vos = this.getVOs(param, AggHwtzdMasterVO.class);
		
		//获得实体VO
		IHwtzdMasterVOService service = ServiceLocator.find(IHwtzdMasterVOService.class);
		AggHwtzdMasterVO vo = service.preAddAggHwtzdMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}