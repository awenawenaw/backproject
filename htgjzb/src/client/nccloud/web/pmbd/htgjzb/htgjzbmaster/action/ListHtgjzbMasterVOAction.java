package nccloud.web.pmbd.htgjzb.htgjzbmaster.action;

import java.util.Arrays;
import java.util.Collections;

import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;

import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;

import nccloud.pubitf.platform.query.INCCloudQueryService;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nccloud.commons.lang.StringUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.framework.web.ui.model.PageInfo;
import nc.itf.pmbd.htgjzb.htgjzbmaster.IHtgjzbMasterVOService;
import nc.vo.htgjzb.htgjzb.HtgjzbMasterVO;

/**
 * �б��ѯ
 */
public class ListHtgjzbMasterVOAction extends BaseAction {

    @Override
    public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable {
        //json����ת��
        RequestDTO param = VOTransform.toVO(paramWapper.requestString, RequestDTO.class);

        PageInfo pageInfo = param.getPageInfo();

        //��ѯ����
        INCCloudQueryService nccloudService = ServiceLocator.find(INCCloudQueryService.class);
        QueryTreeFormatVO queryVo = param.getQueryTreeFormatVO();
        String searchSql = "";
        if (queryVo != null) {
            IQueryScheme searchService = nccloudService.convertCondition(queryVo);
            searchSql = searchService.getWhereSQLOnly();
        }

        IHtgjzbMasterVOService service = ServiceLocator.find(IHtgjzbMasterVOService.class);
        //��ѯ��ǰ���������е�����pk
        String[] allpks = service.listHtgjzbMasterVOPkByCond(searchSql);
        if (ArrayUtils.isEmpty(allpks)) {
            return null;
        }
        //pk����
        //Arrays.sort(allpks);
        param.setAllpks(allpks);
        //���ݷ�ҳ�õ���ǰ��ҳ��pk
        String[] curPagePks = pageInfo == null ? allpks : paramWapper.pageResult(pageInfo, allpks);
        HtgjzbMasterVO[] vos = service.listHtgjzbMasterVOByPk(curPagePks);
        //���췵�ؽ��
        return buildResult(param, false, null, vos);
    }

}