package com.bridgelabz;

import java.util.List;

public class HotelReservationSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel reservation system");
        Hotel hotel1 = new Hotel("Lakewood", 110, 90, 80, 80, 3);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        List<Hotel> hotelList = hotelReservation.getHotelList();
        System.out.println(hotelList);
    }
}
