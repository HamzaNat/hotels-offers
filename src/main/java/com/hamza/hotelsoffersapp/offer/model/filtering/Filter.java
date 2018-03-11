package com.hamza.hotelsoffersapp.offer.model.filtering;

/**
 * A <em>Filter</em> represents a rule by which data will be retrieved from it's
 * store.
 *
 * @author Hamza
 */
public interface Filter {

    /**
     * 
     * @param query 
     */
    void applyTo(Query query);

}
