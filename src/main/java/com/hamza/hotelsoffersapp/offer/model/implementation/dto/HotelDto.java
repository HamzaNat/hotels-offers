package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerDateRange",
    "destination",
    "hotelInfo",
    "hotelPricingInfo",
    "hotelUrls"
})
public class HotelDto {

    @JsonProperty("offerDateRange")
    private OfferDateRangeDto offerDateRange;
    @JsonProperty("destination")
    private DestinationDto destination;
    @JsonProperty("hotelInfo")
    private HotelInfoDto hotelInfo;
    @JsonProperty("hotelPricingInfo")
    private HotelPricingInfoDto hotelPricingInfo;
    @JsonProperty("hotelUrls")
    private HotelUrlsDto hotelUrls;

    @JsonProperty("offerDateRange")
    public OfferDateRangeDto getOfferDateRange() {
        return offerDateRange;
    }

    @JsonProperty("offerDateRange")
    public void setOfferDateRange(OfferDateRangeDto offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    @JsonProperty("destination")
    public DestinationDto getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(DestinationDto destination) {
        this.destination = destination;
    }

    @JsonProperty("hotelInfo")
    public HotelInfoDto getHotelInfo() {
        return hotelInfo;
    }

    @JsonProperty("hotelInfo")
    public void setHotelInfo(HotelInfoDto hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public HotelPricingInfoDto getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public void setHotelPricingInfo(HotelPricingInfoDto hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    @JsonProperty("hotelUrls")
    public HotelUrlsDto getHotelUrls() {
        return hotelUrls;
    }

    @JsonProperty("hotelUrls")
    public void setHotelUrls(HotelUrlsDto hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

}
