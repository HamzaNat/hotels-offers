package com.hamza.hotelsoffersapp.offer;

import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import com.hamza.hotelsoffersapp.offer.model.filtering.FilterFactory;
import com.hamza.hotelsoffersapp.offer.model.filtering.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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

    @Autowired
    private ApplicationContext context;
    private final OfferRepository repository;
    private final FilterFactory filterFactory;

    @Autowired
    public OfferController(OfferRepository repository, FilterFactory filterFactory) {
        this.repository = repository;
        this.filterFactory = filterFactory;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get(@RequestParam Map<String, String> requestParams) {
        ModelAndView model = new ModelAndView("OfferView");
        List<Offer> offers = new ArrayList();
        Query q = createQuery();
        applyEachParamFilterToQuery(q, requestParams);
        try {
            offers = repository.fetch(q);
        } catch (Throwable e) {
            model.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        model.addObject("offers", offers);
        return model;
    }

    private void applyEachParamFilterToQuery(Query q, Map<String, String> requestParams) {
        requestParams.entrySet().forEach(x -> {
            filterFactory.ctreateFilter(x.getKey(), x.getValue()).applyTo(q);
        });
    }

    private Query createQuery() {
        return context.getBean(Query.class);
    }
}
