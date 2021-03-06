package com.hamza.hotelsoffersapp.offer.model.implementation.filtering;

import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import java.util.NavigableMap;
import java.util.TreeMap;
import com.hamza.hotelsoffersapp.offer.model.filtering.QueryMedia;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hamza
 */
@Component
@Scope("prototype")
public class QueryImpl implements Query {

    NavigableMap<String, String> map;

    public QueryImpl() {
        map = new TreeMap();
    }

    @Override
    public void with(String key, String value) {
        if (!"".equals(value)) {
            map.put(key, value);
        }
    }

    @Override
    public void printTo(QueryMedia media) {
        map.entrySet().forEach((e) -> {
            media.print(e.getKey(), e.getValue());
        });
    }

}
