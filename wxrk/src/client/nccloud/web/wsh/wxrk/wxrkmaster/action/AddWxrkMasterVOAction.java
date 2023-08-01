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
 * 新增Action
 */
public class AddWxrkMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggWxrkMasterVO[] vos = this.getVOs(param, AggWxrkMasterVO.class);
		
		//获得实体VO
		IWxrkMasterVOService service = ServiceLocator.find(IWxrkMasterVOService.class);
		AggWxrkMasterVO vo = service.preAddAggWxrkMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}