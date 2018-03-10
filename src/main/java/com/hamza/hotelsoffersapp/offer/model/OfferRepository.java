package com.hamza.hotelsoffersapp.offer.model;

import java.util.List;

/**
 *
 * @author Hamza
 */
public interface OfferRepository {

    /**
     * Returns a <em>List</em> instance contains all the <em>Offer</em>
     * objects.
     *
     * @return a <em>List</em> of <em>Offer</em> objects.
     * @throws IllegalStateException if there is any error happened during the
     * retrieving process.
     */
    List<Offer> fetchAll();
}
