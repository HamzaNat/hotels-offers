package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import com.hamza.hotelsoffersapp.offer.model.implementation.api.ApiEndpoint;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.RestResponseDto;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    private final RestTemplate rest;
    private final ApiEndpoint apiEndpoint;

    @Autowired
    public OfferRepositoryImpl(RestTemplate rest, @Qualifier("GetOffers") ApiEndpoint apiEndpoint) {
        this.rest = rest;
        this.apiEndpoint = apiEndpoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Offer> fetchAll() {
        ResponseEntity<RestResponseDto> response;
        try {
            response = rest.getForEntity(apiEndpoint.url(), RestResponseDto.class);
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
}
