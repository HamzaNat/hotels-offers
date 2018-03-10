package com.hamza.hotelsoffersapp.offer.model.implementation;

import com.hamza.hotelsoffersapp.offer.model.OfferDateRange;
import com.hamza.hotelsoffersapp.offer.model.implementation.dto.OfferDateRangeDto;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Hamza
 */
public class OfferDateRangeImpl implements OfferDateRange {

    private final OfferDateRangeDto dateRange;

    public OfferDateRangeImpl(OfferDateRangeDto dateRange) {
        this.dateRange = dateRange;
    }

    @Override
    public LocalDate getTravelStartDate() {
        return LocalDate.parse(
                formatListToDateString(dateRange.getTravelStartDate())
        );
    }

    @Override
    public Duration getLengthOfStay() {
        return Duration.ofDays(dateRange.getLengthOfStay());
    }

    @Override
    public LocalDate getTravelEndDate() {
        return LocalDate.parse(
                formatListToDateString(dateRange.getTravelEndDate())
        );
    }

    private String formatListToDateString(List<Integer> list) {
        String year = list.get(0).toString();
        String month = list.get(1).toString();
        String day = list.get(2).toString();

        year = String.format("%4s", year).replace(" ", "0");
        month = String.format("%2s", month).replace(" ", "0");
        day = String.format("%2s", day).replace(" ", "0");

        return year + "-" + month + "-" + day;
    }

}
