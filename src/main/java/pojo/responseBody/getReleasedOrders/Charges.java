
package pojo.responseBody.getReleasedOrders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "charge"
})
public class Charges {

    @JsonProperty("charge")
    private List<Charge> charge = null;

    @JsonProperty("charge")
    public List<Charge> getCharge() {
        return charge;
    }

    @JsonProperty("charge")
    public void setCharge(List<Charge> charge) {
        this.charge = charge;
    }

}
