package is.hi.hbv401g.team1h.dao;

import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.model.Room;
import org.jdbi.v3.sqlobject.SqlObject;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterConstructorMapper(Hotel.class)
public interface HotelDao extends SqlObject {

    @SqlQuery("SELECT * FROM hotels WHERE (hotel_id = :id)")
    Hotel getById(@Bind("id") int id);

    @SqlQuery("SELECT * FROM hotels")
    List<Hotel> getAll();


    @SqlQuery("SELECT * FROM ")
    List<Hotel> getByStarRating(double star);
    List<Hotel> getByLocation(String city);
    List<Amenity> getAmenitiesForHotel(int hotelId);
    List<Room> getRoomsForHotel(int hotelId);
}


