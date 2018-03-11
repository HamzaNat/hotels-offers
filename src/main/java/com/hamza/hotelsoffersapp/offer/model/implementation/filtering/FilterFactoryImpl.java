package com.hamza.hotelsoffersapp.offer.model.implementation.filtering;

import com.hamza.hotelsoffersapp.offer.model.filtering.Filter;
import com.hamza.hotelsoffersapp.offer.model.filtering.FilterFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hamza
 */
// Used a factory to decouple filer names from web tier and data access tier. But for now, filters names are identical
@Component
public class FilterFactoryImpl implements FilterFactory {

    private final List<String> knownFilters = new ArrayList();
    private final Filter nullFilter = new NullFilter();

    /**
     * {@inheritDoc}
     */
    @Override
    public Filter ctreateFilter(String filterName, String value) {
        if (!knownFilters.contains(filterName)) {
            return nullFilter;
        }
        return new FilterImpl(filterName, value);
    }

    {
        List<String> l = knownFilters;
        l.add("destinationName");
        l.add("destinationCity");
        l.add("regionIds");
        l.add("minTripStartDate");
        l.add("maxTripStartDate");
        l.add("lengthOfStay");
        l.add("minStarRating");
        l.add("maxStarRating");
        l.add("minTotalRate");
        l.add("maxTotalRate");
        l.add("minGuestRating");
        l.add("maxGuestRating");
    }
}
