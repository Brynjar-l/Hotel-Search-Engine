package is.hi.hbv401g.team1h.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.List;

public class Hotel {
    private int id;

    private String name;
    private String address;
    private String city;
    private String description;
    private double starRating;

    private List<Room> roomsList;
    private List<Amenity> amenitiesList;


    /**
     * Return object, never manually instantiated
     */
    public Hotel(
            @ColumnName("hotel_id") int hotelId,
            @ColumnName("hotel_name") String name,
            @ColumnName("hotel_address") String address,
            @ColumnName("hotel_city") String city,
            @ColumnName("star_rating") double starRating,
            @ColumnName("description") String description
    ) {
        this.id = hotelId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.starRating = starRating;
        this.description = description;


        // todo, fill roomsList and amenitiesList in Service
    }
}
