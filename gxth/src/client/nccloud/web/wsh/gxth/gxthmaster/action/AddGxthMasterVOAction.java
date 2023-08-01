package nccloud.web.wsh.gxth.gxthmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.gxth.gxth.AggGxthMasterVO;
import nc.itf.wsh.gxth.gxthmaster.IGxthMasterVOService;


/**
 * 新增Action
 */
public class AddGxthMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggGxthMasterVO[] vos = this.getVOs(param, AggGxthMasterVO.class);
		
		//获得实体VO
		IGxthMasterVOService service = ServiceLocator.find(IGxthMasterVOService.class);
		AggGxthMasterVO vo = service.preAddAggGxthMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}