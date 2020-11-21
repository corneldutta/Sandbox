package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import pojo.requestBody.AuthTokenRequest;
import pojo.responseBody.getReleasedOrders.GetReleasedOrders;
import pojo.responseBody.tokenAuth.AuthTokenResponse;
import pojo.responseBody.getOrder.GetOrder;
import utils.APIResources;
import utils.Headers;
import utils.Spec;

import javax.swing.text.AbstractDocument;

public class MyStepdefs {

    public static AuthTokenResponse authToken;
    public static GetOrder orderObj;
    public static GetReleasedOrders releasedOrders;
    public static Response orderResponse;
    public static Response authTokenResponse;
    public static Response releasedOrdersResponse;
    public static JsonPath orderResponseJson;

    @Given("Seller has generated Authentication Token")
    public void sellerHasGeneratedAuthenticationToken() {
        /*String resource="tokenAuth";
        String method="Post";
        String env="STG";
        Response response;
        switch(method){
            case "POST":
                response=Spec.reqSpec(APIResources.valueOf("tokenGeneration")).when().post(APIResources.valueOf("tokenGeneration").getResource());
                break;
            case "GET":
                response=resSpec.when().get(APIResources.valueOf("tokenGeneration").getResource());
                break;
        }*/
        authTokenResponse = Spec.
                getSpec("STG",Headers.authToken()).
                body(AuthTokenRequest.body())
                .post(APIResources.valueOf("tokenGeneration").getResource())
                .then().extract().response();
        authToken=authTokenResponse.as(AuthTokenResponse.class);
    }

    @And("Status of getToken API Response is {int}")
    public void statusOfGetTokenAPIResponseIs(int expectedStatus) {
        Assert.assertEquals(authTokenResponse.getStatusCode(),expectedStatus);
    }

    @When("Seller calls {string} API using GET HTTP Request for {string}")
    public void sellerCallsAPIUsingGETHTTPRequestFor(String arg0, String arg1) {
        orderResponse=Spec.
                getSpec("STG",Headers.getOrder(authToken.getAccessToken()))
                .pathParam("order","1806670081717")
                .get("/v3/orders/{order}").then().extract().response();
        orderObj = orderResponse.as(GetOrder.class);
        orderResponseJson=new JsonPath(orderResponse.getBody().asString());
    }

    @When("Seller calls getAllReleasedOrders API using GET HTTP Request between {string} and {string}")
    public void sellerCallsAPIUsingGETHTTPRequestBetweenAnd(String startDate, String endDate) {
        releasedOrdersResponse=Spec.
                getSpec("STG",Headers.getOrder(authToken.getAccessToken()))
                .queryParam("createdStartDate",startDate)
                .queryParam("createdEndDate",endDate)
                .get(APIResources.valueOf("getOrder").getResource()).then().extract().response();
        releasedOrders =releasedOrdersResponse.as(GetReleasedOrders.class);
    }

    @Then("List of all Released orders should be displayed within {string} and {string}")
    public void listOfAllReleasedOrdersShouldBeDisplayedWithinAnd(String startDate, String endDate) {
        Assert.assertEquals(9,releasedOrders.getList().getMeta().getTotalCount().longValue());
    }

    @Then("status in API Response is {string}")
    public void statusInAPIResponseIs(int expectedStatus) {
        Assert.assertEquals(orderResponse.getStatusCode(),expectedStatus);
    }

    @And("purchaseOrderId in API Response is {string}")
    public void purchaseorderidInAPIResponseIs(String expectedValue) {
        Assert.assertEquals(orderResponseJson.get("order.purchaseOrderId").toString(),expectedValue);
        Assert.assertEquals(orderObj.getOrder().getPurchaseOrderId().toString(),expectedValue);
    }

    @Then("status of getOrder API Response is {int}")
    public void statusOfGetOrderAPIResponseIs(int expectedStatus) {
        Assert.assertEquals(orderResponse.getStatusCode(),expectedStatus);
    }

    @Then("status of getAllReleasedOrders API Response is {int}")
    public void statusOfGetAllReleasedOrdersAPIResponseIs(int expectedStatus) {
        Assert.assertEquals(releasedOrdersResponse.getStatusCode(),expectedStatus);
    }


}
