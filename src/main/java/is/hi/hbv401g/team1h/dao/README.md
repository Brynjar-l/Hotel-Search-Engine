# Dao Layer (Package)

## Overview
The **Dao** **_(Data Access Object)_** Layer is responsible for interacting
with the database. It provides an abstraction for db operations
and separates interaction logic from the business logic.

Each class represents a table in the database. 
Note that there exists one more table `hotel_amenities`,
which is a many-to-many bridge for hotels and amenities.

## Classes
- [`HotelDao.java`](HotelDao.java)
- [`RoomDao.java`](RoomDao.java)
- [`BookingDao.java`](BookingDao.java) 
- [`AmenityDao.java` ](AmenityDao.java)

## TODOs

- [ ] everything