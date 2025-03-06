# Model Layer (Package)

## Overview
The **Model** Layer designates classes that a row from a db table can map to,
this allows us to work with java classes at a higher level.

They aren't meant to be manually instantiated,
but are used by, or created and returned from, the Dao's.

## Classes
- [`Hotel.java`](Hotel.java)  ---> 
  - hotelId
  - hotelName
  - address
  - city
  - starRating
  - description


- [`Room.java`](Room.java) ---> 
  - roomId
  - hotelId
  - roomNumber
  - pricePerNight


- [`Booking.java`](Booking.java)   ---> 
  - bookingId
  - roomId
  - fromDate
  - toDate
  - totalPrice


- [`Amenity.java` ](Amenity.java) --->
  - id
  - name

