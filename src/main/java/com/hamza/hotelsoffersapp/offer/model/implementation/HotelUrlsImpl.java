package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.HotelUrls;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelUrlsDto;
import java.io.UnsupportedEncodingException;

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
        try {
            return java.net.URLDecoder.decode(hotelUrls.getHotelInfositeUrl(), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            return "";
        }
    }

    @Override
    public String getSearchResultUrl() {
        try {
            return java.net.URLDecoder.decode(hotelUrls.getHotelSearchResultUrl(), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            return "";
        }
    }

}
