package com.hamza.hotelsoffersapp.offer.model;

/**
 *
 * @author Hamza
 */
public interface Hotel {

    String getId();

    String getName();

    String getLocalizedName();
    
    String getHotelDestination();
    
    String getHotelDestinationRegionId();
    
    String getLongDestination();

    String getStreetAddress();
    
    String getCity();
    
    String getProvince();
    
    String getCountryCode();

    Coordinates getCoordinates();

    Double getHotelStarRating();

    Double getGuestReviewRating();

    Integer getTotalReviewsCount();

    String getImageUrl();

    Boolean isVipAccess();

    Boolean isOfficialRating();

    HotelPricingInfo getPricingInfo();

    HotelUrls getUrls();

}
