package nc.itf.pmbd.htgjzb.utils;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.net.HttpURLConnection;;


public class HttpHelper {

    public static String sendGet(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realurl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) realurl.openConnection();
//            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "gbk"));
            String line;
            while ((line = in.readLine()) != null) {

                result += line;


            }
        } catch (Exception e) {
            System.out.println("");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    public static String sendGetID(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realurl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) realurl.openConnection();
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "gbk"));
            String line;
            while ((line = in.readLine()) != null) {
                line = line.replace(" ", "");
                if (line.contains("\"id\":")) {
                    result += line;
                }
            }
        } catch (Exception e) {
            System.out.println("");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "{" + result + "}";
    }


    public static String sendPost(String url, String params) {
        String encoding = "UTF-8";
        String result = "";
        BufferedReader in = null;
        try {
            byte[] data = params.getBytes(encoding);
            URL base_url = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) base_url.openConnection();
            //conn.setReadTimeout(5000);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
//            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
//          	con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
//            conn.setRequestProperty("access_token", params);
            OutputStream outStream = conn.getOutputStream();
            outStream.write(data);
            outStream.flush();
            outStream.close();
            //System.out.println(conn.getResponseCode());
            result = conn.getResponseCode() + "";
            if (conn.getResponseCode() == 200) {
                in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                String line;
                while ((line = in.readLine()) != null) {
                    result += line;
                }
            }
        } catch (Exception e) {
            System.out.println("“Ï≥£:" + e);
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}