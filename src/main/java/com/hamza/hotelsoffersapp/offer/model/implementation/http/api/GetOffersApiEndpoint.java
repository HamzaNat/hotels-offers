package com.hamza.hotelsoffersapp.offer.model.implementation.http.api;

import com.hamza.hotelsoffersapp.offer.model.filtering.QueryMedia;
import com.hamza.hotelsoffersapp.offer.model.implementation.http.ApiEndpoint;
import com.hamza.hotelsoffersapp.offer.model.implementation.http.GetApiEndpoint;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hamza
 */
@Component("GetOffers")
public class GetOffersApiEndpoint implements GetApiEndpoint {

    private String url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    @Override
    public String url() {
        return url;
    }

    @Override
    public void print(String key, String value) {
        url += "&" + key + "=" + value;
    }

    @Override
    public String asString() {
        return url;
    }

}
