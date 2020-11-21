
package pojo.responseBody.getReleasedOrders;

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

}
