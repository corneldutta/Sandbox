package utils;

import java.util.HashMap;

public class Headers {

    public static HashMap<String, String> authToken(){
        HashMap<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("WM_SVC.NAME", "Walmart Marketplace");
        headerMap.put("WM_QOS.CORRELATION_ID","test");
        headerMap.put("Accept","application/json");
        headerMap.put("WM_SVC.VERSION", "1.0.0");
        headerMap.put("Content-Type", "application/x-www-form-urlencoded");

        return headerMap;
    }

    public static HashMap<String, String> getOrder(String authToken){
        HashMap<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("WM_SVC.NAME", "Walmart Marketplace");
        headerMap.put("WM_QOS.CORRELATION_ID","test");
        headerMap.put("Accept","application/json");
        headerMap.put("WM_SVC.VERSION", "1.0.0");
        headerMap.put("Content-Type", "application/json");
        headerMap.put("Authorization", "Basic ZTBmZjRkYjEtZTQ0Mi00MDEwLWIxNjEtY2IyZTE0MGY4YWUyOkFKbEdBREstdkl4VEhGNi1RM1FlTGRNZzVEbFpqUnE4OVZJa1VzcFpJTVgzbDhvS2ZERXdDUm1jZmNUSkt4QWY4ZVB4a1JpNE4xNVFTMTktc2ozR2wzMA==");
        headerMap.put("WM_SEC.ACCESS_TOKEN", authToken);

        return headerMap;
    }
}
