package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Coordinates;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelInfoDto;

/**
 *
 * @author Hamza
 */
public class CoordinatesImpl implements Coordinates {

    private final HotelInfoDto hotelInfo;

    public CoordinatesImpl(HotelInfoDto hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    @Override
    public Double getLatitude() {
        return hotelInfo.getHotelLatitude();
    }

    @Override
    public Double getLongitude() {
        return hotelInfo.getHotelLongitude();
    }

}
