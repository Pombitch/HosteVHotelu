package com.engeto.example;

import java.time.LocalDate;

public class Booking {
    private Guest guestName;
    private Room roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String reservationType;

    public Booking(Guest guestName, Room roomNumber, LocalDate checkIn, LocalDate checkOut, String reservationType) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.reservationType = reservationType;
    }

    public Booking(Guest guestName, Room roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.reservationType = "---";
    }

    public Guest getGuestName() {
        return guestName;
    }

    public void setGuestName(Guest guestName) {
        this.guestName = guestName;
    }

    public Room getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Room roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public Booking(Guest guestName, Room roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkIn = LocalDate.now();
        this.checkOut = checkIn.plusDays(5);
        this.reservationType = "---";


    }
}
