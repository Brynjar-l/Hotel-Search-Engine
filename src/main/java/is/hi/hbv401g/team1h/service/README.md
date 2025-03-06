# Service Layer (Package)

## Overview
The Service Layer handles all the business logic and
acts as our highest level of abstraction.
Each service class should encompass it's entire "routine", from start to finish.

Cleans and formats inputs and designates invariants,
before calling dao methods to retrieve what is needed.

## Classes
- [`SearchService.java`](SearchService.java)  ---> Searching, Filtering and returning rows from the database.
- [`BookingService.java`](BookingService.java) ---> Confirm a Booking once a user has selected a room that is available.
- [`AdminService.java`](BookingService.java)   ---> CRUD for admin panel, lowest priority.

## TODOs

-[ ] everything

