package is.hi.hbv401g.team1h.dao.mock;

import is.hi.hbv401g.team1h.dao.HotelDao;
import is.hi.hbv401g.team1h.model.Amenity;
import is.hi.hbv401g.team1h.model.Hotel;
import is.hi.hbv401g.team1h.model.Room;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.HandleCallback;

import java.util.ArrayList;
import java.util.List;

public class MockHotelDao implements HotelDao {

    private List<Hotel> listOfHotels = new ArrayList<>();

    public MockHotelDao() {
        resetListOfHotels();
    }

    public MockHotelDao(List<Hotel> hotelList) {
        this.listOfHotels = hotelList;
    }

    public void resetListOfHotels() {
        listOfHotels.clear();
        listOfHotels.add(new Hotel(1, "Mock Hotel A", "Address 1", "MockCity", 3.0, "Desc A"));
        listOfHotels.add(new Hotel(2, "Mock Hotel B", "Address 2", "NotMockCity", 4.0, "Desc B"));
        listOfHotels.add(new Hotel(3, "Mock Hotel C", "Address 3", "MockCity", 5.0, "Desc C"));
    }

    public void emptyListOfHotels() {
        listOfHotels.clear();
    }


    @Override
    public Hotel getById(int id){
        try {
            return listOfHotels.get(id-1);
        } catch (IndexOutOfBoundsException _) {
            return null;
        }
    }

    @Override
    public List<Hotel> getAll() {
        return listOfHotels;
    }

    @Override
    public List<Hotel> getByStarRating(double starRating) {
        List<Hotel> returnList = new ArrayList<>();

        for (Hotel hotel: listOfHotels) {
            if (hotel.getStarRating() == starRating) {
                returnList.add(hotel);
            }
        }
        return returnList;
    }

    @Override
    public List<Hotel> getByLocation(String city) {
        List<Hotel> returnList = new ArrayList<>();

        for (Hotel hotel: listOfHotels) {
            if (hotel.getCity().equals(city)) {
                returnList.add(hotel);
            }
        }
        return returnList;
    }

    @Override
    public List<Room> getRoomsForHotel(int hotelId) {
        return List.of();
    }

    @Override
    public List<Amenity> getAmenitiesForHotel(int hotelId) {
        return List.of();
    }

    @Override
    public List<Hotel> getHotelsMatchingAllAmenities(List<Integer> amenityIds, int size) {
        return List.of();
    }

    @Override
    public Handle getHandle() {
        return null;
    }

    @Override
    public <R, X extends Exception> R withHandle(HandleCallback<R, X> callback) throws X {
        return null;
    }
}
