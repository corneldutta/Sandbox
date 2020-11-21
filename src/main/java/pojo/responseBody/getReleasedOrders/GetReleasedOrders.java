
package pojo.responseBody.getReleasedOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "list"
})
public class GetReleasedOrders {

    @JsonProperty("list")
    private List list;

    @JsonProperty("list")
    public List getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(List list) {
        this.list = list;
    }

}
