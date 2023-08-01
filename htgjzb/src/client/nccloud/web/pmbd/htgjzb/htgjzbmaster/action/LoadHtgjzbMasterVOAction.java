package nccloud.web.pmbd.htgjzb.htgjzbmaster.action;

import nccloud.commons.lang.StringUtils;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.core.exception.BusinessException;
import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;
import nc.itf.pmbd.htgjzb.htgjzbmaster.IHtgjzbMasterVOService;

/**
 * 卡片查询
 */
public class LoadHtgjzbMasterVOAction extends BaseAction {

    @Override
    public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable {
        RequestDTO param = VOTransform.toVO(paramWapper.requestString, RequestDTO.class);

        String pk = param.getPk();
        if (StringUtils.isEmpty(pk)) {
            throw new BusinessException("参数中缺少pk参数，请检查代码！");
        }
        IHtgjzbMasterVOService service = ServiceLocator.find(IHtgjzbMasterVOService.class);

        AggHtgjzbMasterVO vo = service.findAggHtgjzbMasterVOByPk(pk);
        if (vo == null) {
            return null;
        }

        return buildResult(param, true, null, vo);
    }

}