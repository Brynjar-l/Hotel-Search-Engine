package is.hi.hbv401g.team1h.service;


import is.hi.hbv401g.team1h.dao.HotelDao;
import is.hi.hbv401g.team1h.dao.mock.MockHotelDao;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.utils.JdbiManager;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.junit.jupiter.api.*;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    HotelService hotelService;
    static List<Hotel> listOfHotels;

    @BeforeAll
    static void setupHotelsList() {
        listOfHotels = new ArrayList<Hotel>();

        listOfHotels.add(new Hotel(1, "Mock Hotel A", "Address 1", "MockCity", 3.0, "Desc A"));
        listOfHotels.add(new Hotel(2, "Mock Hotel B", "Address 2", "NotMockCity", 4.0, "Desc B"));
        listOfHotels.add(new Hotel(3, "Mock Hotel C", "Address 3", "MockCity", 5.0, "Desc C"));
    }

    @BeforeEach
    void setup() {
        MockHotelDao mockDao = new MockHotelDao(listOfHotels);
        hotelService = new HotelService(mockDao);
    }


    @Nested
    class GetAllHotels {
        @Test
        void returnsNonEmptyArrayList_whenListIsNotEmpty() {
        }

        @Test
        void returnsEmptyArrayList_whenListIsEmpty() {
        }
    }


    @Nested
    class GetById {
        @Test
        void returnsCorrectResult_whenInputIdDoesExistInDatabase() throws SQLDataException {
            Hotel hotel = hotelService.getById(1);

            assertNotNull(hotel);
            assertEquals(1, hotel.getId());
        }

        @Test
        void throwsException_whenInputIdDoesNotExistInDatabase() {
            assertThrows(SQLDataException.class, () -> hotelService.getById(-1));
        }
    }


    @Nested
    class GetListOfHotelsByMatchingAttribute {
        @Nested
        class ByStarRating {
            @Test
            void returnsNonEmptyListOfMatchingHotels_whenMatchingHotelsExist() {

            }

            @Test
            void returnsEmptyList_whenNoHotelMatches() {

            }

            @Test
            void doesNotReturnPartialMatches_whenExactMatchIsRequired() {
                List<Hotel> result = hotelService.getByStarRating(3.1);
                assertTrue(result.isEmpty());
            }
        }

        @Nested
        class ByListOfAmenities {
            @Test
            void returnsNonEmptyListOfMatchingHotels_whenMatchingHotelsExist() {

            }

            @Test
            void returnsEmptyList_whenNoHotelMatches() {

            }

            @Test
            void throwsException_whenInputAmenityListIsIllegal() {

            }

            @Test
            void throwsException_whenInputAmenityListIsNull() {

            }
            // whitespace, uppercase
            // double checka að hotelið sem fæst til baka er með öll amenities
            // ^ bæta við í mockið

        }

        @Nested
        class ByLocation {
            @Test
            void returnsNonEmptyListOfMatchingHotels_whenMatchingHotelsExist() {

            }

            @Test
            void returnsEmptyList_whenNoHotelMatches() {

            }
        }
    }


    /* Seinna */
    @Test
    void getRoomsOfHotel() {
    }

    @Test
    void getAmenitiesOfHotel() {
    }

    /* Sleppa */
    @Test
    void getHotelQueryBuilder() {
    }

    @Test
    void createNewHotel() {
    }

    @Test
    void deleteHotel() {
    }

    @Test
    void updateHotel() {
    }
}