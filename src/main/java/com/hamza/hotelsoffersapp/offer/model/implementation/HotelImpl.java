package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Coordinates;
import com.hamza.hotelsoffersapp.offer.model.Hotel;
import com.hamza.hotelsoffersapp.offer.model.HotelPricingInfo;
import com.hamza.hotelsoffersapp.offer.model.HotelUrls;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelInfoDto;

/**
 *
 * @author Hamza
 */
public class HotelImpl implements Hotel {

    private final HotelInfoDto hotelInfo;
    private final HotelDto hotel;

    public HotelImpl(HotelDto hotel) {
        this.hotelInfo = hotel.getHotelInfo();
        this.hotel = hotel;
    }

    @Override
    public String getId() {
        return hotelInfo.getHotelId();
    }

    @Override
    public String getName() {
        return hotelInfo.getHotelName();
    }

    @Override
    public String getLocalizedName() {
        return hotelInfo.getLocalizedHotelName();
    }

    @Override
    public String getHotelDestination() {
        return hotelInfo.getHotelDestination();
    }

    @Override
    public String getHotelDestinationRegionId() {
        return hotelInfo.getHotelDestinationRegionID();
    }

    @Override
    public String getLongDestination() {
        return hotelInfo.getHotelLongDestination();
    }

    @Override
    public String getStreetAddress() {
        return hotelInfo.getHotelStreetAddress();
    }

    @Override
    public String getCity() {
        return hotelInfo.getHotelCity();
    }

    @Override
    public String getProvince() {
        return hotelInfo.getHotelProvince();
    }

    @Override
    public String getCountryCode() {
        return hotelInfo.getHotelCountryCode();
    }

    @Override
    public Coordinates getCoordinates() {
        return new CoordinatesImpl(hotelInfo);
    }

    @Override
    public Double getHotelStarRating() {
        return Double.parseDouble(hotelInfo.getHotelStarRating());
    }

    @Override
    public Double getGuestReviewRating() {
        return hotelInfo.getHotelGuestReviewRating();
    }

    @Override
    public Integer getTotalReviewsCount() {
        return hotelInfo.getHotelReviewTotal();
    }

    @Override
    public String getImageUrl() {
        return hotelInfo.getHotelImageUrl();
    }

    @Override
    public Boolean isVipAccess() {
        return hotelInfo.getVipAccess();
    }

    @Override
    public Boolean isOfficialRating() {
        return hotelInfo.getIsOfficialRating();
    }

    @Override
    public HotelPricingInfo getPricingInfo() {
        return new HotelPricingInfoImpl(hotel.getHotelPricingInfo());
    }

    @Override
    public HotelUrls getUrls() {
        return new HotelUrlsImpl(hotel.getHotelUrls());
    }

}
