package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation1 {
    List<Hotel1> hotel1List;

    public HotelReservation1() {
        this.hotel1List = new ArrayList<Hotel1>();
    }
    public void add(Hotel1 hotel){
        hotel1List.add(hotel);
    }
    public List<Hotel1> getHotel1List(){
        return this.hotel1List;
    }

}
