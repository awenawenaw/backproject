package nc.itf.pmbd.htgjzb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;

import nc.bs.dao.DAOException;
import nc.jdbc.framework.processor.ColumnProcessor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class QueryTools {
    static BaseDAO dao = null;

    public static Map<String, Object> perQueryAuth() {
        // 每次请求前，先做认证请求，返回的entCode（公司唯一编码）、tokenId（本次登录有效的临时令牌）
        //String url = RequestUrlConstants.TOKEN_URL;
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("appId", RequestUrlConstants.APPID);
        //map.put("appSecret", RequestUrlConstants.APPSECRET);
        //map.put("permanentCode", RequestUrlConstants.PERMANENTCODE);
        ResponseEntity<String> result = null;
        try {
            result = restTemplate.postForEntity("url", map,
                    String.class);
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (result == null) {
            return null;
        }
        JSONObject jsonObject = (JSONObject) JSONObject.parse(result.getBody());
        return jsonObject;
    }

    /**
     * @param url         请求url
     * @param requestType 请求方式 ：get和post
     * @param params      如果是post请求需要传请求参数，get请求传null
     * @return
     */
    public static JSONObject request(String url, HttpMethod requestType, JSONObject params) {
        RestTemplate restTemplate = new RestTemplate();
        // 获取请求前认证数据
//		Map<String,Object> obj = new AuthenticationCRM().getAuthMsg();
////		HttpHeaders headers = new HttpHeaders();
//		params.put("corpAccessToken", (String) obj.get("corpAccessToken"));
//		params.put("corpId", (String) obj.get("corpId"));
//		params.put("currentOpenUserId",RequestUrlConstants.USERID);

        JSONObject json = new JSONObject(params);
        //将入参报文中数组[]前后的双引号去掉
        String jsonstr = json.toJSONString().replace("\"[", "[");
        String json1 = jsonstr.replace("]\"", "]");

        JSONObject jsonnew = (JSONObject) JSONObject.parse(json1);

        ResponseEntity<String> result = null;
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sqlLogs = "insert into interfaceLogs \n" +
                    "values ('合同关键指标说明ESB','HTGJZB','请求前参数','" + jsonnew + "','','" + dateFormat.format(date) + "')";
            getBaseDAO().executeUpdate(sqlLogs);

            result = restTemplate.postForEntity(url, jsonnew, String.class);

            sqlLogs = "insert into interfaceLogs \n" +
                    "values ('合同关键指标说明ESB','HTGJZB','请求后参数及结果','" + jsonnew + "','" + result + "','" + dateFormat.format(date) + "')";
            getBaseDAO().executeUpdate(sqlLogs);

        } catch (Exception e) {
            e.printStackTrace();
            JSONObject j = JSONObject.parseObject("{\"message\":\"" + e.getMessage().replace("\"", "") + "\"}");
            return j;
        }
        if (result == null) {
            return null;
        }
        JSONObject jsonObject = (JSONObject) JSONObject.parse(result.getBody());
        return jsonObject;
    }

    public static BaseDAO getBaseDAO() {
        if (dao == null) {
            dao = new BaseDAO();
        }
        return dao;
    }


}
