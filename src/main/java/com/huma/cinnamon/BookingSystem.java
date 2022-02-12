package com.huma.cinnamon;

import java.util.ArrayList;

public class BookingSystem {
    private int seatCounter = 15;
    private ArrayList seatList;
    private int counterA1 = 1;
    private int counterB1 = 1;
    private int counterC1 = 1;

    public BookingSystem(int capacity) {
        seatList = new ArrayList(capacity);
    }

    public void allocateSeats(int seats) {
        for (int i = 0; i < seats; i ++) {
            if(seatCounter > 10) {
                seatList.add("A" + counterA1);
                seatCounter--;
                counterA1++;
            } else if (seatCounter > 5) {
                seatList.add("B" + counterB1);
                seatCounter--;
                counterB1++;
            } else if (seatCounter > 0) {
                seatList.add("C" + counterC1);
                seatCounter--;
                counterC1++;
            } else {
                System.out.println("Could not book all seats, only " + i + " seat(s) booked");
            }
        }
    }

    public ArrayList getAllocatedSeats() {
        return seatList;
    }
}
