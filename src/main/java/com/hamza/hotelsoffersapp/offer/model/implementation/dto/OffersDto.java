package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Hotel"
})
public class OffersDto {

    @JsonProperty("Hotel")
    private List<HotelDto> hotel = null;

    @JsonProperty("Hotel")
    public List<HotelDto> getHotel() {
        return hotel;
    }

    @JsonProperty("Hotel")
    public void setHotel(List<HotelDto> hotel) {
        this.hotel = hotel;
    }

}
