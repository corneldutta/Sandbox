package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Headers;

public class GetOrderService {

    public static void main(String[] args) {
        getToken();
    }

    public static void getToken() {

        //headerMap.put("Authorization", "Basic ZTBmZjRkYjEtZTQ0Mi00MDEwLWIxNjEtY2IyZTE0MGY4YWUyOkFKbEdBREstdkl4VEhGNi1RM1FlTGRNZzVEbFpqUnE4OVZJa1VzcFpJTVgzbDhvS2ZERXdDUm1jZmNUSkt4QWY4ZVB4a1JpNE4xNVFTMTktc2ozR2wzMA==");

        RestAssured.baseURI = "http://partner.gateway.stg0.walmart.com/gmp-gateway-service-app";
        /*RequestSpecification requestSpecification = RestAssured.given()
                *//*.auth().preemptive()
                .basic("e0ff4db1-e442-4010-b161-cb2e140f8ae2", "AJlGADK-vIxTHF6-Q3QeLdMg5DlZjRq89VIkUspZIMX3l8oKfDEwCRmcfcTJKxAf8ePxkRi4N15QS19-sj3Gl30")
                *//*
                .headers(Headers.getOrder("eyJraWQiOiI4ZTA0MmFkZi0zM2I0LTQwNzgtYWM1NC1kZWMzZmM3MmRmODEiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0..zMXxtXaLK6bKWwmm.BUDx3Oo9QAg3mnBv7AqdUqNn8yju6cWBIKYyJLozr4JCfnTofUH50H7rfUBhlI9QiD37RXcML4-eJLKDoI8el7RIhXbx9MHfcZ9_3DS0-3uB3bM45yTyRD4eQ8TLqg816xaakhzNioiS0gitsA41jKJVRLi6f6zhpfLdOAAAbIOmbMC8qOsIZ19UoT5dLD8RJ3RLQ0mThySxdIcR3cW7J3o3UvOtw26Ee2102GG0O5qkltlgyA_COjiS96JVLspQcFxWZcoZEd3DUeYOT0OIjYL0mytJ_gDUuaX3j0yf9nKNebvCCKWMfGLdXDH2UG7bzQYI5fSKoWrda5cPMAEjMKbzRaJZZWFcLKAV3eU6CLacA00QYfCAAF41rnYSIFiZ7Q9PLPVWC69E-3Y-ccwbv6f7rtwo-BZ8FF12sajnVBCOHg-Ye46WVaOi6xeadzFoQwmnJ7_SUVh3sxQy7eU7fMiJt7p1uh3qEs_TnumhFnm7SaWdv5OKrTe_FjaXa6G885Wy6d4IMr8upWBY3AYMzrvq5qNqPDC1Zlq1NJGkjivz_CyO9dUjmNFJ32soK3BNuhWLQa65BHYfdUfOG2UmtQwSY2mST34nsbEkEdAepRq6088IMmKCZRlbOhzWDulGy46R_0pfZsZJw2r5QSHn1Qu4FZkUXPWa1bEF7lrHetELb2Qip5lCWtEZGkLq.hQEX9mGBa9G7j_SyOW-S1Q"))
                .contentType(ContentType.JSON);*/
        Response response=RestAssured.given().
                auth().preemptive()
                .basic("e0ff4db1-e442-4010-b161-cb2e140f8ae2", "AJlGADK-vIxTHF6-Q3QeLdMg5DlZjRq89VIkUspZIMX3l8oKfDEwCRmcfcTJKxAf8ePxkRi4N15QS19-sj3Gl30")
                .headers(Headers.getOrder("eyJraWQiOiI4ZTA0MmFkZi0zM2I0LTQwNzgtYWM1NC1kZWMzZmM3MmRmODEiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0..R4HrDphZ6auo2W8q.bgyBc-GpcxTLljd27Jeo6VAo6IuhyZoKklmQRpVJuvf-DU1G1jjKDzrveyoSxrrQ7KxecrxugIcMg868AV0IRmT-YuYKtQOD_XD7yqMA_JxzqeWionjo9aMABUAqmBGCKxQWZ8nRoKvew0a45AeX8IaEqeaVhsXUv2GDIVvP67Q2iYvv1D0RTOm2ciQy7jBL6RxSKslgSDyJG4kyq9kVRf1DlRrLlN5bC28DwJgI9v19T5hvERZpdSOMLARblyGyBMNIhDgSo-coCdR1A7-8qIY0BVxByrq_mxi9Iv6Z4WfWm8ILHRSVA-DkanoF-9q4tYvthfdKy1NECbeAQ3lojKrM7PExvhOazLCKIrmcDFratYnPDkioCAKQIYt6dERe9alf7mOoIPOBxQ-DBxpAsmNTrwm8TmvucOwCz96cOiqPVAqqbC9Qe5Mfti_YPTFNHyHp433FHfsaVVIVP4tVUC92qEIvoPnAYM_9eQ_YGQc4lMeQwrBPrg0cNaUqW1XX0c8UXlDVHvAfqvFZs5r_kfn0FIdBjxJdtoQxMrHIIxFIKQLAyFAkU7mAjGY6SJI7F4H6hqJr8jLSaY6oIOjsecCVHrDJXjoA1mI6Uhk00n4yXvriOSH6_zOsUAIDwvcrts9FIl3phYa2yP5OSF8wE_sEG1nHRUy-F88eFMhzmbIciA80AfIv4WET2dLm.IqMCc95JCAWoV11q5wTmKQ"))
                .contentType(ContentType.JSON)
                .get("/v3/orders/1806670081717").then().log().all().statusCode(200).extract().response();
        /*GetOrder orderResp = requestSpecification.get("/v3/orders/1806670081717")
                .then().log().all().statusCode(200).extract().as(GetOrder.class);
        //Response response = requestSpecification.body(tokengenerationPayLaod).post("/v3/token").then().assertThat().statusCode(200).extract().response();
        //AuthToken authToken=response.as(AuthToken.class);
        System.out.println(orderResp.getOrder().getPurchaseOrderId());
        System.out.println();*/
    }
}
