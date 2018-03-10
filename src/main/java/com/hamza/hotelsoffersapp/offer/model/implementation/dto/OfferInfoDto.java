package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "siteID",
    "language",
    "currency",
    "userSelectedCurrency"
})
public class OfferInfoDto {

    @JsonProperty("siteID")
    private String siteID;
    @JsonProperty("language")
    private String language;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("userSelectedCurrency")
    private String userSelectedCurrency;

    @JsonProperty("siteID")
    public String getSiteID() {
        return siteID;
    }

    @JsonProperty("siteID")
    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("userSelectedCurrency")
    public String getUserSelectedCurrency() {
        return userSelectedCurrency;
    }

    @JsonProperty("userSelectedCurrency")
    public void setUserSelectedCurrency(String userSelectedCurrency) {
        this.userSelectedCurrency = userSelectedCurrency;
    }

}
