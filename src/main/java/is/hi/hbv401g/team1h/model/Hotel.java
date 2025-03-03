package is.hi.hbv401g.team1h.model;

import java.util.List;

public class Hotel {
    private Integer hotelId = null;
    private String hotelName;
    private String address;
    private String city;
    private String description;
    private double starRating;

    private List<Room> roomsList;
    private List<Amenity> amenitiesList;

    private Hotel(

            int hotelId,
            String hotelName,
            String address,
            String city,
            String description,
            double starRating
    ) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.city = city;
        this.description = description;
        this.starRating = starRating;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public List<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<Room> roomsList) {
        this.roomsList = roomsList;
    }

    public void addRoom(Room room) {
        roomsList.add(room);
    }

    public List<Amenity> getAmenitiesList() {
        return amenitiesList;
    }

    public void setAmenitiesList(List<Amenity> amenitiesList) {
        this.amenitiesList = amenitiesList;
    }

    public void addAmenity(Amenity amenity) {
        amenitiesList.add(amenity);
    }
}
