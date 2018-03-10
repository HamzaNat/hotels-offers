package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Region;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.DestinationDto;

/**
 *
 * @author Hamza
 */
public class RegionImpl implements Region {

    private final DestinationDto region;

    public RegionImpl(DestinationDto region) {
        this.region = region;
    }

    @Override
    public String getId() {
        return region.getRegionID();
    }

    @Override
    public String getLongName() {
        return region.getLongName();
    }

    @Override
    public String getShortName() {
        return region.getShortName();
    }

    @Override
    public String getCountryName() {
        return region.getCountry();
    }

    @Override
    public String getProvince() {
        return region.getProvince();
    }

    @Override
    public String getCityName() {
        return region.getCity();
    }

    @Override
    public String getTla() {
        return region.getTla();
    }

    @Override
    public String getNonLocalizedCityName() {
        return region.getNonLocalizedCity();
    }

}
