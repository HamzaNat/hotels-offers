package com.hamza.hotelsoffersapp.offer.model;

import java.util.List;

/**
 *
 * @author Hamza
 */
public interface OfferRepository {

    List<Offer> fetchAll();
}
