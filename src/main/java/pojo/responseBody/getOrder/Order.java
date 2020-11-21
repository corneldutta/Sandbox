
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
    "purchaseOrderId",
    "customerOrderId",
    "customerEmailId",
    "orderDate",
    "shippingInfo",
    "orderLines",
    "shipNode"
})
public class Order {

    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    @JsonProperty("customerOrderId")
    private String customerOrderId;
    @JsonProperty("customerEmailId")
    private String customerEmailId;
    @JsonProperty("orderDate")
    private Long orderDate;
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    @JsonProperty("orderLines")
    private OrderLines orderLines;
    @JsonProperty("shipNode")
    private ShipNode shipNode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("purchaseOrderId")
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    @JsonProperty("purchaseOrderId")
    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    @JsonProperty("customerOrderId")
    public String getCustomerOrderId() {
        return customerOrderId;
    }

    @JsonProperty("customerOrderId")
    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    @JsonProperty("customerEmailId")
    public String getCustomerEmailId() {
        return customerEmailId;
    }

    @JsonProperty("customerEmailId")
    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    @JsonProperty("orderDate")
    public Long getOrderDate() {
        return orderDate;
    }

    @JsonProperty("orderDate")
    public void setOrderDate(Long orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    @JsonProperty("shippingInfo")
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @JsonProperty("orderLines")
    public OrderLines getOrderLines() {
        return orderLines;
    }

    @JsonProperty("orderLines")
    public void setOrderLines(OrderLines orderLines) {
        this.orderLines = orderLines;
    }

    @JsonProperty("shipNode")
    public ShipNode getShipNode() {
        return shipNode;
    }

    @JsonProperty("shipNode")
    public void setShipNode(ShipNode shipNode) {
        this.shipNode = shipNode;
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
