package com.hamza.hotelsoffersapp.offer.model.implementation.filtering;

import com.hamza.hotelsoffersapp.offer.model.filtering.Filter;
import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hamza
 */
public class NullFilter implements Filter {

    @Override
    public void applyTo(Query query) {

    }

}
