
package pojo.responseBody.getReleasedOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unitOfMeasurement",
    "amount"
})
public class OrderLineQuantity {

    @JsonProperty("unitOfMeasurement")
    private String unitOfMeasurement;
    @JsonProperty("amount")
    private String amount;

    @JsonProperty("unitOfMeasurement")
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    @JsonProperty("unitOfMeasurement")
    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

}
