package is.hi.hbv401g.team1h.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class Booking {
    private final int bookingId;  // primary key


    private final LocalDate fromDate;
    private final LocalDate toDate;

    private final long numberOfNights;
    private final int totalPrice;


    private Hotel hotel;
    private Room room;

    private int hotelId;
    private int roomId;


    /**
     * Return object, never manually instantiated
     */
    public Booking(
            @ColumnName("booking_id") int bookingId,
            @ColumnName("room_id") int roomId,
            @ColumnName("from_date") String fromDate,
            @ColumnName("to_date") String toDate,
            @ColumnName("total_price") int totalPrice
    ) {
        this.bookingId = bookingId;
        this.roomId = roomId;

        this.fromDate = LocalDate.parse(fromDate);
        this.toDate = LocalDate.parse(toDate);

        this.numberOfNights = dayDifference(this.fromDate, this.toDate);
        this.totalPrice = totalPrice;


        // this.hotelId getit
        // this.hotel = get it from hotelId
        // this.room = get it from roomId
        // TODO actually, do that in service class instead?
    }


    /**
     *
     * @param date in ISO-8601 Format!
     * @return LocalDate object
     */
    private LocalDate toDate(String date) {
        return LocalDate.parse(date);
    }

    /**
     *
     * @param fromDate startDate
     * @param toDate endDate
     * @return the range of the from and to date in a long unit. -1 if input is invalid, treat as error.
     */
    private long dayDifference(LocalDate fromDate, LocalDate toDate) {
        if (fromDate.isBefore(toDate)) {
            return -1;
        }

        return ChronoUnit.DAYS.between(fromDate, toDate);
    }
}
