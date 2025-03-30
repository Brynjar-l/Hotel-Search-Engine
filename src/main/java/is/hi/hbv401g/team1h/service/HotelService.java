package is.hi.hbv401g.team1h.service;

import is.hi.hbv401g.team1h.dao.HotelDao;
import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.model.Room;
import org.jdbi.v3.core.Jdbi;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;

import org.jdbi.v3.core.Jdbi;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

public class HotelService {

    private final Jdbi jdbi;
    private final HotelDao hd;

    public HotelService(Jdbi jdbi) {
        this.jdbi = jdbi;
        this.hd = jdbi.onDemand(HotelDao.class);
    }

    public Hotel getById(int id) throws SQLDataException {
        Hotel hotel = hd.getById(id);
        if (hotel == null) {
            throw new SQLDataException("Hotel with ID " + id + " does not exist");
        }
        return hotel;
    }

    public List<Hotel> getAll() {
        return hd.getAll();
    }

    public List<Hotel> getByStarRating(double starRating) {
        return hd.getByStarRating(starRating);
    }

    public List<Hotel> getByAmenities(List<Integer> listOfAmenities) {
        return hd.getHotelsMatchingAllAmenities(
                listOfAmenities,
                listOfAmenities.size()
        );
    }

    public List<Hotel> getByLocation(String city) {
        return hd.getByLocation(city);
    }

    public List<Room> getRoomsOfHotel(Hotel hotel) {
        return hd.getRoomsForHotel(hotel.getId());
    }

    public List<Amenity> getAmenitiesOfHotel(Hotel hotel) {
        return hd.getAmenitiesForHotel(hotel.getId());
    }




    /* Do Last */
    public List<Hotel> getHotelQueryBuilder() { return null; }


    /* Admin, Do Not Implement... */
    public void createNewHotel() {}
    public void deleteHotel() {}
    public void updateHotel() {}
}
