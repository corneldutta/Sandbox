package pojo.responseBody.tokenAuth;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthTokenResponse {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private Integer expiresIn;

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("expires_in")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty("expires_in")
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }
}
