package com.hamza.hotelsoffersapp.offer;

import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import com.hamza.hotelsoffersapp.offer.model.filtering.FilterFactory;
import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hamza
 */
@Controller
@RequestMapping("/Offers")
public class OfferController {

    private final OfferRepository repository;
    private final FilterFactory filterFactory;
    private final Query query;

    @Autowired
    public OfferController(OfferRepository repository, FilterFactory filterFactory, Query query) {
        this.repository = repository;
        this.filterFactory = filterFactory;
        this.query = query;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get(@RequestParam Map<String, String> requestParams) {
        ModelAndView model = new ModelAndView("OfferView");
        List<Offer> offers = new ArrayList();
        applyEachParamFilterToQuery(requestParams);
        try {
            offers = repository.fetch(query);
        } catch (Throwable e) {
            model.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        model.addObject("offers", offers);
        return model;
    }

    private void applyEachParamFilterToQuery(Map<String, String> requestParams) {
        requestParams.entrySet().forEach(x -> {
            filterFactory.ctreateFilter(x.getKey(), x.getValue()).applyTo(query);
        });
    }
}
