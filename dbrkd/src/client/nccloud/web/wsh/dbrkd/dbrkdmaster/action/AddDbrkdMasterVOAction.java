package nccloud.web.wsh.dbrkd.dbrkdmaster.action;
import java.util.HashMap;
import java.util.Map;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.dbrkd.dbrkd.AggDbrkdMasterVO;
import nc.itf.wsh.dbrkd.dbrkdmaster.IDbrkdMasterVOService;


/**
 * 新增Action
 */
public class AddDbrkdMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		//json数据转换
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		//获取参数
		Map<String,Object> userJson = param.getUserJson();

		AggDbrkdMasterVO[] vos = this.getVOs(param, AggDbrkdMasterVO.class);
		
		//获得实体VO
		IDbrkdMasterVOService service = ServiceLocator.find(IDbrkdMasterVOService.class);
		AggDbrkdMasterVO vo = service.preAddAggDbrkdMasterVO(vos[0],userJson);
		return buildResult(param,true,null,vo);
		
	}

}