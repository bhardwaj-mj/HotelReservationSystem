package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem() {
        this.hotels = new ArrayList<Hotel>();
    }

    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}
