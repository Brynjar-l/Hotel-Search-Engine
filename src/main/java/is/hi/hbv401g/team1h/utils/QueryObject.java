package is.hi.hbv401g.team1h.utils;

import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;

import java.time.LocalDate;
import java.util.*;

public class QueryObject {

    Set<Amenity> clauseList;    // no duplicates

    Integer priceLowerBound;
    Integer priceUpperBound;

    LocalDate fromDate;
    LocalDate toDate;


    public QueryObject() {
        clauseList = new HashSet<Amenity>();
    }

    public List<Hotel> execute() {
        if (fromDate == null || toDate == null) {
            throw new IllegalArgumentException("fromDate and toDate are required");
        }
        if (fromDate.isAfter(toDate)) {
            throw new IllegalArgumentException("fromDate is after toDate");
        }
        if (priceLowerBound == null || priceUpperBound == null ) {
            throw new IllegalArgumentException("priceLowerBound and priceUpperBound are required");
        }
        if (priceLowerBound > priceUpperBound) {
            throw new IllegalArgumentException("priceLowerBound > priceUpperBound");
        }

        // clause list, no forget
        return null; // dao call and return list
    }




    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }
    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
    public void setDateRange(LocalDate fromDate, LocalDate toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
    public Optional<LocalDate> getFromDate() {
        return Optional.ofNullable(fromDate);
    }
    public LocalDate getToDate() {
        return toDate;
    }



    public void setPriceLowerBound(int priceLowerBound) {
        this.priceLowerBound = priceLowerBound;
    }
    public void setPriceUpperBound(int priceUpperBound) {
        this.priceUpperBound = priceUpperBound;
    }
    public Integer getPriceLowerBound() {
        return priceLowerBound;
    }
    public Integer getPriceUpperBound() {
        return priceUpperBound;
    }



    public void addClause(Amenity clause) {     // does not throw an exception on duplicate input
        clauseList.add(clause);
    }
    public void removeClause(Amenity clause) {  // does not throw an exception if element does not exist in list
        clauseList.remove(clause);
    }

    public List<Amenity> getClauseList() {
        return new ArrayList<>(clauseList);
    }
}
