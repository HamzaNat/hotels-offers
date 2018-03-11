package com.hamza.hotelsoffersapp.offer.model.implementation.filtering;

import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import java.util.AbstractMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import com.hamza.hotelsoffersapp.offer.model.filtering.QueryMedia;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hamza
 */
@Component
public class QueryImpl implements Query {

    NavigableMap<String, String> map;

    public QueryImpl() {
        map = new TreeMap();
    }

    @Override
    public void with(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void printTo(QueryMedia media) {
        map.entrySet().forEach((e) -> {
            media.print(e.getKey(), e.getValue());
        });
    }

}
