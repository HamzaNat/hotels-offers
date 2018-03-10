package com.hamza.hotelsoffersapp.offer.model;

/**
 *
 * @author Hamza
 */
public interface Hotel {

    String getId();

    String getName();

    String getLocalizedName();

    String getStreetAddress();

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
