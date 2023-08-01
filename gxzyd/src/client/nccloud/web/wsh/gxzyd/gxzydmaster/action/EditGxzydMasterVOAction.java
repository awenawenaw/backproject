package nccloud.web.wsh.gxzyd.gxzydmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.gxzyd.gxzyd.AggGxzydMasterVO;
import nc.itf.wsh.gxzyd.gxzydmaster.IGxzydMasterVOService;

/**
 * 编辑Action
 */
public class EditGxzydMasterVOAction extends BaseAction{
	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		String pk = param.getPk();
		
		IGxzydMasterVOService service = ServiceLocator.find(IGxzydMasterVOService.class);
		
		AggGxzydMasterVO vo = service.preEditAggGxzydMasterVO(pk);
		
		if(vo == null){
			return null;
		}
		return buildResult(param,true,null,vo);
	}
	
}