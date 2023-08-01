package nc.impl.pmbd.htgjzb.htgjzbmaster;

import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.UUID;
import java.lang.String;
import java.util.stream.Stream;

import nc.vo.pub.lang.UFDateTime;
import nc.uap.utils.InSQLCreator;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.beanutils.PropertyUtils;


import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.VOStatus;
import nc.codeplatform.framework.service.ServiceSupport;


import nc.vo.htgjzb.htgjzb.xXmxx;
import nc.vo.htgjzb.htgjzb.Jhskxx;
import nc.vo.htgjzb.htgjzb.Jhfkxx;
import nc.vo.htgjzb.htgjzb.HtgjzbMasterVO;
import nc.vo.htgjzb.htgjzb.Ysxx;
import nc.vo.htgjzb.htgjzb.Htwbxx;
import nc.vo.htgjzb.htgjzb.Sjskxx;
import nc.vo.htgjzb.htgjzb.Sjfkxx;
import nc.vo.htgjzb.htgjzb.Xdfxx;
import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;
import nc.itf.pmbd.htgjzb.htgjzbmaster.IHtgjzbMasterVOService;


import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class HtgjzbMasterVOServiceImpl extends ServiceSupport implements IHtgjzbMasterVOService {


    @Override
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByPk(String... pks) throws BusinessException {
        return listAggHtgjzbMasterVOByPk(false, pks);
    }

    @Override
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByPk(boolean blazyLoad, String... pks) throws BusinessException {
        return dao.listByPksWithOrder(AggHtgjzbMasterVO.class, pks, blazyLoad);
    }

    @Override
    public AggHtgjzbMasterVO findAggHtgjzbMasterVOByPk(String pk) throws BusinessException {
        return dao.findByPk(AggHtgjzbMasterVO.class, pk, false);
    }

    @Override
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByCondition(String condition) throws BusinessException {
        return listAggHtgjzbMasterVOByCondition(condition, new String[]{"pk_htgjzbmaster"});
    }

    @Override
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByCondition(String condition, String[] orderPath) throws BusinessException {
        return dao.listByCondition(AggHtgjzbMasterVO.class, condition, false, false, orderPath);
    }

    @Override
    public HtgjzbMasterVO[] listHtgjzbMasterVOByPk(String... pks) throws BusinessException {
        return dao.listByPk(HtgjzbMasterVO.class, pks, true);
    }

    @Override
    public HtgjzbMasterVO findHtgjzbMasterVOByPk(String pk) throws BusinessException {
        return dao.findByPk(HtgjzbMasterVO.class, pk, true);
    }

    @Override
    public HtgjzbMasterVO[] listHtgjzbMasterVOByCondition(String condition) throws BusinessException {
        return listHtgjzbMasterVOByCondition(condition, new String[]{"pk_htgjzbmaster"});
    }

    @Override
    public HtgjzbMasterVO[] listHtgjzbMasterVOByCondition(String condition, String[] orderPath) throws BusinessException {
        return dao.listByCondition(HtgjzbMasterVO.class, condition, false, false, orderPath);
    }

    @Override
    public String[] listHtgjzbMasterVOPkByCond(String condition) throws BusinessException {
        return listHtgjzbMasterVOPkByCond(condition, new String[]{"pk_htgjzbmaster"});
    }

    @Override
    public String[] listHtgjzbMasterVOPkByCond(String condition, String[] orderPath) throws BusinessException {
        if (StringUtils.isEmpty(condition)) {
            condition = " 1 = 1 ";
        }
        StringBuilder sql = new StringBuilder();
        sql.append(" select pk_htgjzbmaster from ").append(HtgjzbMasterVO.getDefaultTableName());
        sql.append(" where ").append(condition);
        if (ArrayUtils.isNotEmpty(orderPath)) {
            sql.append(" order by ").append(StringUtils.join(orderPath, ", "));
        }
        return (String[]) dao.getBaseDAO().executeQuery(sql.toString(), (rs) -> {
            List<String> pks = new ArrayList<>();
            while (rs.next()) {
                pks.add(rs.getString(1));
            }
            return pks.toArray(new String[0]);
        });
    }

    @Override
    public void initDefaultData(HtgjzbMasterVO vo) {
        if (vo.getAttributeValue("pk_group") == null) {
            vo.setAttributeValue("pk_group", InvocationInfoProxy.getInstance().getGroupId());
        }
        if (vo.getAttributeValue("maketime") == null) {
            vo.setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
        }
    }

    @Override
    public AggHtgjzbMasterVO preAddAggHtgjzbMasterVO(AggHtgjzbMasterVO vo, Map<String, Object> userJson) throws BusinessException {

        getMainVO(vo).setStatus(VOStatus.NEW);
        initDefaultData((HtgjzbMasterVO) getMainVO(vo));

        //下面这段要判断是否是树表界面插件
        Map<String, String> data = userJson != null && userJson.get("data") != null ? (Map<String, String>) userJson.get("data") : null;
        if (data != null && data.size() > 0) {
            String parentKey = data.get("parentKey");
            String parentPk = data.get("parentPk");
            getMainVO(vo).setAttributeValue(parentKey, parentPk);
        }


        return vo;
    }

    @Override
    public AggHtgjzbMasterVO preAddAggHtgjzbMasterVO(Map<String, Object> userJson) throws BusinessException {
        AggHtgjzbMasterVO result = null;

        HtgjzbMasterVO mainvo = new HtgjzbMasterVO();
        //设置默认值
        initDefaultData(mainvo);
        AggHtgjzbMasterVO aggvo = new AggHtgjzbMasterVO();
        aggvo.setParent(mainvo);
        result = aggvo;
        return preAddAggHtgjzbMasterVO(result, userJson);
    }

    @Override
    public AggHtgjzbMasterVO preEditAggHtgjzbMasterVO(String pk) throws BusinessException {
        return dao.findByPk(AggHtgjzbMasterVO.class, pk, false);
    }

    @Override
    public AggHtgjzbMasterVO copyAggHtgjzbMasterVO(String pk) throws BusinessException {

        AggHtgjzbMasterVO vo = dao.findByPk(AggHtgjzbMasterVO.class, pk, false);

        getMainVO(vo).setPrimaryKey(null);
        getMainVO(vo).setStatus(VOStatus.NEW);

        getMainVO(vo).setAttributeValue("srcbilltype", null);
        getMainVO(vo).setAttributeValue("srcbillid", null);

        getMainVO(vo).setAttributeValue("code", null);
        getMainVO(vo).setAttributeValue("", null);
        getMainVO(vo).setAttributeValue("", null);
        getMainVO(vo).setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));

        Xdfxx[] xdfxxs = (Xdfxx[]) vo.getChildren(Xdfxx.class);
        if (xdfxxs != null && xdfxxs.length > 0) {
            Arrays.stream(xdfxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
                subvo.setAttributeValue("rowno", null);
                subvo.setAttributeValue("srcrowno", null);
            });
        }
        xXmxx[] xXmxxs = (xXmxx[]) vo.getChildren(xXmxx.class);
        if (xXmxxs != null && xXmxxs.length > 0) {
            Arrays.stream(xXmxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        Ysxx[] ysxxs = (Ysxx[]) vo.getChildren(Ysxx.class);
        if (ysxxs != null && ysxxs.length > 0) {
            Arrays.stream(ysxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        Jhskxx[] jhskxxs = (Jhskxx[]) vo.getChildren(Jhskxx.class);
        if (jhskxxs != null && jhskxxs.length > 0) {
            Arrays.stream(jhskxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        Sjskxx[] sjskxxs = (Sjskxx[]) vo.getChildren(Sjskxx.class);
        if (sjskxxs != null && sjskxxs.length > 0) {
            Arrays.stream(sjskxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        Jhfkxx[] jhfkxxs = (Jhfkxx[]) vo.getChildren(Jhfkxx.class);
        if (jhfkxxs != null && jhfkxxs.length > 0) {
            Arrays.stream(jhfkxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        Sjfkxx[] sjfkxxs = (Sjfkxx[]) vo.getChildren(Sjfkxx.class);
        if (sjfkxxs != null && sjfkxxs.length > 0) {
            Arrays.stream(sjfkxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        Htwbxx[] htwbxxs = (Htwbxx[]) vo.getChildren(Htwbxx.class);
        if (htwbxxs != null && htwbxxs.length > 0) {
            Arrays.stream(htwbxxs).forEach(subvo -> {
                subvo.setPrimaryKey(null);
                subvo.setStatus(VOStatus.NEW);
                subvo.setAttributeValue("srcbilltype", null);
                subvo.setAttributeValue("srcbillid", null);
            });
        }
        return vo;
    }

    @Override
    public AggHtgjzbMasterVO[] saveAggHtgjzbMasterVO(AggHtgjzbMasterVO vo) throws BusinessException {
        String pk = getVOPrimaryKey(vo);
        setDefaultVal(vo);
        if (StringUtils.isEmpty(pk)) {
            return dao.insert(vo); //插入
        } else {
            return dao.update(vo); //更新
        }
    }

    /**
     * 保存前设置审计信息
     *
     * @param vos
     */
    private void setAuditInfo(AggHtgjzbMasterVO... vos) throws BusinessException {
        if (ArrayUtils.isNotEmpty(vos)) {
            UFDateTime now = new UFDateTime();
            for (AggHtgjzbMasterVO vo : vos) {
                String pk = getVOPrimaryKey(vo);
                if (StringUtils.isEmpty(pk)) {
                    //设置创建人创建时间
                    getMainVO(vo).setAttributeValue("creator", InvocationInfoProxy.getInstance().getUserId());
                    getMainVO(vo).setAttributeValue("creationtime", now);
                    getMainVO(vo).setAttributeValue("maketime", now);
                    getMainVO(vo).setAttributeValue("modifier", null);
                    getMainVO(vo).setAttributeValue("modifiedtime", null);
                } else {
                    //设置修改人修改时间
                    getMainVO(vo).setAttributeValue("modifier", InvocationInfoProxy.getInstance().getUserId());
                    getMainVO(vo).setAttributeValue("modifiedtime", now);
                    getMainVO(vo).setAttributeValue("lastmaketime", now);
                }
            }
        }
    }

    /**
     * 保存前处理一些默认值
     *
     * @param vos
     */
    private void setDefaultVal(AggHtgjzbMasterVO... vos) throws BusinessException {
        setAuditInfo(vos);
        //其他默认值处理
    }

    // 给单表（行编辑表）单独适配
    @Override
    public AggHtgjzbMasterVO[] saveAggHtgjzbMasterVO(AggHtgjzbMasterVO[] vos) throws BusinessException {
        if (ArrayUtils.isEmpty(vos)) {
            return new AggHtgjzbMasterVO[0];
        }
        setDefaultVal(vos); // 设置默认值
        return dao.save(vos, true);
    }

    @Override
    public AggHtgjzbMasterVO[] deleteAggHtgjzbMasterVOs(Map<String, String> tsMap) throws BusinessException {
        AggHtgjzbMasterVO[] vos = dao.listByPk(AggHtgjzbMasterVO.class, tsMap.keySet().toArray(new String[0]));
        validate(vos, tsMap);
        dao.delete(vos, true);
        return vos;
    }

    @Override
    public AggHtgjzbMasterVO[] loadAggHtgjzbMasterVOs(Map<String, String> tsMap) {
        AggHtgjzbMasterVO[] vos = null;
        try {
            vos = dao.listByPk(AggHtgjzbMasterVO.class, tsMap.keySet().toArray(new String[0]));
        } catch (BusinessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return vos;
    }

    //校验  包括ts校验  已提交校验
    private void validate(AggHtgjzbMasterVO[] vos, Map<String, String> tsMap) throws BusinessException {

        Boolean isPass = true;
        String error = "";    //错误信息
        if (ArrayUtils.isEmpty(vos)) {
            isPass = false;
        }

        for (int i = 0; i < vos.length; i++) {
            SuperVO mainvo = vos[i].getParentVO();
            UFDateTime ts = (UFDateTime) mainvo.getAttributeValue("ts");
            if (!StringUtils.equals(tsMap.get(mainvo.getPrimaryKey()), ts.toString())) {
                isPass = false;
                break;
            }
        }
        if (!isPass) {
            throw new BusinessException("您操作的数据已被他人修改或删除，请刷新后重试！");
        }
        if (!"".equals(error)) {
            throw new BusinessException(error);
        }
    }

    @Override
    public <T> T[] loadTreeData(Class<T> clazz, Map<String, Object> userJson) throws BusinessException {
        String condition = "dr = 0 ";
        return dao.listByCondition(clazz, condition, false);
    }

    @Override
    public String[] queryChildPksByParentId(Class childClazz, String parentId) throws BusinessException {
        String cond = " pk_htgjzbmaster = '" + parentId + "' ";
        SuperVO[] vos = (SuperVO[]) dao.listByCondition(childClazz, cond, false);
        if (vos == null || vos.length == 0) {
            return new String[0];
        }
        return Stream.of(vos).map(vo -> vo.getPrimaryKey()).toArray(String[]::new);
    }


    public SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException {
        return (SuperVO[]) dao.listByPk(childClazz, pks, false);
    }

}
