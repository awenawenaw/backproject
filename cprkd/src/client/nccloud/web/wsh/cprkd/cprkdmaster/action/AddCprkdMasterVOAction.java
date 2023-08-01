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
 * 新增Action
 */
public class AddCprkdMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggCprkdMasterVO[] vos = this.getVOs(param, AggCprkdMasterVO.class);
		
		//获得实体VO
		ICprkdMasterVOService service = ServiceLocator.find(ICprkdMasterVOService.class);
		AggCprkdMasterVO vo = service.preAddAggCprkdMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}