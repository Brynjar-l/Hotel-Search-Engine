package is.hi.hbv401g.team1h.service;

import is.hi.hbv401g.team1h.dao.AmenityDao;
import is.hi.hbv401g.team1h.dao.BookingDao;
import is.hi.hbv401g.team1h.dao.HotelDao;
import is.hi.hbv401g.team1h.dao.RoomDao;
import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.utils.QueryObject;
import org.jdbi.v3.core.Jdbi;

import java.time.LocalDate;
import java.util.*;


//public class SearchService {
//    private QueryObject currentQuery;
//
//    private Jdbi jdbi;
//    private HotelDao hotelDao;
//    private AmenityDao amenityDao;
//    private BookingDao bookingDao;
//    private RoomDao roomDao;
//
//
//
//    public SearchService(Jdbi jdbi) {
//        newQuery();
//
//        this.jdbi = jdbi;
//
//        hotelDao = jdbi.onDemand(HotelDao.class);
//        amenityDao = jdbi.onDemand(AmenityDao.class);
//        bookingDao = jdbi.onDemand(BookingDao.class);
//        roomDao = jdbi.onDemand(RoomDao.class);
//    }
//
//    public void newQuery() {this.currentQuery = new QueryObject();}
//
//    // call once: amenity added, call again: amenity removed, call again: amenity added, o.s.frv.
//    public void toggleAmenity(String filter) {
//        // convert
//    }
//    public void toggleAmenity(Amenity amenity) {
//        currentQuery.addClause(amenity);
//    }
//
//
//
//    public void setPriceRange(int lowerBound, int upperBound) {
//
//        if (lowerBound > upperBound) throw new IllegalArgumentException("lower bound must be greater than upper bound");
//
//        setPriceLowerBound(lowerBound);
//        setPriceUpperBound(upperBound);
//    }
//
//    public void setPriceLowerBound(int lowerBound) {
//        if (lowerBound < 0) throw new IllegalArgumentException("lower bound cannot be negative");
//
//        currentQuery.setPriceLowerBound(lowerBound);
//    }
//    public void setPriceUpperBound(int upperBound) {
//        if (upperBound < 0) throw new IllegalArgumentException("upper bound cannot be negative");
//
//        currentQuery.setPriceUpperBound(upperBound);
//    }
//
//
//
//    public void setDateRange(LocalDate fromDate, LocalDate toDate) {
//
//    }
//    public void setDateFrom(LocalDate fromDate) {
//        LocalDate today = LocalDate.now();
//
//        if (fromDate.isBefore(today)) throw new IllegalArgumentException("fromDate cannot be before today");
//
//        currentQuery.setFromDate(fromDate);
//    }
//
//    public void setDateTo(LocalDate toDate) {
//        LocalDate today = LocalDate.now();
//
//        if (toDate.isBefore(today)) throw new IllegalArgumentException("toDate cannot be before today");
//
//        currentQuery.setToDate(toDate);
//    }
//
//    private void errorCheck() {
//
//        // if neither date was modified, show all future available dates
//        if (currentQuery.getFromDate() == null && currentQuery.getToDate() == null) {
//            currentQuery.setDateRange(LocalDate.now(), LocalDate.MAX);
//        }
//
//        // if one date, but not both, was modified then throw an exception.
//        if (currentQuery.getFromDate() == null && currentQuery.getToDate() != null
//                        || currentQuery.getFromDate() != null && currentQuery.getToDate() == null) {
//            throw new RuntimeException("Must Select both from and to date");
//        }
//
//        // if fromDate comes after toDate, throw runtime exception
//        if (currentQuery.getFromDate().isAfter(currentQuery.getToDate())) {
//            throw new RuntimeException("FromDate must come before To Date");
//        }
//
//        // if both price settings are untouched, default to the entire range
//        if (currentQuery.getPriceLowerBound() == null || currentQuery.getPriceUpperBound() == null) {
//            currentQuery.setPriceLowerBound(0);
//            currentQuery.setPriceUpperBound(Integer.MAX_VALUE);
//        }
//
//
//
//    }
//
//
//    public List<Hotel> search() {
//        errorCheck();
//
//
//
//        return null;
//    }
//}


