package com.hamza.hotelsoffersapp.offer.model.filtering;

/**
 * A <em>Query<em> is a set of rules that that determine which data will be
 * fetched from it's store.
 *
 * @author Hamza
 */
public interface Query {

    /**
     * Allows a client to create or replace a rule.
     * @param key name of a <em>Filter</em>.
     * @param value 
     */
    void with(String key, String value);

    /**
     * Extracts current rules to other forms.
     * @param media 
     */
    void printTo(QueryMedia media);
}
