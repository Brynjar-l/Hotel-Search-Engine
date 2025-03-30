package is.hi.hbv401g.team1h.service;

import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.model.Room;

import java.util.List;

public class HotelService {

    /* ID is unique, will only return at most a single Hotel */
    public static Hotel getById(int id) { return null; }

    /* Return a List of all Hotels that Match Criteria; StarRating, ListOfAmenities, etc */
    public static List<Hotel> getAll() { return null; }
    public static List<Hotel> getByStarRating(double starRating) { return null; }
    public static List<Hotel> getByAmenities(List<Amenity> listOfAmenities) { return null; }
    public static List<Hotel> getByLocation(String city) { return null; }

    /* Get Associations of a Hotel */
    public static List<Room> getRoomsOfHotel(Hotel hotel) { return null; }
    public static List<Amenity> getAmenitiesOfHotel(Hotel hotel) { return null; }


    /* Do Last */
    public static List<Hotel> getHotelQueryBuilder() { return null; }


    /* Admin, Do Not Implement... */
    public static void createNewHotel() {}
    public static void deleteHotel() {}
    public static void updateHotel() {}
}
