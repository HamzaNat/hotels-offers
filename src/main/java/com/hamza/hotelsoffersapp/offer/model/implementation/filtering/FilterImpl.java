package com.hamza.hotelsoffersapp.offer.model.implementation.filtering;

import com.hamza.hotelsoffersapp.offer.model.filtering.Filter;
import com.hamza.hotelsoffersapp.offer.model.filtering.Query;

/**
 *
 * @author Hamza
 */
public class FilterImpl implements Filter {

    private final String key;
    private final String value;

    public FilterImpl(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void applyTo(Query query) {
        query.with(key, value);
    }

}
