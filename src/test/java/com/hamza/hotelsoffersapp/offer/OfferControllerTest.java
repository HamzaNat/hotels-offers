package com.hamza.hotelsoffersapp.offer;

import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import com.hamza.hotelsoffersapp.offer.model.filtering.FilterFactory;
import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import java.util.ArrayList;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

/**
 *
 * @author Hamza
 */
@RunWith(SpringRunner.class)
@WebMvcTest(OfferController.class)
public class OfferControllerTest {

    @MockBean
    OfferRepository repository;
    @MockBean
    FilterFactory filterFactory;
    @MockBean
    Query query;
    @Autowired
    MockMvc mvc;

    @Test
    public void testGet_Success() throws Exception {
        when(repository.fetch(query)).thenReturn(new ArrayList());
        mvc.perform(get("/Offers"))
                .andExpect(status().isOk())
                .andExpect(view().name("OfferView"))
                .andExpect(model().size(1))
                .andExpect(model().attributeExists("offers"));
    }

    @Test
    public void testGet_RuntimeExcpetion() throws Exception {
        when(repository.fetch(query)).thenThrow(RuntimeException.class);
        mvc.perform(get("/Offers"))
                .andExpect(status().isInternalServerError())
                .andExpect(model().size(0));
    }
}
