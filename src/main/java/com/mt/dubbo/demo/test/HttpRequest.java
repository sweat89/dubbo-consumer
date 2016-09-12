package com.mt.dubbo.demo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.apache.commons.codec.digest.Md5Crypt;

import net.sf.json.JSONObject;

public class HttpRequest {
    /**
     * ��ָ��URL����GET����������
     * 
     * @param url
     *            ���������URL
     * @param param
     *            ��������������Ӧ���� name1=value1&name2=value2 ����ʽ��
     * @return URL ����Զ����Դ����Ӧ���
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            URLConnection connection = realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.connect();
            Map<String, List<String>> map = connection.getHeaderFields();
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // ���� BufferedReader����������ȡURL����Ӧ
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        // ʹ��finally�����ر�������
        finally {
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

    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            out.print(param);
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    public static void send() throws UnsupportedEncodingException {
        String url = "http://203.156.234.123/sendSms.asp";
        // String url = "http://203.156.234.123/getReport.asp";
        String account = "szxn";
        String password = "Abcd1234";
        String phones = "18688736814";
        String content = URLEncoder.encode("【小牛在线】尊敬的客户：您于2016-01-20 01:27:35购买了CreateByLr26865-10,购买金额为：100元。退订回N",
                "gb2312");
        String channel = "1";
        String request = "account=" + account + "&password=" + password + "&phones=" + phones + "&content=" + content
                + "&channel=" + channel;
        // String request = "account=" + account + "&password=" + password + "&Time=20160302";
        String ret1 = HttpRequest.sendGet(url, request);
        System.out.println(ret1 + "===" + Thread.currentThread().getName());

        // ���� POST ����

    }

    public static void main(String[] args) throws JAXBException, IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.accumulate("enterpriseID", "16851");
        jsonObject.accumulate("loginName", "admin");
        String pass = Md5Crypt.md5Crypt("xnzx1213".getBytes()).toLowerCase();
        System.out.println(pass);
        jsonObject.accumulate("password", "9d7f8c3067de619a574a46fb6fb834fa");
        jsonObject.accumulate("content", "test");
        jsonObject.accumulate("mobiles", "18688736814");

        String url = "http://58.251.49.114/sendSMS.action";
        System.out.println(jsonObject.toString());
        String params = "enterpriseID=16851&loginName=admin&password=9d7f8c3067de619a574a46fb6fb834fa&content=您的手机验证码是829375，请及时输入！&mobiles=18688736814";

        // String json = sendPost(url, params);
        System.out.println(Md5Crypt.md5Crypt("xnzx1213".getBytes()).toLowerCase());
        // SmsSendResult4Ems sms = OxmUtil.fromXML(SmsSendResult4Ems.class, json);
        // System.out.println(json);
        // JSONObject obj = JSONObject.fromObject(json);
        // System.out.println(obj.get("error"));
    }

}
