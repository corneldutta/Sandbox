
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
    "fulfillmentOption",
    "shipMethod",
    "storeId",
    "pickUpDateTime",
    "pickUpBy",
    "shippingProgramType"
})
public class Fulfillment {

    @JsonProperty("fulfillmentOption")
    private String fulfillmentOption;
    @JsonProperty("shipMethod")
    private String shipMethod;
    @JsonProperty("storeId")
    private Object storeId;
    @JsonProperty("pickUpDateTime")
    private Long pickUpDateTime;
    @JsonProperty("pickUpBy")
    private Object pickUpBy;
    @JsonProperty("shippingProgramType")
    private Object shippingProgramType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fulfillmentOption")
    public String getFulfillmentOption() {
        return fulfillmentOption;
    }

    @JsonProperty("fulfillmentOption")
    public void setFulfillmentOption(String fulfillmentOption) {
        this.fulfillmentOption = fulfillmentOption;
    }

    @JsonProperty("shipMethod")
    public String getShipMethod() {
        return shipMethod;
    }

    @JsonProperty("shipMethod")
    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }

    @JsonProperty("storeId")
    public Object getStoreId() {
        return storeId;
    }

    @JsonProperty("storeId")
    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("pickUpDateTime")
    public Long getPickUpDateTime() {
        return pickUpDateTime;
    }

    @JsonProperty("pickUpDateTime")
    public void setPickUpDateTime(Long pickUpDateTime) {
        this.pickUpDateTime = pickUpDateTime;
    }

    @JsonProperty("pickUpBy")
    public Object getPickUpBy() {
        return pickUpBy;
    }

    @JsonProperty("pickUpBy")
    public void setPickUpBy(Object pickUpBy) {
        this.pickUpBy = pickUpBy;
    }

    @JsonProperty("shippingProgramType")
    public Object getShippingProgramType() {
        return shippingProgramType;
    }

    @JsonProperty("shippingProgramType")
    public void setShippingProgramType(Object shippingProgramType) {
        this.shippingProgramType = shippingProgramType;
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
