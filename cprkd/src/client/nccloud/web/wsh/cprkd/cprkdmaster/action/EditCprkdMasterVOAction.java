package nccloud.web.wsh.cprkd.cprkdmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.cprkd.cprkd.AggCprkdMasterVO;
import nc.itf.wsh.cprkd.cprkdmaster.ICprkdMasterVOService;

/**
 * 编辑Action
 */
public class EditCprkdMasterVOAction extends BaseAction{
	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		String pk = param.getPk();
		
		ICprkdMasterVOService service = ServiceLocator.find(ICprkdMasterVOService.class);
		
		AggCprkdMasterVO vo = service.preEditAggCprkdMasterVO(pk);
		
		if(vo == null){
			return null;
		}
		return buildResult(param,true,null,vo);
	}
	
}