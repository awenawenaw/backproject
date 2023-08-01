package nccloud.api.pmbd.deptmanage.dept;

import com.alibaba.fastjson.JSONObject;
import nccloud.api.rest.utils.ResultMessageUtil;
import nccloud.ws.rest.resource.AbstractNCCRestResource;
import org.json.JSONString;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("pmdb/deptmanage/DeptInfo")
public class DeptinfoResources extends AbstractNCCRestResource {

    @Override
    public String getModule() {
        return "pmdb";
    }

    @POST
    @Path("/getDeptInfo")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public JSONString getDeptInfo(JSONString deptcode){
        JSONObject jObject = JSONObject.parseObject(deptcode.toJSONString());
        jObject.put("result","success");
        return ResultMessageUtil.toJSON(jObject);
    }
}
