package services;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import pojo.responseBody.tokenAuth.AuthTokenResponse;

import java.util.HashMap;

public class TokenAuth {

    public static void getToken() {
        HashMap<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("WM_SVC.NAME", "Walmart Marketplace");
        headerMap.put("WM_QOS.CORRELATION_ID","test");
        headerMap.put("Accept","application/json");
        headerMap.put("WM_SVC.VERSION", "1.0.0");
        headerMap.put("Content-Type", "application/x-www-form-urlencoded");
        //headerMap.put("Authorization", "Basic ZTBmZjRkYjEtZTQ0Mi00MDEwLWIxNjEtY2IyZTE0MGY4YWUyOkFKbEdBREstdkl4VEhGNi1RM1FlTGRNZzVEbFpqUnE4OVZJa1VzcFpJTVgzbDhvS2ZERXdDUm1jZmNUSkt4QWY4ZVB4a1JpNE4xNVFTMTktc2ozR2wzMA==");

        RestAssured.baseURI = "http://partner.gateway.stg0.walmart.com/gmp-gateway-service-app";
        String tokengenerationPayLaod = "grant_type=client_credentials";
        /*BasicAuthScheme authScheme=new BasicAuthScheme();
        authScheme.setUserName("e0ff4db1-e442-4010-b161-cb2e140f8ae2");
        authScheme.setPassword("AJlGADK-vIxTHF6-Q3QeLdMg5DlZjRq89VIkUspZIMX3l8oKfDEwCRmcfcTJKxAf8ePxkRi4N15QS19-sj3Gl30");
        RestAssured.authentication=authScheme;*/
        RequestSpecification requestSpecification = RestAssured.given()
                .auth().preemptive()
                .basic("e0ff4db1-e442-4010-b161-cb2e140f8ae2", "AJlGADK-vIxTHF6-Q3QeLdMg5DlZjRq89VIkUspZIMX3l8oKfDEwCRmcfcTJKxAf8ePxkRi4N15QS19-sj3Gl30")
                .headers(headerMap);

        AuthTokenResponse authTokenResponse = requestSpecification.body(tokengenerationPayLaod).post("/v3/token").then().log().all().statusCode(200).extract().as(AuthTokenResponse.class);
        //Response response = requestSpecification.body(tokengenerationPayLaod).post("/v3/token").then().assertThat().statusCode(200).extract().response();
        //AuthToken authToken=response.as(AuthToken.class);
        System.out.println(authTokenResponse.getAccessToken());
        System.out.println();
    }
}
