package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.HotelUrlsDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.OfferDateRangeDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.OffersDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.RestResponseDto;
import com.hamza.hotelsoffersapp.offer.model.implementation.http.GetApiEndpoint;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import static org.mockito.Mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

/**
 *
 * @author Hamza
 */
public class OfferRepositoryImplTest {

    private OfferRepositoryImpl repository;
    private RestTemplate rest;
    private GetApiEndpoint endpoint;

    @Before
    public void setup() {
        rest = mock(RestTemplate.class);
        endpoint = mock(GetApiEndpoint.class);

        when(endpoint.url()).thenReturn("");
        repository = new OfferRepositoryImpl(rest, endpoint);
    }

    @Test(expected = IllegalStateException.class)
    public void testFetchAll_ClientSideException() {
        when(rest.getForEntity(endpoint.url(), RestResponseDto.class)).thenThrow(RestClientException.class);
        repository.fetchAll();
    }

    @Test(expected = IllegalStateException.class)
    public void testFetchAll_ServerSideProblem() {
        ResponseEntity re = new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        when(rest.getForEntity(endpoint.url(), RestResponseDto.class)).thenReturn(re);
        repository.fetchAll();
    }

    @Test
    public void testFetchAll_EmptyList() {
        ResponseEntity re = new ResponseEntity(createResponseDtoFromHotelList(new ArrayList()), HttpStatus.OK);
        when(rest.getForEntity(endpoint.url(), RestResponseDto.class)).thenReturn(re);
        assertEquals(repository.fetchAll().size(), 0);
    }

    @Test
    public void testFetchAll_PopulatedList() {
        List<HotelDto> list = new ArrayList();

        List<Integer> startDate = new ArrayList();
        startDate.add(2005);
        startDate.add(5);
        startDate.add(22);

        List<Integer> endDate = new ArrayList();
        endDate.add(2005);
        endDate.add(5);
        endDate.add(24);

        HotelDto hotel1 = new HotelDto();
        hotel1.setOfferDateRange(new OfferDateRangeDto());
        hotel1.getOfferDateRange().setLengthOfStay(2);
        hotel1.getOfferDateRange().setTravelStartDate(startDate);
        hotel1.getOfferDateRange().setTravelEndDate(endDate);
        list.add(hotel1);

        HotelDto hotel2 = new HotelDto();
        hotel2.setHotelUrls(new HotelUrlsDto());
        hotel2.getHotelUrls().setHotelInfositeUrl("info");
        hotel2.getHotelUrls().setHotelSearchResultUrl("search");

        list.add(hotel2);
        ResponseEntity re = new ResponseEntity(createResponseDtoFromHotelList(list), HttpStatus.OK);

        when(rest.getForEntity(endpoint.url(), RestResponseDto.class)).thenReturn(re);

        List<Offer> offerList = repository.fetchAll();

        assertEquals(offerList.size(), 2);
        assertEquals(offerList.get(0).getTime().getTravelStartDate(), LocalDate.parse("2005-05-22"));
        assertEquals(offerList.get(0).getTime().getTravelEndDate(), LocalDate.parse("2005-05-24"));
        assertEquals(offerList.get(0).getTime().getLengthOfStay().toDays(), 2);
        assertEquals(offerList.get(1).getHotel().getUrls().getInfoSiteUrl(), "info");
        assertEquals(offerList.get(1).getHotel().getUrls().getSearchResultUrl(), "search");

    }

    private RestResponseDto createResponseDtoFromHotelList(List<HotelDto> lst) {
        OffersDto offersDto = new OffersDto();
        RestResponseDto res = new RestResponseDto();
        offersDto.setHotel(lst);
        res.setOffers(offersDto);
        return res;
    }

}
