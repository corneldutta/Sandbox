
package pojo.responseBody.getReleasedOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "elements"
})
public class List {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("elements")
    private Elements elements;

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("elements")
    public Elements getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(Elements elements) {
        this.elements = elements;
    }

}
