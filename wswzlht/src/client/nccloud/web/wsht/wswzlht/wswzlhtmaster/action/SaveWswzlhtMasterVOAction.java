package nccloud.web.wsht.wswzlht.wswzlhtmaster.action;

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
import nc.itf.wsht.wswzlht.wswzlhtmaster.IWswzlhtMasterVOService;
import nc.vo.wsht.wswzlht.AggWswzlhtMasterVO;

/**
 * ����action�����ӡ�������form��
 */
public class SaveWswzlhtMasterVOAction extends BaseAction{

	@Override
	public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable{
		RequestDTO param = VOTransform.toVO(paramWapper.requestString,RequestDTO.class);
		
		IWswzlhtMasterVOService service = ServiceLocator.find(IWswzlhtMasterVOService.class);

		AggWswzlhtMasterVO[] vos = this.getVOs(param, AggWswzlhtMasterVO.class);
		
		vos = service.saveAggWswzlhtMasterVO(vos[0]);
		Object result = buildResult(param,param.getBillCard().getHead()!=null,null,vos);
		return result;
	
	}
	
}