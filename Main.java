package com.engeto.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(1, 1, true, true, 1000.0);
        Room room2 = new Room(2, 1, true, true, 1000.0);
        Room room3 = new Room(3, 3, false, false, 2400.0);

        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println("Seznam hostů");
        System.out.println("Jméno a příjmení: " + guest1.getName() + " " + guest1.getLastName());
        System.out.println("Narozen(a): " + guest1.getBirthdate());
        System.out.println("Jméno a příjmení: " + guest2.getName() + " " + guest2.getLastName());
        System.out.println("Narozen(a): " + guest2.getBirthdate());

        Booking rezervation1 = new Booking(guest1, room1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26));
        Booking rezervation2 = new Booking(guest1, room3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14));
        Booking rezervation3 = new Booking(guest2, room3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14));

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(rezervation1);
        bookingList.add(rezervation2);
        bookingList.add(rezervation3);

        System.out.println("Seznam rezervaci");
        for (Booking booking : bookingList) {
            System.out.println("Rezervace" + bookingList.indexOf(booking) + ": "
            + booking.getGuestName().getName() + " "
            + booking.getGuestName().getLastName() + ", Room: "
            + booking.getRoomNumber().getRoomNumber() + ", "
            + booking.getCheckIn() + " - "
            + booking.getCheckOut());
        }
    }
}
