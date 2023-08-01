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
        // ÿ������ǰ��������֤���󣬷��ص�entCode����˾Ψһ���룩��tokenId�����ε�¼��Ч����ʱ���ƣ�
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
     * @param url         ����url
     * @param requestType ����ʽ ��get��post
     * @param params      �����post������Ҫ�����������get����null
     * @return
     */
    public static JSONObject request(String url, HttpMethod requestType, JSONObject params) {
        RestTemplate restTemplate = new RestTemplate();
        // ��ȡ����ǰ��֤����
//		Map<String,Object> obj = new AuthenticationCRM().getAuthMsg();
////		HttpHeaders headers = new HttpHeaders();
//		params.put("corpAccessToken", (String) obj.get("corpAccessToken"));
//		params.put("corpId", (String) obj.get("corpId"));
//		params.put("currentOpenUserId",RequestUrlConstants.USERID);

        JSONObject json = new JSONObject(params);
        //����α���������[]ǰ���˫����ȥ��
        String jsonstr = json.toJSONString().replace("\"[", "[");
        String json1 = jsonstr.replace("]\"", "]");

        JSONObject jsonnew = (JSONObject) JSONObject.parse(json1);

        ResponseEntity<String> result = null;
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sqlLogs = "insert into interfaceLogs \n" +
                    "values ('��ͬ�ؼ�ָ��˵��ESB','HTGJZB','����ǰ����','" + jsonnew + "','','" + dateFormat.format(date) + "')";
            getBaseDAO().executeUpdate(sqlLogs);

            result = restTemplate.postForEntity(url, jsonnew, String.class);

            sqlLogs = "insert into interfaceLogs \n" +
                    "values ('��ͬ�ؼ�ָ��˵��ESB','HTGJZB','�������������','" + jsonnew + "','" + result + "','" + dateFormat.format(date) + "')";
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
