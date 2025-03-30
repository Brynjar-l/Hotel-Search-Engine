package is.hi.hbv401g.team1h.dao;

import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.model.Room;
import org.jdbi.v3.sqlobject.SqlObject;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindList;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterConstructorMapper(Hotel.class)
@RegisterConstructorMapper(Amenity.class)
@RegisterConstructorMapper(Room.class)
public interface HotelDao extends SqlObject {

    @SqlQuery("SELECT * FROM hotels WHERE (hotel_id = :id)")
    Hotel getById(@Bind("id") int id);

    @SqlQuery("SELECT * FROM hotels")
    List<Hotel> getAll();

    @SqlQuery("SELECT * FROM hotels WHERE star_rating = :star")
    List<Hotel> getByStarRating(@Bind("star") double starRating);

    @SqlQuery("SELECT * FROM hotels WHERE hotel_city = :city")
    List<Hotel> getByLocation(@Bind("city") String city);

    @SqlQuery("SELECT * FROM rooms WHERE hotel_id = :hotelId")
    List<Room> getRoomsForHotel(@Bind("hotelId") int hotelId);

    @SqlQuery("""
        SELECT a.* FROM amenities a
        JOIN hotel_amenities ha ON a.amenity_id = ha.amenity_id
        WHERE ha.hotel_id = :hotelId
    """)
    List<Amenity> getAmenitiesForHotel(@Bind("hotelId") int hotelId);

    @SqlQuery("""
        SELECT h.* FROM hotels h JOIN hotel_amenities ha ON h.hotel_id = ha.hotel_id
            WHERE ha.amenity_id IN (:amenityIds)
            GROUP BY h.hotel_id
            HAVING COUNT(DISTINCT ha.amenity_id) = (:size)
    """)
    List<Hotel> getHotelsMatchingAllAmenities(
            @BindList("amenityIds") List<Integer> amenityIds,
            @Bind("size") int size
    );
}


