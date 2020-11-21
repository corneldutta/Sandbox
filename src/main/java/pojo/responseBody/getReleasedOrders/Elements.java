
package pojo.responseBody.getReleasedOrders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order"
})
public class Elements {

    @JsonProperty("order")
    private List<Order> order = null;

    @JsonProperty("order")
    public List<Order> getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(List<Order> order) {
        this.order = order;
    }

}
