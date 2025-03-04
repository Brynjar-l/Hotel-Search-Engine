package is.hi.hbv401g.team1h.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.time.LocalDate;
import java.util.List;

public class Room {
    private final int roomId;

    private final int hotelId;
    private final String roomNumber;
    private final int pricePerNight;

    private List<LocalDate> unavailableDates;


    /**
     * Return object, never manually instantiated
     */
    public Room(
            @ColumnName("room_id") int roomId,
            @ColumnName("hotel_id") int hotelId,
            @ColumnName("room_number") String roomNumber,
            @ColumnName("room_price_per_night") int pricePerNight
    ) {
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;

        // TODO update unavailableDates in Service
    }
}
