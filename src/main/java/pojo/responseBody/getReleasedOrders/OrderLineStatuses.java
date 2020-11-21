
package pojo.responseBody.getReleasedOrders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "orderLineStatus"
})
public class OrderLineStatuses {

    @JsonProperty("orderLineStatus")
    private List<OrderLinestatus> orderLineStatus = null;

    @JsonProperty("orderLineStatus")
    public List<OrderLinestatus> getOrderLineStatus() {
        return orderLineStatus;
    }

    @JsonProperty("orderLineStatus")
    public void setOrderLineStatus(List<OrderLinestatus> orderLineStatus) {
        this.orderLineStatus = orderLineStatus;
    }

}
