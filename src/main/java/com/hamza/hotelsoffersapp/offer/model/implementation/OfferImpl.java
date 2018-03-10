package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Hotel;
import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.OfferDateRange;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelDto;

/**
 *
 * @author Hamza
 */
public class OfferImpl implements Offer {

    private final HotelDto hotelDto;

    public OfferImpl(HotelDto hotelDto) {
        this.hotelDto = hotelDto;
    }

    @Override
    public OfferDateRange getTime() {
        return new OfferDateRangeImpl(hotelDto.getOfferDateRange());
    }

    @Override
    public Hotel getHotel() {
        return new HotelImpl(hotelDto);
    }

}
