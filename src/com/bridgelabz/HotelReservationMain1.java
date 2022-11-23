package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class HotelReservationMain1 {
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        int wr= input.nextInt();
        int wr1= input.nextInt();
        Hotel1 hotel1=new Hotel1(name,wr,wr1);
        Hotel1 hotel11=new Hotel1("Bridgewood",160,60);
        Hotel1 hotel12=new Hotel1("Ridgewood",220,150);
        HotelReservation1 hotelReservation1=new HotelReservation1();
        hotelReservation1.add(hotel1);
//        hotelReservation1.add(hotel11);
//        hotelReservation1.add(hotel12);
          List<Hotel1> result=hotelReservation1.getHotel1List();
        System.out.println(result);
    }
}
