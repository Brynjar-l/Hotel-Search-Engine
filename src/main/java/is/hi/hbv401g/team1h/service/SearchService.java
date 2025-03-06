package is.hi.hbv401g.team1h.service;

import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.utils.QueryObject;

import java.time.LocalDate;
import java.util.*;

public class SearchService {
    private QueryObject currentQuery;


    public SearchService() {
        newQuery();
    }


    public void newQuery() {
        this.currentQuery = new QueryObject();
    }



    // call once: amenity added, call again: amenity removed, call again: amenity added, o.s.frv.
    public void toggleAmenity(String filter) {
        // convert
    }
    public void toggleAmenity(Amenity amenity) {
        currentQuery.addClause(amenity);
    }



    public void setPriceRange(int lowerBound, int upperBound) {

    }
    public void setPriceLowerBound(int lowerBound) {

    }
    public void setPriceUpperBound(int upperBound) {

    }



    public void setDateRange(LocalDate fromDate, LocalDate toDate) {

    }
    public void setDateFrom(LocalDate fromDate) {

    }
    public void setDateTo(LocalDate toDate) {

    }

    private void errorCheck() {

        // if neither date was modified, show all future available dates
        if (currentQuery.getFromDate() == null && currentQuery.getToDate() == null) {
            currentQuery.setDateRange(LocalDate.now(), LocalDate.MAX);
        }

        // if one date, but not both, was modified then throw an exception.
        if (currentQuery.getFromDate() == null && currentQuery.getToDate() != null
                        || currentQuery.getFromDate() != null && currentQuery.getToDate() == null) {
            throw new RuntimeException("Must Select both from and to date");
        }

        // if fromDate comes after toDate, throw runtime exception
        if (currentQuery.getFromDate().isAfter(currentQuery.getToDate())) {
            throw new RuntimeException("FromDate must come before To Date");
        }

        // if both price settings are untouched, default to the entire range
        if (currentQuery.getPriceLowerBound() == null || currentQuery.getPriceUpperBound() == null) {
            currentQuery.setPriceLowerBound(0);
            currentQuery.setPriceUpperBound(Integer.MAX_VALUE);
        }



    }


    public List<Hotel> search() {
        errorCheck();



        return null;
    }
}


