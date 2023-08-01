package nccloud.web.wsht.srlht.srlhtmaster.action;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;
//import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.core.util.ArrayUtils;
import nccloud.framework.web.container.IRequest;
import nc.itf.wsht.srlht.srlhtmaster.ISrlhtMasterVOService;
import nc.vo.srlht.srlht.AggSrlhtMasterVO;

/**
 * ����action�����ӡ�������form��
 */
public class SaveSrlhtMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		
		ISrlhtMasterVOService service = ServiceLocator.find(ISrlhtMasterVOService.class);

		AggSrlhtMasterVO[] vos = this.getVOs(param, AggSrlhtMasterVO.class);
		
		vos = service.saveAggSrlhtMasterVO(vos[0]);
		Object result = buildResult(param,param.getBillCard().getHead()!=null,null,vos);
		return result;
	
	}
	
}