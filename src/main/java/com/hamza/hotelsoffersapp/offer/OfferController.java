package com.hamza.hotelsoffersapp.offer;

import com.hamza.hotelsoffersapp.offer.model.Offer;
import com.hamza.hotelsoffersapp.offer.model.OfferRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hamza
 */
@Controller
@RequestMapping("/Offers")
public class OfferController {

    private final OfferRepository repository;

    @Autowired
    public OfferController(OfferRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView model = new ModelAndView("OfferView");
        List<Offer> offers = new ArrayList();
        try {
            offers = repository.fetchAll();
        } catch (Throwable e) {
            model.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        model.addObject("offers", offers);
        return model;
    }
}
