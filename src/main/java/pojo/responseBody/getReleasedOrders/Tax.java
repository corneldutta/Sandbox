
package pojo.responseBody.getReleasedOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taxName",
    "taxAmount"
})
public class Tax {

    @JsonProperty("taxName")
    private String taxName;
    @JsonProperty("taxAmount")
    private TaxAmount taxAmount;

    @JsonProperty("taxName")
    public String getTaxName() {
        return taxName;
    }

    @JsonProperty("taxName")
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    @JsonProperty("taxAmount")
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(TaxAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

}
