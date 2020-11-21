
package pojo.responseBody.getReleasedOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "statusQuantity",
    "cancellationReason",
    "trackingInfo",
    "returnCenterAddress"
})
public class OrderLinestatus {

    @JsonProperty("status")
    private String status;
    @JsonProperty("statusQuantity")
    private StatusQuantity statusQuantity;
    @JsonProperty("cancellationReason")
    private Object cancellationReason;
    @JsonProperty("trackingInfo")
    private Object trackingInfo;
    @JsonProperty("returnCenterAddress")
    private Object returnCenterAddress;

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("statusQuantity")
    public StatusQuantity getStatusQuantity() {
        return statusQuantity;
    }

    @JsonProperty("statusQuantity")
    public void setStatusQuantity(StatusQuantity statusQuantity) {
        this.statusQuantity = statusQuantity;
    }

    @JsonProperty("cancellationReason")
    public Object getCancellationReason() {
        return cancellationReason;
    }

    @JsonProperty("cancellationReason")
    public void setCancellationReason(Object cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    @JsonProperty("trackingInfo")
    public Object getTrackingInfo() {
        return trackingInfo;
    }

    @JsonProperty("trackingInfo")
    public void setTrackingInfo(Object trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    @JsonProperty("returnCenterAddress")
    public Object getReturnCenterAddress() {
        return returnCenterAddress;
    }

    @JsonProperty("returnCenterAddress")
    public void setReturnCenterAddress(Object returnCenterAddress) {
        this.returnCenterAddress = returnCenterAddress;
    }

}
