package nccloud.web.pmbd.htgjzb.htgjzbmaster.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
//import java.util.List;
import java.util.Map;

import com.mongodb.util.JSON;
import nc.bs.dao.DAOException;
import nc.jdbc.framework.processor.ColumnProcessor;
import org.springframework.http.HttpMethod;

import com.alibaba.fastjson.JSONObject;

import nc.bs.dao.BaseDAO;
import nc.itf.pmbd.htgjzb.htgjzbmaster.IHtgjzbMasterVOService;
import nc.itf.pmbd.htgjzb.utils.HttpHelper;
import nc.itf.pmbd.htgjzb.utils.QueryTools;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;
import nc.vo.htgjzb.htgjzb.EsbHtjb;
import nc.vo.htgjzb.htgjzb.EsbJhfkxx;
import nc.vo.htgjzb.htgjzb.EsbJhskxx;
import nc.vo.htgjzb.htgjzb.EsbSjfkxx;
import nc.vo.htgjzb.htgjzb.EsbSjskxxs;
import nc.vo.htgjzb.htgjzb.EsbXdfxx;
import nc.vo.htgjzb.htgjzb.EsbXmxx;
import nc.vo.htgjzb.htgjzb.EsbYsxx;
import nc.vo.htgjzb.htgjzb.HtgjzbMasterVO;
import nc.vo.htgjzb.htgjzb.Htwbxx;
import nc.vo.htgjzb.htgjzb.Jhfkxx;
import nc.vo.htgjzb.htgjzb.Jhskxx;
import nc.vo.htgjzb.htgjzb.Sjfkxx;
import nc.vo.htgjzb.htgjzb.Sjskxx;
import nc.vo.htgjzb.htgjzb.Xdfxx;
import nc.vo.htgjzb.htgjzb.Ysxx;
import nc.vo.htgjzb.htgjzb.xXmxx;
import nc.vo.pub.CircularlyAccessibleValueObject;
//import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.web.codeplatform.framework.action.base.BaseAction;
import nccloud.web.codeplatform.framework.action.base.RequstParamWapper;
import nccloud.web.codeplatform.framework.action.base.RequestDTO;
import nccloud.web.codeplatform.framework.action.base.VOTransform;
import nccloud.framework.service.ServiceLocator;
import nccloud.base.exception.BusinessException;
import nccloud.framework.core.util.ArrayUtils;
import nccloud.framework.web.container.IRequest;

/**
 * 发送 action（主子、单表、单form）
 */
public class SendHtgjzbMasterVOAction extends BaseAction {

    @Override
    public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable {
        RequestDTO param = VOTransform.toVO(paramWapper.requestString, RequestDTO.class);
        Map<String, String> tsMap = param.getTsMap();

        if (tsMap == null || tsMap.size() == 0) {
            throw new BusinessException("通过getTsMap()获取pk与ts组成的Map集合作为参数时未获取到，请传递tsMap");
        }

        IHtgjzbMasterVOService service = ServiceLocator.find(IHtgjzbMasterVOService.class);
        AggHtgjzbMasterVO[] vos = service.loadAggHtgjzbMasterVOs(tsMap);
        String result = "";
        //获取配置表中的接口地址
        String sql = "select interfaceName,interfaceUrl from interfaceConfig where interfaceName= '合同关键指标说明ESB'";
        List<Object[]> interfaceData = (List<Object[]>) getBaseDAO().executeQuery(sql, new ArrayListProcessor());
        String url = "";
        if (interfaceData == null) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sqlLogs = "insert into interfaceLogs \n" +
                    "values ('合同关键指标说明ESB','HTGJZB','" + url + "','接口地址为空',''," + dateFormat.format(date) + ")";
            int i = getBaseDAO().executeUpdate(sqlLogs);
            return "接口地址为空";
        }
        url = (String) interfaceData.get(0)[1];
        if (vos != null) {
            for (AggHtgjzbMasterVO aggHtgjzbMasterVO : vos) {
                //主表
                HtgjzbMasterVO htgjzb = (HtgjzbMasterVO) aggHtgjzbMasterVO.getParent();
                EsbHtjb ejbhtjb = new EsbHtjb();
                String con_unitconcode = htgjzb.getCode() == null ? "" : htgjzb.getCode();
                ejbhtjb.setCon_unitconcode(con_unitconcode);//合同主编码
                ejbhtjb.setCon_concode(htgjzb.getHtcode());//合同编码
                ejbhtjb.setCon_conname(htgjzb.getHtname());//合同名称
                ejbhtjb.setCon_unitcode(htgjzb.getUnitcode());//所属单位编码
                ejbhtjb.setCon_unitname(htgjzb.getUnitname());//所属单位名称
                ejbhtjb.setSecend_dept_code(htgjzb.getSecondunitcode());//所属三级单位编
                ejbhtjb.setSecend_dept_name(htgjzb.getSecondunitname());//所属三级单位名称
                ejbhtjb.setQsrxm(htgjzb.getSignedname());//签署人姓名
                ejbhtjb.setCon_creddebrt(getDefdocName(htgjzb.getVdef1()));//收支方向
                ejbhtjb.setHtejlb(getDefdocName(htgjzb.getVdef2()));//合同二级类别
                ejbhtjb.setHtsjlb(htgjzb.getHtrealtype());//合同实际类别
                ejbhtjb.setHtfbsx(getDefdocName(htgjzb.getVdef3()));//合同范本属性
                ejbhtjb.setFbbh(htgjzb.getModelcode());//范本编号
                ejbhtjb.setCon_conlevel(getDefdocName(htgjzb.getVdef4()));//合同级别
                ejbhtjb.setHtsscybk(getDefdocName(htgjzb.getVdef5()));//合同所属产业板块
                ejbhtjb.setSscybkxly(htgjzb.getIndustrialsector());//所属产业板块下领域
                ejbhtjb.setJprwsx(htgjzb.getMilitaryattr());//J了品任务属性
                ejbhtjb.setSfckht(getDefdocName(htgjzb.getVdef7()));//是否敞口合同
                ejbhtjb.setSfbght(getDefdocName(htgjzb.getVdef8()));//是否变更合同
                ejbhtjb.setCon_convalue(htgjzb.getVdef9());//合同金额
                ejbhtjb.setCon_concur(getDefdocName(htgjzb.getVdef10()));//合同币种
                ejbhtjb.setCon_contarcontspec(htgjzb.getHtdescription());//合同标地
                ejbhtjb.setCon_inspprice(getDefdocName(htgjzb.getVdef12()));//价格确定依据
                ejbhtjb.setCon_conconfilevel(getDefdocName(htgjzb.getVdef13()));//合同密级
                ejbhtjb.setCon_constatus(getDefdocName(htgjzb.getVdef14()));//合同状态
                ejbhtjb.setHtqdrq(htgjzb.getHtsigningdate());//合同签订日期
                ejbhtjb.setHtjsrq(htgjzb.getHtenddate());//合同结束日期
                ejbhtjb.setHttjsprq(htgjzb.getHtsubmitdate());//合同提交审批日期
                ejbhtjb.setHtsptgrq(htgjzb.getHtapprdate());//合同审批通过日期
                ejbhtjb.setHtbjsj(htgjzb.getHtcompletdate());//合同办结时间
                ejbhtjb.setSsyxx(htgjzb.getDatavalidation());//数据有效性
                ejbhtjb.setHtsxrq(htgjzb.getHteffectivedate());//合同生效日期
                ejbhtjb.setKjxy(getDefdocName(htgjzb.getVdef6()));//框架协议
                //ejbhtjb.setGlkjxybh();//
//				ejbhtjb.setXscpbh(htgjzb.);//销售产品编号
//				ejbhtjb.setXscpmc(htgjzb.);//销售产品名称
                //子表
                //相对方信息
                Xdfxx[] xdfxxs = (Xdfxx[]) aggHtgjzbMasterVO.getChildren(Xdfxx.class);
                EsbXdfxx esbxdfxx = new EsbXdfxx();
//                List<EsbXdfxx> lstEsbXdfxx = new ArrayList<EsbXdfxx>();
                if (xdfxxs != null) {
                    for (Xdfxx xdfxx : xdfxxs) {
                        esbxdfxx.setJthtbm(con_unitconcode);//合同主数据编码
                        esbxdfxx.setHtbm(xdfxx.getHtcode());//合同编码
                        esbxdfxx.setXdfbm(xdfxx.getCounterpartcode());//相对方编码
                        esbxdfxx.setXdfmc(xdfxx.getCounterpartname());//相对方名称
                        esbxdfxx.setDfztdw(getDefdocName(xdfxx.getDef1()));//对方主体地位
                        esbxdfxx.setWfztdw(getDefdocName(xdfxx.getDef2()));//我方主体地位
                        esbxdfxx.setXdflbdm(xdfxx.getCounterparttype());//相对方类别代码
                        esbxdfxx.setXdfksdwdm(xdfxx.getCounterpartunit());//相对方隶属单位代码
                        esbxdfxx.setXdfgb(getCountryName(xdfxx.getDef3()));//相对方国别
                        esbxdfxx.setXdftxdz(xdfxx.getCounterpartaddr());//相对方通讯地址
                        esbxdfxx.setDfnsrsbh(xdfxx.getTaxnumber());//对方纳税人识别号
                        esbxdfxx.setDfkhhmc(xdfxx.getOtherbankname());//对方开户行名称
                        esbxdfxx.setDfkhhzh(xdfxx.getOtherbankaccount());//对方开户行账户
                        esbxdfxx.setWfkhhmc(xdfxx.getWebankname());//我方开户行名称
                        esbxdfxx.setWfkhhzh(xdfxx.getWebankaccount());//我方开户行账户
                        esbxdfxx.setSsyxx(xdfxx.getDatavalid());//数据有效性
                        esbxdfxx.setCon_unitcode(xdfxx.getUnitcode());//所属单位编码
//                        lstEsbXdfxx.add(esbxdfxx);
                    }
                }
                //项目信息
                xXmxx[] xXmxxs = (xXmxx[]) aggHtgjzbMasterVO.getChildren(xXmxx.class);
                List<EsbXmxx> lstEsbXmxx = new ArrayList<EsbXmxx>();
                if (xXmxxs != null) {
                    for (xXmxx xmxx : xXmxxs) {
                        EsbXmxx esbXmxx = new EsbXmxx();
                        esbXmxx.setJthtbm(con_unitconcode);//集团合同编码
                        esbXmxx.setHtbm(xmxx.getHtcode());//合同编码
                        esbXmxx.setXmbm(xmxx.getProjectcode());//项目编码
                        esbXmxx.setXmssgs(xmxx.getProjectcompany());//项目所属公司
                        esbXmxx.setXmfl(xmxx.getProjectsort());//项目分类
                        esbXmxx.setXmmc(xmxx.getProjectname());//项目名称
                        esbXmxx.setHtzyxmje(xmxx.getDef1());//合同占用项目金额
                        esbXmxx.setLxpfje(xmxx.getDef2());//立项批复金额
                        esbXmxx.setXmzt(getDefdocName(xmxx.getDef3()));//项目状态
                        esbXmxx.setSsyxx(xmxx.getDef20());//数据有效性
                        lstEsbXmxx.add(esbXmxx);
                    }
                }
                //预算信息
                Ysxx[] ysxxs = (Ysxx[]) aggHtgjzbMasterVO.getChildren(Ysxx.class);
                List<EsbYsxx> lstEsbYsxx = new ArrayList<EsbYsxx>();
                if (ysxxs != null) {
                    for (Ysxx ysxx : ysxxs) {
                        EsbYsxx esbYsxx = new EsbYsxx();
                        esbYsxx.setJthtbm(con_unitconcode);//合同主数据编码
                        esbYsxx.setHtbm(ysxx.getHtcode());//合同编码
                        esbYsxx.setYslsh(ysxx.getBudgetnum());//预算流水号
                        esbYsxx.setYsssxmbh(ysxx.getBudgetprocode());//预算所属项目编码
                        esbYsxx.setYsnd(ysxx.getDef2());//预算年度
                        esbYsxx.setNdysje(ysxx.getDef1());//年度预算金额
                        esbYsxx.setSsyxx(ysxx.getDef20());//数据有效性
                        lstEsbYsxx.add(esbYsxx);
                    }
                }
                //计划收款信息
                Jhskxx[] jhskxxs = (Jhskxx[]) aggHtgjzbMasterVO.getChildren(Jhskxx.class);
                List<EsbJhskxx> lstEsbJhskxx = new ArrayList<EsbJhskxx>();
                if (jhskxxs != null) {
                    for (Jhskxx jhskxx : jhskxxs) {
                        EsbJhskxx esbJhskxx = new EsbJhskxx();
                        esbJhskxx.setJthtbm(con_unitconcode);//集团合同编码
                        esbJhskxx.setHtbm(jhskxx.getHtcode());//合同编码
                        esbJhskxx.setJhskhid(jhskxx.getPk_htgjzbslave3());//计划收款行id
                        esbJhskxx.setXdfdfbm(jhskxx.getCounterpartcode());//相对方编码
                        esbJhskxx.setXdfdfmc(jhskxx.getCounterpartname());//相对方名称
                        esbJhskxx.setYjskrq(jhskxx.getExpectpaydate());//预计收款日期
                        esbJhskxx.setYjskje(jhskxx.getDef2());//预计收款金额
                        esbJhskxx.setYjskbz(getDefdocName(jhskxx.getDef3()));//预计收款币种
                        esbJhskxx.setYjskhtbzzsje(jhskxx.getDef4());//预计收款合同币种折算金额
                        esbJhskxx.setSsyxx(jhskxx.getDef20());//数据有效性
                        esbJhskxx.setYjskjdms(jhskxx.getExpectdescribe());//预计收款节点描述
                        lstEsbJhskxx.add(esbJhskxx);
                    }
                }
                //实际收款信息
                Sjskxx[] sjskxxs = (Sjskxx[]) aggHtgjzbMasterVO.getChildren(Sjskxx.class);
                List<EsbSjskxxs> lstEsbSjskxxs = new ArrayList<EsbSjskxxs>();
                if (sjskxxs != null) {
                    for (Sjskxx sjskxx : sjskxxs) {
                        EsbSjskxxs esbSjskxxs = new EsbSjskxxs();
                        esbSjskxxs.setJthtbm(con_unitconcode);//集团合同编码
                        esbSjskxxs.setHtbm(sjskxx.getHtcode());//合同编码
                        esbSjskxxs.setJhskhid(sjskxx.getJhshkhid());//计划收款id
                        esbSjskxxs.setSjskhid(sjskxx.getSjskhid());//实际收款id
                        esbSjskxxs.setXdfbm(sjskxx.getCounterpartcode());//相对方编码
                        esbSjskxxs.setXdfmc(sjskxx.getCounterpartname());//相对方名称
                        esbSjskxxs.setSjsksj(sjskxx.getActualcollectiontime());//实际收款时间
                        esbSjskxxs.setSjskje(sjskxx.getDef2());//实际收款金额
                        esbSjskxxs.setSjskbz(getDefdocName(sjskxx.getDef3()));//实际收款币种
                        esbSjskxxs.setSjskhtbzzsje(sjskxx.getDef4());//实际收款合同币种折算金额
                        esbSjskxxs.setSjskzsbl(sjskxx.getDef5());//实际收款折算比率
                        esbSjskxxs.setSsyxx(sjskxx.getDef20());//数据有效性
                        esbSjskxxs.setSjskjdms(sjskxx.getActualdescribe());//实际收款节点描述
                        lstEsbSjskxxs.add(esbSjskxxs);
                    }
                }
                //计划付款信息
                Jhfkxx[] jhfkxxs = (Jhfkxx[]) aggHtgjzbMasterVO.getChildren(Jhfkxx.class);
                List<EsbJhfkxx> lstEsbJhfkxx = new ArrayList<EsbJhfkxx>();
                if (jhfkxxs != null) {
                    for (Jhfkxx jhfkxx : jhfkxxs) {
                        EsbJhfkxx esbJhfkxx = new EsbJhfkxx();
                        esbJhfkxx.setJthtbm(con_unitconcode);//集团合同编码
                        esbJhfkxx.setHtbm(jhfkxx.getHtcode());//合同编码
                        esbJhfkxx.setJhfkhid(jhfkxx.getJhfkhid());//计划付款id
                        esbJhfkxx.setXdfbm(jhfkxx.getCounterpartcode());//相对方编码
                        esbJhfkxx.setXdfmc(jhfkxx.getCounterpartname());//相对方名称
                        esbJhfkxx.setYjfkrq(jhfkxx.getExpectpaydate());//预计付款日期
                        esbJhfkxx.setYjfkje(jhfkxx.getDef2());//预计付款金额
                        esbJhfkxx.setYjfkbz(getDefdocName(jhfkxx.getDef3()));//预计付款币种
                        esbJhfkxx.setYjfkhtbzzsje(jhfkxx.getDef4());//预计付款合同币种折算金额
                        esbJhfkxx.setYjfkzsbl(jhfkxx.getDef5());//预计付款折算比率
                        esbJhfkxx.setSsyxx(jhfkxx.getDef20());//数据有效性
                        esbJhfkxx.setYjfkjdms(jhfkxx.getExpectpaydescript());//预计付款节点描述
                        lstEsbJhfkxx.add(esbJhfkxx);
                    }
                }
                //实际付款信息
                Sjfkxx[] sjfkxxs = (Sjfkxx[]) aggHtgjzbMasterVO.getChildren(Sjfkxx.class);
                List<EsbSjfkxx> lstEsbSjfkxx = new ArrayList<EsbSjfkxx>();
                if (sjfkxxs != null) {
                    for (Sjfkxx ssjfkxx : sjfkxxs) {
                        EsbSjfkxx esbSjfkxx = new EsbSjfkxx();
                        esbSjfkxx.setJthtbm(con_unitconcode);//集团合同编码
                        esbSjfkxx.setHtbm(ssjfkxx.getHtcode());//合同编码
                        esbSjfkxx.setJhfkhid(ssjfkxx.getJhfkhid());//计划付款id
                        esbSjfkxx.setSjfkhid(ssjfkxx.getSjfkhid());//实际付款行id
                        esbSjfkxx.setXdfbm(ssjfkxx.getOthercode());//相对方编码
                        esbSjfkxx.setXdfmc(ssjfkxx.getOthername());//相对方名称
                        esbSjfkxx.setSjfkrq(ssjfkxx.getActualpaytime());//实际付款日期
                        esbSjfkxx.setSjfksj(ssjfkxx.getActualpaytime());//实际付款时间
                        esbSjfkxx.setSjfkje(ssjfkxx.getDef2());//实际付款金额
                        esbSjfkxx.setSjfkbz(getDefdocName(ssjfkxx.getDef3()));//实际付款币种
                        esbSjfkxx.setSjfkhtbzzsje(ssjfkxx.getDef4());//实际付款合同币种折算金额
                        esbSjfkxx.setSjfkzsbl(ssjfkxx.getDef5());//实际付款折算比率
                        esbSjfkxx.setSsyxx(ssjfkxx.getDef20());//数据有效性
                        esbSjfkxx.setSjfkjdms(ssjfkxx.getActualpaydescript());//实际付款节点描述
                        lstEsbSjfkxx.add(esbSjfkxx);
                    }
                }
                //合同文本信息
                Htwbxx[] htwbxxs = (Htwbxx[]) aggHtgjzbMasterVO.getChildren(Htwbxx.class);
//				List<EsbSjfkxx> lstEsbSjfkxx = new ArrayList<EsbSjfkxx>();
                //构造json
                Map<String, Object> mapObject = new HashMap<String, Object>();
                if (ejbhtjb != null)
                    mapObject.put("htjbxx", ejbhtjb);//合同基本信息
                else
                    mapObject.put("htjbxx", "{}");//合同基本信息

                if (esbxdfxx != null)
                    mapObject.put("xdfxx", esbxdfxx);//相对方信息
                else
                    mapObject.put("xdfxx", "{}");//相对方信息

                if (lstEsbXmxx.size() > 0)
                    mapObject.put("xmxx", lstEsbXmxx);//项目信息
                else
                    mapObject.put("xmxx", "[{}]");//项目信息

                if (lstEsbYsxx.size() > 0)
                    mapObject.put("ysxxcj", lstEsbYsxx);//预算信息
                else
                    mapObject.put("ysxxcj", "[{}]");//预算信息

                if (lstEsbJhskxx.size() > 0)
                    mapObject.put("jhskxx", lstEsbJhskxx);//计划收款信息
                else
                    mapObject.put("jhskxx", "[{}]");//计划收款信息

                if (lstEsbSjskxxs.size() > 0)
                    mapObject.put("sjskxx", lstEsbSjskxxs);//实际收款信息
                else
                    mapObject.put("sjskxx", "[{}]");//实际收款信息

                if (lstEsbJhfkxx.size() > 0)
                    mapObject.put("jhfkxx", lstEsbJhfkxx);//计划付款信息
                else
                    mapObject.put("jhfkxx", "[{}]");//计划付款信息

                if (lstEsbSjfkxx.size() > 0)
                    mapObject.put("sjfkxx", lstEsbSjfkxx);//实际付款信息
                else
                    mapObject.put("sjfkxx", "[{}]");//实际付款信息


                JSONObject jsonObj = new JSONObject(mapObject);
                System.out.println(jsonObj.toJSONString());
                // 发送前日志
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String sqlLogs = "insert into interfaceLogs \n" +
                        "values ('合同关键指标说明ESB','HTGJZB','参数拼接结果','" + jsonObj + "','','" + dateFormat.format(date) + "')";
                getBaseDAO().executeUpdate(sqlLogs);
                //发送数据
                JSONObject jsonresult = QueryTools.request(url, HttpMethod.POST, jsonObj);
                if (jsonresult != null) {
//                    JSONObject parse = JSONObject.parseObject("{\"xdfxx\":{\"msg\":\"相对方信息采集成功，data数据为集团合同编码\",\"code\":200,\"flag\":true,\"data\":\"0255202307D019741\"},\"ysxxcj\":[{\"msg\":\"参数异常：集团合同编码不能为空\",\"code\":500,\"flag\":false}],\"jhskxx\":[{\"msg\":\"参数异常：集团合同编码不能为空\",\"code\":500,\"flag\":false}],\"sjskxx\":[{\"msg\":\"参数异常：集团合同编码不能为空\",\"code\":500,\"flag\":false}],\"htjbxx\":{\"msg\":\"合同基本信息采集成功，下一步提交相对方信息，并且返回集团合同编码\",\"code\":502,\"flag\":true},\"jhfkxx\":[{\"msg\":\"参数异常：集团合同编码不能为空\",\"code\":500,\"flag\":false}],\"xmxx\":[{\"msg\":\"参数异常：集团合同编码不能为空\",\"code\":500,\"flag\":false}],\"sjfkxx\":[{\"msg\":\"参数异常：集团合同编码不能为空\",\"code\":500,\"flag\":false}]}");
                    rewriteJTHTBM(jsonresult, service, aggHtgjzbMasterVO, htgjzb);
                    result = jsonresult.toJSONString();
                } else {
                    result = "接口调用失败";
                }

                sqlLogs = "insert into interfaceLogs \n" +
                        "values ('合同关键指标说明ESB','HTGJZB','" + url + "','" + jsonObj + "','" + result + "','" + dateFormat.format(date) + "')";
                getBaseDAO().executeUpdate(sqlLogs);

            }
        }
        return result;

    }

    static BaseDAO dao = null;

    /**
     * 获取basedao
     *
     * @return
     */
    public static BaseDAO getBaseDAO() {
        if (dao == null) {
            dao = new BaseDAO();
        }
        return dao;
    }

    private String getDefdocName(String pk_defdoc) throws DAOException {
        String sql = getQueryDefdocSql(pk_defdoc);
        String name = "";
        name = (String) dao.executeQuery(sql, new ColumnProcessor());
        return name;
    }

    private String getQueryDefdocSql(String pk_defdoc) {
        //
        String sql = "SELECT T.CODE FROM BD_DEFDOC T WHERE T.PK_DEFDOC = '" + pk_defdoc + "'";
        return sql;
    }

    private String getCountryName(String pk_defdoc) throws DAOException {
        String sql = getQueryCountrySql(pk_defdoc);
        String name = "";
        name = (String) dao.executeQuery(sql, new ColumnProcessor());
        return name;
    }

    private String getQueryCountrySql(String pk_defdoc) {
        //
        String sql = "SELECT T.CODE FROM BD_COUNTRYZONE T WHERE T.PK_COUNTRY = '" + pk_defdoc + "'";
        return sql;
    }

    private void rewriteJTHTBM(JSONObject jsonResult, IHtgjzbMasterVOService service, AggHtgjzbMasterVO aggHtgjzbMasterVO, HtgjzbMasterVO htgjzb) throws DAOException {
        // 1. 获取向对方信息
        JSONObject xdfxx = jsonResult.getJSONObject("xdfxx");
        String sqlLogs = "insert into interfaceLogs \n" +
                "values ('合同关键指标说明ESB','HTGJZB','回写前日志','" + jsonResult.toJSONString() + "','','')";
        getBaseDAO().executeUpdate(sqlLogs);
        if (null != xdfxx) {

            // 2. 获取合同号判断
            String data = xdfxx.getString("data") == null ? "" : xdfxx.getString("data");

            // 3. 回写到合同表头
            if (!data.equals("")) {
                try {
                    htgjzb.setCode(data);
                    aggHtgjzbMasterVO.setParent(htgjzb);
                    service.saveAggHtgjzbMasterVO(aggHtgjzbMasterVO);
                } catch (nc.vo.pub.BusinessException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}