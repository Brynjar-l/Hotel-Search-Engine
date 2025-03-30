package is.hi.hbv401g.team1h.service;

import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.model.Room;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class HotelService {
    private final Jdbi jdbi;
    public HotelService(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    /* ID is unique, will only return at most a single Hotel */
    public Hotel getById(int id) {
        return null;
    }

    /* Return a List of all Hotels that Match Criteria; StarRating, ListOfAmenities, etc */
    public List<Hotel> getAll() { return null; }
    public List<Hotel> getByStarRating(double starRating) { return null; }
    public List<Hotel> getByAmenities(List<Amenity> listOfAmenities) { return null; }
    public List<Hotel> getByLocation(String city) { return null; }

    /* Get Associations of a Hotel */
    public List<Room> getRoomsOfHotel(Hotel hotel) { return null; }
    public List<Amenity> getAmenitiesOfHotel(Hotel hotel) { return null; }


    /* Do Last */
    public List<Hotel> getHotelQueryBuilder() { return null; }


    /* Admin, Do Not Implement... */
    public void createNewHotel() {}
    public void deleteHotel() {}
    public void updateHotel() {}
}
