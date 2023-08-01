package nccloud.web.wsh.wxrk.wxrkmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.wxrk.wxrk.AggWxrkMasterVO;
import nc.itf.wsh.wxrk.wxrkmaster.IWxrkMasterVOService;

/**
 * 编辑Action
 */
public class EditWxrkMasterVOAction extends BaseAction{
	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		String pk = param.getPk();
		
		IWxrkMasterVOService service = ServiceLocator.find(IWxrkMasterVOService.class);
		
		AggWxrkMasterVO vo = service.preEditAggWxrkMasterVO(pk);
		
		if(vo == null){
			return null;
		}
		return buildResult(param,true,null,vo);
	}
	
}