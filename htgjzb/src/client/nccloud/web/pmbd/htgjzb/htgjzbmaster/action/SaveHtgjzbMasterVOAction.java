package nccloud.web.pmbd.htgjzb.htgjzbmaster.action;

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
import nc.itf.pmbd.htgjzb.htgjzbmaster.IHtgjzbMasterVOService;
import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;

/**
 * 保存action（主子、单表、单form）
 */
public class SaveHtgjzbMasterVOAction extends BaseAction {

    @Override
    public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable {
        RequestDTO param = VOTransform.toVO(paramWapper.requestString, RequestDTO.class);

        IHtgjzbMasterVOService service = ServiceLocator.find(IHtgjzbMasterVOService.class);

        AggHtgjzbMasterVO[] vos = this.getVOs(param, AggHtgjzbMasterVO.class);

        vos = service.saveAggHtgjzbMasterVO(vos[0]);
        Object result = buildResult(param, param.getBillCard().getHead() != null, null, vos);
        return result;

    }

}