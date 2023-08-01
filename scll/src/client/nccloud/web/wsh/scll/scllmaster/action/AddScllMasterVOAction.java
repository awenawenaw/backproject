package nccloud.web.wsh.scll.scllmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.scll.scll.AggScllMasterVO;
import nc.itf.wsh.scll.scllmaster.IScllMasterVOService;


/**
 * 新增Action
 */
public class AddScllMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggScllMasterVO[] vos = this.getVOs(param, AggScllMasterVO.class);
		
		//获得实体VO
		IScllMasterVOService service = ServiceLocator.find(IScllMasterVOService.class);
		AggScllMasterVO vo = service.preAddAggScllMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}