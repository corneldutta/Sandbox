
package pojo.responseBody.getReleasedOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalCount",
    "limit",
    "nextCursor"
})
public class Meta {

    @JsonProperty("totalCount")
    private Long totalCount;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("nextCursor")
    private Object nextCursor;

    @JsonProperty("totalCount")
    public Long getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @JsonProperty("nextCursor")
    public Object getNextCursor() {
        return nextCursor;
    }

    @JsonProperty("nextCursor")
    public void setNextCursor(Object nextCursor) {
        this.nextCursor = nextCursor;
    }

}
