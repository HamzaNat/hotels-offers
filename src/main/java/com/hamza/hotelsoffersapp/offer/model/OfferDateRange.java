package com.hamza.hotelsoffersapp.offer.model;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author Hamza
 */
public interface OfferDateRange {

    LocalDate getTravelStartDate();

    Duration getLengthOfStay();

    LocalDate getTravelEndDate();
}
