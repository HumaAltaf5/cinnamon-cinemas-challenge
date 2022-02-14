package com.huma.cinnamon;

import java.util.ArrayList;

public class BookingManager {
    private CinnamonTheatre cinnamon;
    private BookingSystem system;

    public BookingManager(CinnamonTheatre cinnamon) {
        this.cinnamon = cinnamon;
        system = new BookingSystem(cinnamon.getCapacity());
    }

    public void requestSeatBooking(int seats) {
        if(cinnamon.getCapacity() > 0) {
            system.allocateSeats(seats);
        } else {
            System.out.println("Theatre full , no seats available for booking");
        }
    }

    public ArrayList viewAllocatedSeats() {
        return system.getAllocatedSeats();
    }

    public StringBuilder getCurrentBooking() {
        return system.getCurrentBooking();
    }
}
