package com.hamza.hotelsoffersapp.offer.model;

import java.util.Currency;

/**
 *
 * @author Hamza
 */
public interface HotelPricingInfo {

    Double getAveragePriceValue();

    Double getTotalPriceValue();

    Double getCrossOutPriceValue();

    Double getOriginalPricePerNight();

    Currency getCurrency();

    Double getPercentSavings();

    Boolean isDrr();

}
