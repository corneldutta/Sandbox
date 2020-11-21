package utils;

public class Environment {

    public static String getURL(String env) {
        String URL = null;
        switch (env) {
            case "STG":
                URL = "http://partner.gateway.stg0.walmart.com/gmp-gateway-service-app";
                break;
            case "QA":
                URL = null;
                break;
            case "PreProd":
                URL = null;
                break;
            case "Prod":
                URL = null;
                break;
        }
        return URL;
    }

    public static String getClientID(String env) {
        String ClientID = null;
        switch (env) {
            case "STG":
                ClientID = "24ef187a-4b74-47fc-8e1b-e757a04b10bb";
                break;
            case "QA":
                ClientID = null;
                break;
            case "PreProd":
                ClientID = null;
                break;
            case "Prod":
                ClientID = null;
                break;
        }
        return ClientID;
    }


    public static String getClientSecret(String env) {

        String ClientSecret = null;
        switch (env) {
            case "STG":
                ClientSecret = "AKQfHT7BbnUTbWsSg7kZpKHOjbIDM25wgyMaPZBfoixHR3Yf8nbRgs-XtmYGJmOCYpwt_kP9DwDXO3Vz-MB_6Ms";
                break;
            case "QA":
                ClientSecret = null;
                break;
            case "PreProd":
                ClientSecret = null;
                break;
            case "Prod":
                ClientSecret = null;
                break;
        }
        return ClientSecret;
    }
}
