package pojo.requestBody;

public class AuthTokenRequest {

    public static String body(){
        return "grant_type=client_credentials";
    }
}
