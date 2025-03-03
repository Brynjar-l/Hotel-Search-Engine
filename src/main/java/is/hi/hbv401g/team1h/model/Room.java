package is.hi.hbv401g.team1h.model;

public class Room {
    private int hotelId;
    private int roomId;

    private String roomName;
    private int numberOfBeds;
    private int pricePerNight;

    public Room(
            int hotelId,
            String roomName,
            int numberOfBeds,
            int pricePerNight
    ) {
        this.hotelId = hotelId;
        this.roomName = roomName;
        this.numberOfBeds = numberOfBeds;
        this.pricePerNight = pricePerNight;
    }
}
