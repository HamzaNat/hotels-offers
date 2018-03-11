package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.RestResponseDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.http.GetApiEndpoint;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Hamza
 */
@Component
public class OfferRepositoryImpl implements OfferRepository {

    private final ApplicationContext context;
    private final RestTemplate rest;

    @Autowired
    public OfferRepositoryImpl(RestTemplate rest, ApplicationContext applicationContext) {
        this.rest = rest;
        this.context = applicationContext;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Offer> fetchAll() {
        return fetchFrom(createEndpoint());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Offer> fetch(Query query) {
        GetApiEndpoint endpoint = createEndpoint();
        query.printTo(endpoint);
        return fetchFrom(endpoint);
    }

    private List<Offer> fetchFrom(GetApiEndpoint endpoint) {
        ResponseEntity<RestResponseDto> response;
        try {
            response = rest.getForEntity(endpoint.url(), RestResponseDto.class);
        } catch (RestClientException e) {
            throw new IllegalStateException(e);
        }
        checkIfResponseIsOkOrElseThrowAnException(response);
        return mapToOfferList(response.getBody());
    }

    private void checkIfResponseIsOkOrElseThrowAnException(ResponseEntity re) {
        if (re.getStatusCodeValue() != 200) {
            throw new IllegalStateException("Server returned " + re.getStatusCodeValue() + " response code");
        }
    }

    private List<Offer> mapToOfferList(RestResponseDto response) {
        return response
                .getOffers()
                .getHotel()
                .stream()
                .map(x -> new OfferImpl(x))
                .collect(Collectors.toList());
    }

    private GetApiEndpoint createEndpoint() {
        return context.getBean("GetOffers", GetApiEndpoint.class);
    }
}
