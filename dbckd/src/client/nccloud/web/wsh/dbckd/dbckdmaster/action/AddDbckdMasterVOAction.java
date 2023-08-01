package nccloud.web.wsh.dbckd.dbckdmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.dbckd.dbckd.AggDbckdMasterVO;
import nc.itf.wsh.dbckd.dbckdmaster.IDbckdMasterVOService;


/**
 * 新增Action
 */
public class AddDbckdMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggDbckdMasterVO[] vos = this.getVOs(param, AggDbckdMasterVO.class);
		
		//获得实体VO
		IDbckdMasterVOService service = ServiceLocator.find(IDbckdMasterVOService.class);
		AggDbckdMasterVO vo = service.preAddAggDbckdMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}