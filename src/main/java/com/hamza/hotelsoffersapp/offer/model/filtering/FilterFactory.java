package com.hamza.hotelsoffersapp.offer.model.filtering;

/**
 *
 * @author Hamza
 */
public interface FilterFactory {

    /**
     * Returns a <em>Filter</em> that matches the specified name. If the
     * specified name doesn't match any filter, a <em>Null Object</em> is
     * returned.
     *
     * @param filterName
     * @param value
     * @return
     */
    Filter ctreateFilter(String filterName, String value);
}
