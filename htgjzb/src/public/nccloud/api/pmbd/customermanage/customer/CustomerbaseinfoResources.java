package nccloud.api.pmbd.customermanage.customer;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONString;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import nc.bs.framework.common.NCLocator;
import nc.itf.bd.cust.pf.ICustomerPfQueryService;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.cust.pf.AggCustomerPfVO;
import nc.vo.bd.cust.pf.CustomerPfVO;
import nc.vo.pub.BusinessException;
import nc.ws.opm.pub.utils.result.APIErrInfoUtil;
import nccloud.api.rest.utils.ResultMessageUtil;
import nccloud.ws.rest.resource.AbstractNCCRestResource;

@Path("pmbd/customermanage/baseinfo")
public class CustomerbaseinfoResources extends AbstractNCCRestResource {
    @Override
    public String getModule() {
        return "pmbd";
    }

    @POST
    @Path("/getCustomerbaseinfo")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public JSONString getCustomerbaseinfo(JSONString json) {
        JSONObject jObject = JSON.parseObject(json.toJSONString());
        if (jObject == null) {
            return ResultMessageUtil.exceptionToJSON(new NullPointerException("JSONString:null"));
        }
        if (jObject.get("ufinterface") == null) {
            return ResultMessageUtil.exceptionToJSON(new NullPointerException("ufinterface:null"));
        }
        JSONObject object = jObject.getJSONObject("ufinterface");
        String pk_org = (String) object.getOrDefault("pk_org", "");
        String billnumber = (String) object.getOrDefault("billnumber", "");
        try {
            String customerPfPk = getCustomerPfPk(pk_org, billnumber);
            AggCustomerPfVO vo = getCustomerPfService().queryVOByPk(customerPfPk);
            if (vo == null) {
                BusinessException e = new BusinessException("根据业务单元主键和客户申请单编码未查询到对应的客户申请单！");
                return ResultMessageUtil.exceptionToJSON(APIErrInfoUtil.getCode(e), APIErrInfoUtil.getErrMsg(e));
            }
            CustomerVO customerinfo = (CustomerVO) ((CustomerPfVO) vo.getParentVO()).getCustomerinfo();
            JSONObject returnJson = new JSONObject();
            returnJson.put("pk_org", pk_org);
            returnJson.put("billnumber", billnumber);
            returnJson.put("customerbaseinfo", customerinfo);
            return ResultMessageUtil.toJSON(returnJson);
        } catch (BusinessException e) {
            return ResultMessageUtil.exceptionToJSON(APIErrInfoUtil.getCode(e), APIErrInfoUtil.getErrMsg(e));
        }
    }

    private String getCustomerPfPk(String pk_org, String billnumber) throws BusinessException {
        String sql = "select pk_customerpf from bd_customer_pf where isnull(dr, 0) = 0 and pk_org = '"
                + pk_org + "' and billnumber = '" + billnumber + "'";
        String customerPfPk = (String) getQueryService().executeQuery(sql, new ColumnProcessor());
        return customerPfPk;
    }

    public IUAPQueryBS getQueryService() {
        return NCLocator.getInstance().lookup(IUAPQueryBS.class);
    }

    public ICustomerPfQueryService getCustomerPfService() {
        return NCLocator.getInstance().lookup(ICustomerPfQueryService.class);
    }
}