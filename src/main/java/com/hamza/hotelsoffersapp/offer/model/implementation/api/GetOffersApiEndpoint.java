package com.hamza.hotelsoffersapp.offer.model.implementation.api;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hamza
 */
@Component("GetOffers")
public class GetOffersApiEndpoint extends AbstractApiEndpoint {

    public GetOffersApiEndpoint() {
        super("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel");
    }

}
