package is.hi.hbv401g.team1h.service;


import is.hi.hbv401g.team1h.utils.JdbiManager;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class HotelServiceTest {

    @BeforeAll
    static void setup() {
        Jdbi jdbi = Jdbi.create("jdbc:sqlite::memory:");
        jdbi.installPlugin(new SqlObjectPlugin());

        JdbiManager.populate(jdbi);
        // -> add rooms to roomsTable
        // -> add bookings to bookingsTable

    }


    @Test
    void getHotelById() {

    }

    @Test
    void getAll() {
    }

    @Test
    void getByStarRating() {
    }

    @Test
    void getByAmenities() {
    }

    @Test
    void getByLocation() {
    }


    /* Seinna */
    @Test
    void getRoomsOfHotel() {}
    @Test
    void getAmenitiesOfHotel() {}

    /* Sleppa */
    @Test
    void getHotelQueryBuilder() {}
    @Test
    void createNewHotel() {}
    @Test
    void deleteHotel() {}
    @Test
    void updateHotel() {}
}