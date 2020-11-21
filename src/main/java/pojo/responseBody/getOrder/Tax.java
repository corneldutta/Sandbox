
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
    "taxName",
    "taxAmount"
})
public class Tax {

    @JsonProperty("taxName")
    private String taxName;
    @JsonProperty("taxAmount")
    private TaxAmount taxAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
