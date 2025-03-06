package is.hi.hbv401g.team1h.utils;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

public class JdbiManager {
    private static final String URL = "jdbc:sqlite:src/main/resources/datbs.sqlite";
    private static volatile Jdbi jdbiInstance;

    private JdbiManager() {}

    public static Jdbi getInstance() {
        if (jdbiInstance == null) {
            synchronized (JdbiManager.class) {
                if (jdbiInstance == null) {
                    jdbiInstance = Jdbi.create(URL);
                    jdbiInstance.installPlugin(new SqlObjectPlugin());

                    instantiate();
                }
            }
        }
        return jdbiInstance;
    }


    private static void populate() {
        // TODO fill db with rows if it's being instantiated for the first time, perhaps make it optional as well?
    }

    private static void instantiate() {
        jdbiInstance.useHandle(handle -> {
            handle.execute("""
            
                CREATE TABLE IF NOT EXISTS hotels (
                    hotel_id        INTEGER PRIMARY KEY AUTOINCREMENT,
                    hotel_name      TEXT NOT NULL,
                    hotel_address   TEXT NOT NULL,
                    hotel_city      TEXT NOT NULL,
                    star_rating     DOUBLE CHECK ( star_rating BETWEEN 0.0 AND 5.0),
                    description     TEXT
            )     
                
            """);

            handle.execute("""
            
                CREATE TABLE IF NOT EXISTS rooms (
                    room_id         INTEGER PRIMARY KEY AUTOINCREMENT,
                    hotel_id        INTEGER NOT NULL,
                    room_number     TEXT,
                    room_price_per_night INTEGER NOT NULL,
                
                    FOREIGN KEY (hotel_id) REFERENCES hotels(hotel_id)
            )
            
            """);

            handle.execute("""
                
                CREATE TABLE IF NOT EXISTS amenities (
                    amenity_id      INTEGER PRIMARY KEY AUTOINCREMENT,
                    amenity_name    TEXT NOT NULL UNIQUE
                )
            
            """);

            handle.execute("""
            
                CREATE TABLE IF NOT EXISTS hotel_amenities (
                    hotel_id        INTEGER NOT NULL,
                    amenity_id      INTEGER NOT NULL,
                
                    PRIMARY KEY (hotel_id, amenity_id),
                
                    FOREIGN KEY (hotel_id) REFERENCES hotels(hotel_id) ON DELETE CASCADE,
                    FOREIGN KEY (amenity_id) REFERENCES amenities(amenity_id) ON DELETE CASCADE
                )
            
            """);

            handle.execute("""
            
                CREATE TABLE IF NOT EXISTS bookings (
                    booking_id 		INTEGER PRIMARY KEY AUTOINCREMENT,
                    room_id			INTEGER NOT NULL,
                    from_date		TEXT NOT NULL,
                    to_date			TEXT NOT NULL,
                    total_price		INTEGER NOT NULL,
                
                    FOREIGN KEY (room_id) REFERENCES rooms(room_id) ON DELETE CASCADE
                )
            
            """);
        });
    }
}
