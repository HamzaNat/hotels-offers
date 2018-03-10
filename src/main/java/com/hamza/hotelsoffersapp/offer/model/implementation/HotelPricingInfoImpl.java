package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.HotelPricingInfo;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelPricingInfoDto;
import java.util.Currency;

/**
 *
 * @author Hamza
 */
public class HotelPricingInfoImpl implements HotelPricingInfo {

    private final HotelPricingInfoDto pricingInfo;

    public HotelPricingInfoImpl(HotelPricingInfoDto pricingInfo) {
        this.pricingInfo = pricingInfo;
    }

    @Override
    public Double getAveragePriceValue() {
        return pricingInfo.getAveragePriceValue();
    }

    @Override
    public Double getTotalPriceValue() {
        return pricingInfo.getTotalPriceValue();
    }

    @Override
    public Double getCrossOutPriceValue() {
        return pricingInfo.getCrossOutPriceValue();
    }

    @Override
    public Double getOriginalPricePerNight() {
        return pricingInfo.getOriginalPricePerNight();
    }

    @Override
    public Currency getCurrency() {
        return Currency.getInstance(pricingInfo.getCurrency());
    }

    @Override
    public Double getPercentSavings() {
        return pricingInfo.getPercentSavings();
    }

    @Override
    public Boolean isDrr() {
        return pricingInfo.getDrr();
    }

}
