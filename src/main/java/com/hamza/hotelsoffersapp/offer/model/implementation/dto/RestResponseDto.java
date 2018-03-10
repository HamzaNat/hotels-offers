package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerInfo",
    "userInfo",
    "offers"
})
public class RestResponseDto {

    @JsonProperty("offerInfo")
    private OfferInfoDto offerInfo;
    @JsonProperty("userInfo")
    private UserInfoDto userInfo;
    @JsonProperty("offers")
    private OffersDto offers;

    @JsonProperty("offerInfo")
    public OfferInfoDto getOfferInfo() {
        return offerInfo;
    }

    @JsonProperty("offerInfo")
    public void setOfferInfo(OfferInfoDto offerInfo) {
        this.offerInfo = offerInfo;
    }

    @JsonProperty("userInfo")
    public UserInfoDto getUserInfo() {
        return userInfo;
    }

    @JsonProperty("userInfo")
    public void setUserInfo(UserInfoDto userInfo) {
        this.userInfo = userInfo;
    }

    @JsonProperty("offers")
    public OffersDto getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(OffersDto offers) {
        this.offers = offers;
    }

}
