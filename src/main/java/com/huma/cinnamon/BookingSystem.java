package com.huma.cinnamon;

import java.util.ArrayList;

public class BookingSystem {
    private int seatCounter = 15;
    private ArrayList seatList;

    public BookingSystem(int capacity) {
        seatList = new ArrayList(capacity);
    }

    public void allocateSeats(int seats) {
        for (int i = 0; i < seats; i ++) {
            seatList.add("A1");
            seatCounter --;
        }
    }

    public ArrayList getAllocatedSeats() {
        return seatList;
    }
}
