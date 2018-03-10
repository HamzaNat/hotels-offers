package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "travelStartDate",
    "travelEndDate",
    "lengthOfStay"
})
public class OfferDateRangeDto {

    @JsonProperty("travelStartDate")
    private List<Integer> travelStartDate = null;
    @JsonProperty("travelEndDate")
    private List<Integer> travelEndDate = null;
    @JsonProperty("lengthOfStay")
    private Integer lengthOfStay;

    @JsonProperty("travelStartDate")
    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    @JsonProperty("travelStartDate")
    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    @JsonProperty("travelEndDate")
    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    @JsonProperty("travelEndDate")
    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    @JsonProperty("lengthOfStay")
    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    @JsonProperty("lengthOfStay")
    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

}
