package nccloud.web.wsh.dbsq.dbsqmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.dbsq.dbsq.AggDbsqMasterVO;
import nc.itf.wsh.dbsq.dbsqmaster.IDbsqMasterVOService;


/**
 * 新增Action
 */
public class AddDbsqMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggDbsqMasterVO[] vos = this.getVOs(param, AggDbsqMasterVO.class);
		
		//获得实体VO
		IDbsqMasterVOService service = ServiceLocator.find(IDbsqMasterVOService.class);
		AggDbsqMasterVO vo = service.preAddAggDbsqMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}