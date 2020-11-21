package utils;


import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.BasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.requestBody.AuthTokenRequest;

import java.util.HashMap;

public class Spec {

    private static RequestSpecification spec;

    public static RequestSpecification getSpec(String env, HashMap<String,String> headers){

        spec = RestAssured.
                given().
                baseUri(Environment.getURL(env))
                .auth().preemptive()
                .basic(Environment.getClientID(env), Environment.getClientSecret(env))
                .headers(headers);
        return spec;
    }
/*
    public static RequestSpecification reqSpec(APIResources apiName, String env) {

        spec= RestAssured.
                given().
                baseUri(Environment.getURL(env))
                .auth().preemptive()
                .basic(Environment.getClientID(env), Environment.getClientSecret(env))
                .headers(Headers.get(apiName));

                getSpec("STG",Headers.authToken()).
                body(AuthTokenRequest.body())
                .post(APIResources.valueOf("tokenGeneration").getResource())
                .then().extract().response();
    }*/
}