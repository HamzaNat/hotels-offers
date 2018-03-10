package com.hamza.hotelsoffersapp;

import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import com.hamza.hotelsoffersapp.offer.model.implementation.api.ApiEndpoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelsOffersApplicationTests {

    @Autowired
    OfferRepository offerRepository;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    @Qualifier("GetOffers")
    ApiEndpoint apiEndpoint;

    @Test
    public void contextLoads() {
        assertNotNull(offerRepository);
        assertNotNull(restTemplate);
        assertNotNull(apiEndpoint);
    }
}
