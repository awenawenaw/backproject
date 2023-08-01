package ncclould.api.pmdbd.usermanage.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONString;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import nccloud.api.rest.utils.ResultMessageUtil;
import nccloud.ws.rest.resource.AbstractNCCRestResource;

@Path("pmbd/usermanage/UserInfo")
public class UserInfoRescources extends AbstractNCCRestResource {

    @Override
    public String getModule() {
        // TODO Auto-generated method stub
        return "pmbd";
    }

    @POST
    @Path("/getUserInfo")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public JSONString getUserInfo(JSONString userCode) {
        JSONObject jObject = JSON.parseObject(userCode.toJSONString());
        jObject.put("result", "success");
        return ResultMessageUtil.toJSON(jObject);
    }
}
