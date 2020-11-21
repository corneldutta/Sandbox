
package pojo.responseBody.getReleasedOrders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "orderLine"
})
public class OrderLines {

    @JsonProperty("orderLine")
    private List<OrderLine> orderLine = null;

    @JsonProperty("orderLine")
    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    @JsonProperty("orderLine")
    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

}
