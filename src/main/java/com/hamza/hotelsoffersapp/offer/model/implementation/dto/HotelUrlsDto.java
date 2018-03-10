package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hotelInfositeUrl",
    "hotelSearchResultUrl"
})
public class HotelUrlsDto {

    @JsonProperty("hotelInfositeUrl")
    private String hotelInfositeUrl;
    @JsonProperty("hotelSearchResultUrl")
    private String hotelSearchResultUrl;

    @JsonProperty("hotelInfositeUrl")
    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    @JsonProperty("hotelInfositeUrl")
    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    @JsonProperty("hotelSearchResultUrl")
    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    @JsonProperty("hotelSearchResultUrl")
    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

}
