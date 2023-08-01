package nccloud.web.pmbd.htgjzb.htgjzbmaster.action;

import java.util.HashMap;
import java.util.Map;

import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;
import nc.itf.pmbd.htgjzb.htgjzbmaster.IHtgjzbMasterVOService;


/**
 * 新增Action
 */
public class AddHtgjzbMasterVOAction extends BaseAction {

    @Override
    public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable {
        //json数据转换
        RequestDTO param = VOTransform.toVO(paramWapper.requestString, RequestDTO.class);
        //获取参数
        Map<String, Object> userJson = param.getUserJson();

        AggHtgjzbMasterVO[] vos = this.getVOs(param, AggHtgjzbMasterVO.class);

        //获得实体VO
        IHtgjzbMasterVOService service = ServiceLocator.find(IHtgjzbMasterVOService.class);
        AggHtgjzbMasterVO vo = service.preAddAggHtgjzbMasterVO(vos[0], userJson);
        return buildResult(param, true, null, vo);

    }

}