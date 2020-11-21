
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
    "chargeType",
    "chargeName",
    "chargeAmount",
    "tax"
})
public class Charge {

    @JsonProperty("chargeType")
    private String chargeType;
    @JsonProperty("chargeName")
    private String chargeName;
    @JsonProperty("chargeAmount")
    private ChargeAmount chargeAmount;
    @JsonProperty("tax")
    private Tax tax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chargeType")
    public String getChargeType() {
        return chargeType;
    }

    @JsonProperty("chargeType")
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    @JsonProperty("chargeName")
    public String getChargeName() {
        return chargeName;
    }

    @JsonProperty("chargeName")
    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    @JsonProperty("chargeAmount")
    public ChargeAmount getChargeAmount() {
        return chargeAmount;
    }

    @JsonProperty("chargeAmount")
    public void setChargeAmount(ChargeAmount chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    @JsonProperty("tax")
    public Tax getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(Tax tax) {
        this.tax = tax;
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
