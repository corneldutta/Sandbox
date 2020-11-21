
package pojo.responseBody.getOrder;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "phone",
    "estimatedDeliveryDate",
    "estimatedShipDate",
    "methodCode",
    "postalAddress"
})
public class ShippingInfo {

    @JsonProperty("phone")
    private String phone;
    @JsonProperty("estimatedDeliveryDate")
    private Long estimatedDeliveryDate;
    @JsonProperty("estimatedShipDate")
    private Long estimatedShipDate;
    @JsonProperty("methodCode")
    private String methodCode;
    @JsonProperty("postalAddress")
    private PostalAddress postalAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("estimatedDeliveryDate")
    public Long getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    @JsonProperty("estimatedDeliveryDate")
    public void setEstimatedDeliveryDate(Long estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    @JsonProperty("estimatedShipDate")
    public Long getEstimatedShipDate() {
        return estimatedShipDate;
    }

    @JsonProperty("estimatedShipDate")
    public void setEstimatedShipDate(Long estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    @JsonProperty("methodCode")
    public String getMethodCode() {
        return methodCode;
    }

    @JsonProperty("methodCode")
    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode;
    }

    @JsonProperty("postalAddress")
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    @JsonProperty("postalAddress")
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
