package com.huma.cinnamon;

import java.util.ArrayList;

public class BookingSystem {
    private int seatCounter = 0;
    private ArrayList seatList;
    private int counterA1 = 1;
    private int counterB1 = 1;
    private int counterC1 = 1;

    public BookingSystem(int capacity) {
        seatList = new ArrayList(capacity);
    }

    public void allocateSeats(int seats) {
        for (int i = 0; i < seats; i ++) {
            if(seatCounter < 5) {
                seatList.add("A" + counterA1);
                seatCounter++;
                counterA1++;
            }
        }
    }

    public ArrayList getAllocatedSeats() {
        return seatList;
    }
}
