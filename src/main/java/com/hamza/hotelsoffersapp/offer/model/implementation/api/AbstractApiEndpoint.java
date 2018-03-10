package com.hamza.hotelsoffersapp.offer.model.implementation.api;

/**
 *
 * @author Hamza
 */
public class AbstractApiEndpoint implements ApiEndpoint {

    private final String url;

    public AbstractApiEndpoint(String url) {
        this.url = url;
    }

    @Override
    public String url() {
        return url;
    }

}
