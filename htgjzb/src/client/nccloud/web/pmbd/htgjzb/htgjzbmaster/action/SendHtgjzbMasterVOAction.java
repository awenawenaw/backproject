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
 * ���� action�����ӡ�������form��
 */
public class SendHtgjzbMasterVOAction extends BaseAction {

    @Override
    public Object doAction(IRequest request, RequstParamWapper paramWapper) throws Throwable {
        RequestDTO param = VOTransform.toVO(paramWapper.requestString, RequestDTO.class);
        Map<String, String> tsMap = param.getTsMap();

        if (tsMap == null || tsMap.size() == 0) {
            throw new BusinessException("ͨ��getTsMap()��ȡpk��ts��ɵ�Map������Ϊ����ʱδ��ȡ�����봫��tsMap");
        }

        IHtgjzbMasterVOService service = ServiceLocator.find(IHtgjzbMasterVOService.class);
        AggHtgjzbMasterVO[] vos = service.loadAggHtgjzbMasterVOs(tsMap);
        String result = "";
        //��ȡ���ñ��еĽӿڵ�ַ
        String sql = "select interfaceName,interfaceUrl from interfaceConfig where interfaceName= '��ͬ�ؼ�ָ��˵��ESB'";
        List<Object[]> interfaceData = (List<Object[]>) getBaseDAO().executeQuery(sql, new ArrayListProcessor());
        String url = "";
        if (interfaceData == null) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sqlLogs = "insert into interfaceLogs \n" +
                    "values ('��ͬ�ؼ�ָ��˵��ESB','HTGJZB','" + url + "','�ӿڵ�ַΪ��',''," + dateFormat.format(date) + ")";
            int i = getBaseDAO().executeUpdate(sqlLogs);
            return "�ӿڵ�ַΪ��";
        }
        url = (String) interfaceData.get(0)[1];
        if (vos != null) {
            for (AggHtgjzbMasterVO aggHtgjzbMasterVO : vos) {
                //����
                HtgjzbMasterVO htgjzb = (HtgjzbMasterVO) aggHtgjzbMasterVO.getParent();
                EsbHtjb ejbhtjb = new EsbHtjb();
                String con_unitconcode = htgjzb.getCode() == null ? "" : htgjzb.getCode();
                ejbhtjb.setCon_unitconcode(con_unitconcode);//��ͬ������
                ejbhtjb.setCon_concode(htgjzb.getHtcode());//��ͬ����
                ejbhtjb.setCon_conname(htgjzb.getHtname());//��ͬ����
                ejbhtjb.setCon_unitcode(htgjzb.getUnitcode());//������λ����
                ejbhtjb.setCon_unitname(htgjzb.getUnitname());//������λ����
                ejbhtjb.setSecend_dept_code(htgjzb.getSecondunitcode());//����������λ��
                ejbhtjb.setSecend_dept_name(htgjzb.getSecondunitname());//����������λ����
                ejbhtjb.setQsrxm(htgjzb.getSignedname());//ǩ��������
                ejbhtjb.setCon_creddebrt(getDefdocName(htgjzb.getVdef1()));//��֧����
                ejbhtjb.setHtejlb(getDefdocName(htgjzb.getVdef2()));//��ͬ�������
                ejbhtjb.setHtsjlb(htgjzb.getHtrealtype());//��ͬʵ�����
                ejbhtjb.setHtfbsx(getDefdocName(htgjzb.getVdef3()));//��ͬ��������
                ejbhtjb.setFbbh(htgjzb.getModelcode());//�������
                ejbhtjb.setCon_conlevel(getDefdocName(htgjzb.getVdef4()));//��ͬ����
                ejbhtjb.setHtsscybk(getDefdocName(htgjzb.getVdef5()));//��ͬ������ҵ���
                ejbhtjb.setSscybkxly(htgjzb.getIndustrialsector());//������ҵ���������
                ejbhtjb.setJprwsx(htgjzb.getMilitaryattr());//J��Ʒ��������
                ejbhtjb.setSfckht(getDefdocName(htgjzb.getVdef7()));//�Ƿ񳨿ں�ͬ
                ejbhtjb.setSfbght(getDefdocName(htgjzb.getVdef8()));//�Ƿ�����ͬ
                ejbhtjb.setCon_convalue(htgjzb.getVdef9());//��ͬ���
                ejbhtjb.setCon_concur(getDefdocName(htgjzb.getVdef10()));//��ͬ����
                ejbhtjb.setCon_contarcontspec(htgjzb.getHtdescription());//��ͬ���
                ejbhtjb.setCon_inspprice(getDefdocName(htgjzb.getVdef12()));//�۸�ȷ������
                ejbhtjb.setCon_conconfilevel(getDefdocName(htgjzb.getVdef13()));//��ͬ�ܼ�
                ejbhtjb.setCon_constatus(getDefdocName(htgjzb.getVdef14()));//��ͬ״̬
                ejbhtjb.setHtqdrq(htgjzb.getHtsigningdate());//��ͬǩ������
                ejbhtjb.setHtjsrq(htgjzb.getHtenddate());//��ͬ��������
                ejbhtjb.setHttjsprq(htgjzb.getHtsubmitdate());//��ͬ�ύ��������
                ejbhtjb.setHtsptgrq(htgjzb.getHtapprdate());//��ͬ����ͨ������
                ejbhtjb.setHtbjsj(htgjzb.getHtcompletdate());//��ͬ���ʱ��
                ejbhtjb.setSsyxx(htgjzb.getDatavalidation());//������Ч��
                ejbhtjb.setHtsxrq(htgjzb.getHteffectivedate());//��ͬ��Ч����
                ejbhtjb.setKjxy(getDefdocName(htgjzb.getVdef6()));//���Э��
                //ejbhtjb.setGlkjxybh();//
//				ejbhtjb.setXscpbh(htgjzb.);//���۲�Ʒ���
//				ejbhtjb.setXscpmc(htgjzb.);//���۲�Ʒ����
                //�ӱ�
                //��Է���Ϣ
                Xdfxx[] xdfxxs = (Xdfxx[]) aggHtgjzbMasterVO.getChildren(Xdfxx.class);
                EsbXdfxx esbxdfxx = new EsbXdfxx();
//                List<EsbXdfxx> lstEsbXdfxx = new ArrayList<EsbXdfxx>();
                if (xdfxxs != null) {
                    for (Xdfxx xdfxx : xdfxxs) {
                        esbxdfxx.setJthtbm(con_unitconcode);//��ͬ�����ݱ���
                        esbxdfxx.setHtbm(xdfxx.getHtcode());//��ͬ����
                        esbxdfxx.setXdfbm(xdfxx.getCounterpartcode());//��Է�����
                        esbxdfxx.setXdfmc(xdfxx.getCounterpartname());//��Է�����
                        esbxdfxx.setDfztdw(getDefdocName(xdfxx.getDef1()));//�Է������λ
                        esbxdfxx.setWfztdw(getDefdocName(xdfxx.getDef2()));//�ҷ������λ
                        esbxdfxx.setXdflbdm(xdfxx.getCounterparttype());//��Է�������
                        esbxdfxx.setXdfksdwdm(xdfxx.getCounterpartunit());//��Է�������λ����
                        esbxdfxx.setXdfgb(getCountryName(xdfxx.getDef3()));//��Է�����
                        esbxdfxx.setXdftxdz(xdfxx.getCounterpartaddr());//��Է�ͨѶ��ַ
                        esbxdfxx.setDfnsrsbh(xdfxx.getTaxnumber());//�Է���˰��ʶ���
                        esbxdfxx.setDfkhhmc(xdfxx.getOtherbankname());//�Է�����������
                        esbxdfxx.setDfkhhzh(xdfxx.getOtherbankaccount());//�Է��������˻�
                        esbxdfxx.setWfkhhmc(xdfxx.getWebankname());//�ҷ�����������
                        esbxdfxx.setWfkhhzh(xdfxx.getWebankaccount());//�ҷ��������˻�
                        esbxdfxx.setSsyxx(xdfxx.getDatavalid());//������Ч��
                        esbxdfxx.setCon_unitcode(xdfxx.getUnitcode());//������λ����
//                        lstEsbXdfxx.add(esbxdfxx);
                    }
                }
                //��Ŀ��Ϣ
                xXmxx[] xXmxxs = (xXmxx[]) aggHtgjzbMasterVO.getChildren(xXmxx.class);
                List<EsbXmxx> lstEsbXmxx = new ArrayList<EsbXmxx>();
                if (xXmxxs != null) {
                    for (xXmxx xmxx : xXmxxs) {
                        EsbXmxx esbXmxx = new EsbXmxx();
                        esbXmxx.setJthtbm(con_unitconcode);//���ź�ͬ����
                        esbXmxx.setHtbm(xmxx.getHtcode());//��ͬ����
                        esbXmxx.setXmbm(xmxx.getProjectcode());//��Ŀ����
                        esbXmxx.setXmssgs(xmxx.getProjectcompany());//��Ŀ������˾
                        esbXmxx.setXmfl(xmxx.getProjectsort());//��Ŀ����
                        esbXmxx.setXmmc(xmxx.getProjectname());//��Ŀ����
                        esbXmxx.setHtzyxmje(xmxx.getDef1());//��ͬռ����Ŀ���
                        esbXmxx.setLxpfje(xmxx.getDef2());//�����������
                        esbXmxx.setXmzt(getDefdocName(xmxx.getDef3()));//��Ŀ״̬
                        esbXmxx.setSsyxx(xmxx.getDef20());//������Ч��
                        lstEsbXmxx.add(esbXmxx);
                    }
                }
                //Ԥ����Ϣ
                Ysxx[] ysxxs = (Ysxx[]) aggHtgjzbMasterVO.getChildren(Ysxx.class);
                List<EsbYsxx> lstEsbYsxx = new ArrayList<EsbYsxx>();
                if (ysxxs != null) {
                    for (Ysxx ysxx : ysxxs) {
                        EsbYsxx esbYsxx = new EsbYsxx();
                        esbYsxx.setJthtbm(con_unitconcode);//��ͬ�����ݱ���
                        esbYsxx.setHtbm(ysxx.getHtcode());//��ͬ����
                        esbYsxx.setYslsh(ysxx.getBudgetnum());//Ԥ����ˮ��
                        esbYsxx.setYsssxmbh(ysxx.getBudgetprocode());//Ԥ��������Ŀ����
                        esbYsxx.setYsnd(ysxx.getDef2());//Ԥ�����
                        esbYsxx.setNdysje(ysxx.getDef1());//���Ԥ����
                        esbYsxx.setSsyxx(ysxx.getDef20());//������Ч��
                        lstEsbYsxx.add(esbYsxx);
                    }
                }
                //�ƻ��տ���Ϣ
                Jhskxx[] jhskxxs = (Jhskxx[]) aggHtgjzbMasterVO.getChildren(Jhskxx.class);
                List<EsbJhskxx> lstEsbJhskxx = new ArrayList<EsbJhskxx>();
                if (jhskxxs != null) {
                    for (Jhskxx jhskxx : jhskxxs) {
                        EsbJhskxx esbJhskxx = new EsbJhskxx();
                        esbJhskxx.setJthtbm(con_unitconcode);//���ź�ͬ����
                        esbJhskxx.setHtbm(jhskxx.getHtcode());//��ͬ����
                        esbJhskxx.setJhskhid(jhskxx.getPk_htgjzbslave3());//�ƻ��տ���id
                        esbJhskxx.setXdfdfbm(jhskxx.getCounterpartcode());//��Է�����
                        esbJhskxx.setXdfdfmc(jhskxx.getCounterpartname());//��Է�����
                        esbJhskxx.setYjskrq(jhskxx.getExpectpaydate());//Ԥ���տ�����
                        esbJhskxx.setYjskje(jhskxx.getDef2());//Ԥ���տ���
                        esbJhskxx.setYjskbz(getDefdocName(jhskxx.getDef3()));//Ԥ���տ����
                        esbJhskxx.setYjskhtbzzsje(jhskxx.getDef4());//Ԥ���տ��ͬ����������
                        esbJhskxx.setSsyxx(jhskxx.getDef20());//������Ч��
                        esbJhskxx.setYjskjdms(jhskxx.getExpectdescribe());//Ԥ���տ�ڵ�����
                        lstEsbJhskxx.add(esbJhskxx);
                    }
                }
                //ʵ���տ���Ϣ
                Sjskxx[] sjskxxs = (Sjskxx[]) aggHtgjzbMasterVO.getChildren(Sjskxx.class);
                List<EsbSjskxxs> lstEsbSjskxxs = new ArrayList<EsbSjskxxs>();
                if (sjskxxs != null) {
                    for (Sjskxx sjskxx : sjskxxs) {
                        EsbSjskxxs esbSjskxxs = new EsbSjskxxs();
                        esbSjskxxs.setJthtbm(con_unitconcode);//���ź�ͬ����
                        esbSjskxxs.setHtbm(sjskxx.getHtcode());//��ͬ����
                        esbSjskxxs.setJhskhid(sjskxx.getJhshkhid());//�ƻ��տ�id
                        esbSjskxxs.setSjskhid(sjskxx.getSjskhid());//ʵ���տ�id
                        esbSjskxxs.setXdfbm(sjskxx.getCounterpartcode());//��Է�����
                        esbSjskxxs.setXdfmc(sjskxx.getCounterpartname());//��Է�����
                        esbSjskxxs.setSjsksj(sjskxx.getActualcollectiontime());//ʵ���տ�ʱ��
                        esbSjskxxs.setSjskje(sjskxx.getDef2());//ʵ���տ���
                        esbSjskxxs.setSjskbz(getDefdocName(sjskxx.getDef3()));//ʵ���տ����
                        esbSjskxxs.setSjskhtbzzsje(sjskxx.getDef4());//ʵ���տ��ͬ����������
                        esbSjskxxs.setSjskzsbl(sjskxx.getDef5());//ʵ���տ��������
                        esbSjskxxs.setSsyxx(sjskxx.getDef20());//������Ч��
                        esbSjskxxs.setSjskjdms(sjskxx.getActualdescribe());//ʵ���տ�ڵ�����
                        lstEsbSjskxxs.add(esbSjskxxs);
                    }
                }
                //�ƻ�������Ϣ
                Jhfkxx[] jhfkxxs = (Jhfkxx[]) aggHtgjzbMasterVO.getChildren(Jhfkxx.class);
                List<EsbJhfkxx> lstEsbJhfkxx = new ArrayList<EsbJhfkxx>();
                if (jhfkxxs != null) {
                    for (Jhfkxx jhfkxx : jhfkxxs) {
                        EsbJhfkxx esbJhfkxx = new EsbJhfkxx();
                        esbJhfkxx.setJthtbm(con_unitconcode);//���ź�ͬ����
                        esbJhfkxx.setHtbm(jhfkxx.getHtcode());//��ͬ����
                        esbJhfkxx.setJhfkhid(jhfkxx.getJhfkhid());//�ƻ�����id
                        esbJhfkxx.setXdfbm(jhfkxx.getCounterpartcode());//��Է�����
                        esbJhfkxx.setXdfmc(jhfkxx.getCounterpartname());//��Է�����
                        esbJhfkxx.setYjfkrq(jhfkxx.getExpectpaydate());//Ԥ�Ƹ�������
                        esbJhfkxx.setYjfkje(jhfkxx.getDef2());//Ԥ�Ƹ�����
                        esbJhfkxx.setYjfkbz(getDefdocName(jhfkxx.getDef3()));//Ԥ�Ƹ������
                        esbJhfkxx.setYjfkhtbzzsje(jhfkxx.getDef4());//Ԥ�Ƹ����ͬ����������
                        esbJhfkxx.setYjfkzsbl(jhfkxx.getDef5());//Ԥ�Ƹ����������
                        esbJhfkxx.setSsyxx(jhfkxx.getDef20());//������Ч��
                        esbJhfkxx.setYjfkjdms(jhfkxx.getExpectpaydescript());//Ԥ�Ƹ���ڵ�����
                        lstEsbJhfkxx.add(esbJhfkxx);
                    }
                }
                //ʵ�ʸ�����Ϣ
                Sjfkxx[] sjfkxxs = (Sjfkxx[]) aggHtgjzbMasterVO.getChildren(Sjfkxx.class);
                List<EsbSjfkxx> lstEsbSjfkxx = new ArrayList<EsbSjfkxx>();
                if (sjfkxxs != null) {
                    for (Sjfkxx ssjfkxx : sjfkxxs) {
                        EsbSjfkxx esbSjfkxx = new EsbSjfkxx();
                        esbSjfkxx.setJthtbm(con_unitconcode);//���ź�ͬ����
                        esbSjfkxx.setHtbm(ssjfkxx.getHtcode());//��ͬ����
                        esbSjfkxx.setJhfkhid(ssjfkxx.getJhfkhid());//�ƻ�����id
                        esbSjfkxx.setSjfkhid(ssjfkxx.getSjfkhid());//ʵ�ʸ�����id
                        esbSjfkxx.setXdfbm(ssjfkxx.getOthercode());//��Է�����
                        esbSjfkxx.setXdfmc(ssjfkxx.getOthername());//��Է�����
                        esbSjfkxx.setSjfkrq(ssjfkxx.getActualpaytime());//ʵ�ʸ�������
                        esbSjfkxx.setSjfksj(ssjfkxx.getActualpaytime());//ʵ�ʸ���ʱ��
                        esbSjfkxx.setSjfkje(ssjfkxx.getDef2());//ʵ�ʸ�����
                        esbSjfkxx.setSjfkbz(getDefdocName(ssjfkxx.getDef3()));//ʵ�ʸ������
                        esbSjfkxx.setSjfkhtbzzsje(ssjfkxx.getDef4());//ʵ�ʸ����ͬ����������
                        esbSjfkxx.setSjfkzsbl(ssjfkxx.getDef5());//ʵ�ʸ����������
                        esbSjfkxx.setSsyxx(ssjfkxx.getDef20());//������Ч��
                        esbSjfkxx.setSjfkjdms(ssjfkxx.getActualpaydescript());//ʵ�ʸ���ڵ�����
                        lstEsbSjfkxx.add(esbSjfkxx);
                    }
                }
                //��ͬ�ı���Ϣ
                Htwbxx[] htwbxxs = (Htwbxx[]) aggHtgjzbMasterVO.getChildren(Htwbxx.class);
//				List<EsbSjfkxx> lstEsbSjfkxx = new ArrayList<EsbSjfkxx>();
                //����json
                Map<String, Object> mapObject = new HashMap<String, Object>();
                if (ejbhtjb != null)
                    mapObject.put("htjbxx", ejbhtjb);//��ͬ������Ϣ
                else
                    mapObject.put("htjbxx", "{}");//��ͬ������Ϣ

                if (esbxdfxx != null)
                    mapObject.put("xdfxx", esbxdfxx);//��Է���Ϣ
                else
                    mapObject.put("xdfxx", "{}");//��Է���Ϣ

                if (lstEsbXmxx.size() > 0)
                    mapObject.put("xmxx", lstEsbXmxx);//��Ŀ��Ϣ
                else
                    mapObject.put("xmxx", "[{}]");//��Ŀ��Ϣ

                if (lstEsbYsxx.size() > 0)
                    mapObject.put("ysxxcj", lstEsbYsxx);//Ԥ����Ϣ
                else
                    mapObject.put("ysxxcj", "[{}]");//Ԥ����Ϣ

                if (lstEsbJhskxx.size() > 0)
                    mapObject.put("jhskxx", lstEsbJhskxx);//�ƻ��տ���Ϣ
                else
                    mapObject.put("jhskxx", "[{}]");//�ƻ��տ���Ϣ

                if (lstEsbSjskxxs.size() > 0)
                    mapObject.put("sjskxx", lstEsbSjskxxs);//ʵ���տ���Ϣ
                else
                    mapObject.put("sjskxx", "[{}]");//ʵ���տ���Ϣ

                if (lstEsbJhfkxx.size() > 0)
                    mapObject.put("jhfkxx", lstEsbJhfkxx);//�ƻ�������Ϣ
                else
                    mapObject.put("jhfkxx", "[{}]");//�ƻ�������Ϣ

                if (lstEsbSjfkxx.size() > 0)
                    mapObject.put("sjfkxx", lstEsbSjfkxx);//ʵ�ʸ�����Ϣ
                else
                    mapObject.put("sjfkxx", "[{}]");//ʵ�ʸ�����Ϣ


                JSONObject jsonObj = new JSONObject(mapObject);
                System.out.println(jsonObj.toJSONString());
                // ����ǰ��־
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String sqlLogs = "insert into interfaceLogs \n" +
                        "values ('��ͬ�ؼ�ָ��˵��ESB','HTGJZB','����ƴ�ӽ��','" + jsonObj + "','','" + dateFormat.format(date) + "')";
                getBaseDAO().executeUpdate(sqlLogs);
                //��������
                JSONObject jsonresult = QueryTools.request(url, HttpMethod.POST, jsonObj);
                if (jsonresult != null) {
//                    JSONObject parse = JSONObject.parseObject("{\"xdfxx\":{\"msg\":\"��Է���Ϣ�ɼ��ɹ���data����Ϊ���ź�ͬ����\",\"code\":200,\"flag\":true,\"data\":\"0255202307D019741\"},\"ysxxcj\":[{\"msg\":\"�����쳣�����ź�ͬ���벻��Ϊ��\",\"code\":500,\"flag\":false}],\"jhskxx\":[{\"msg\":\"�����쳣�����ź�ͬ���벻��Ϊ��\",\"code\":500,\"flag\":false}],\"sjskxx\":[{\"msg\":\"�����쳣�����ź�ͬ���벻��Ϊ��\",\"code\":500,\"flag\":false}],\"htjbxx\":{\"msg\":\"��ͬ������Ϣ�ɼ��ɹ�����һ���ύ��Է���Ϣ�����ҷ��ؼ��ź�ͬ����\",\"code\":502,\"flag\":true},\"jhfkxx\":[{\"msg\":\"�����쳣�����ź�ͬ���벻��Ϊ��\",\"code\":500,\"flag\":false}],\"xmxx\":[{\"msg\":\"�����쳣�����ź�ͬ���벻��Ϊ��\",\"code\":500,\"flag\":false}],\"sjfkxx\":[{\"msg\":\"�����쳣�����ź�ͬ���벻��Ϊ��\",\"code\":500,\"flag\":false}]}");
                    rewriteJTHTBM(jsonresult, service, aggHtgjzbMasterVO, htgjzb);
                    result = jsonresult.toJSONString();
                } else {
                    result = "�ӿڵ���ʧ��";
                }

                sqlLogs = "insert into interfaceLogs \n" +
                        "values ('��ͬ�ؼ�ָ��˵��ESB','HTGJZB','" + url + "','" + jsonObj + "','" + result + "','" + dateFormat.format(date) + "')";
                getBaseDAO().executeUpdate(sqlLogs);

            }
        }
        return result;

    }

    static BaseDAO dao = null;

    /**
     * ��ȡbasedao
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
        // 1. ��ȡ��Է���Ϣ
        JSONObject xdfxx = jsonResult.getJSONObject("xdfxx");
        String sqlLogs = "insert into interfaceLogs \n" +
                "values ('��ͬ�ؼ�ָ��˵��ESB','HTGJZB','��дǰ��־','" + jsonResult.toJSONString() + "','','')";
        getBaseDAO().executeUpdate(sqlLogs);
        if (null != xdfxx) {

            // 2. ��ȡ��ͬ���ж�
            String data = xdfxx.getString("data") == null ? "" : xdfxx.getString("data");

            // 3. ��д����ͬ��ͷ
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