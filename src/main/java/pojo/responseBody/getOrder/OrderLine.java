
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
    "lineNumber",
    "item",
    "charges",
    "orderLineQuantity",
    "statusDate",
    "orderLineStatuses",
    "refund",
    "fulfillment"
})
public class OrderLine {

    @JsonProperty("lineNumber")
    private String lineNumber;
    @JsonProperty("item")
    private Item item;
    @JsonProperty("charges")
    private Charges charges;
    @JsonProperty("orderLineQuantity")
    private OrderLineQuantity orderLineQuantity;
    @JsonProperty("statusDate")
    private Long statusDate;
    @JsonProperty("orderLineStatuses")
    private OrderLineStatuses orderLineStatuses;
    @JsonProperty("refund")
    private Object refund;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("lineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    @JsonProperty("charges")
    public Charges getCharges() {
        return charges;
    }

    @JsonProperty("charges")
    public void setCharges(Charges charges) {
        this.charges = charges;
    }

    @JsonProperty("orderLineQuantity")
    public OrderLineQuantity getOrderLineQuantity() {
        return orderLineQuantity;
    }

    @JsonProperty("orderLineQuantity")
    public void setOrderLineQuantity(OrderLineQuantity orderLineQuantity) {
        this.orderLineQuantity = orderLineQuantity;
    }

    @JsonProperty("statusDate")
    public Long getStatusDate() {
        return statusDate;
    }

    @JsonProperty("statusDate")
    public void setStatusDate(Long statusDate) {
        this.statusDate = statusDate;
    }

    @JsonProperty("orderLineStatuses")
    public OrderLineStatuses getOrderLineStatuses() {
        return orderLineStatuses;
    }

    @JsonProperty("orderLineStatuses")
    public void setOrderLineStatuses(OrderLineStatuses orderLineStatuses) {
        this.orderLineStatuses = orderLineStatuses;
    }

    @JsonProperty("refund")
    public Object getRefund() {
        return refund;
    }

    @JsonProperty("refund")
    public void setRefund(Object refund) {
        this.refund = refund;
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
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
