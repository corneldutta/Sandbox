package utils;

public enum APIResources {

    tokenGeneration("/v3/token"),
    getOrder("/v3/orders"),
    getReleasedOrders("/v3/orders/released");

    private String resource;

    APIResources(String resource){
        this.resource=resource;
    }

    public String getResource(){
        return resource;
    }
}
