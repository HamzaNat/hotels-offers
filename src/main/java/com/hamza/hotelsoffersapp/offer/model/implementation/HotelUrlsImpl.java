package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.HotelUrls;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelUrlsDto;

/**
 *
 * @author Hamza
 */
public class HotelUrlsImpl implements HotelUrls {

    private final HotelUrlsDto hotelUrls;

    public HotelUrlsImpl(HotelUrlsDto hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    @Override
    public String getInfoSiteUrl() {
        return hotelUrls.getHotelInfositeUrl();
    }

    @Override
    public String getSearchResultUrl() {
        return hotelUrls.getHotelSearchResultUrl();
    }

}
