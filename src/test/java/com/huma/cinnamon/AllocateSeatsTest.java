package com.huma.cinnamon;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.testng.AssertJUnit.assertEquals;

public class AllocateSeatsTest {
    @Test

    public void testToGetTotalCinemaSeats() {
        //Arrange
        int expected = 15;
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        //Act
        int actual = cinnamon.getCapacity();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testToAllocateOneSeat() {
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        ArrayList<String> expectedList = new ArrayList<>(1);
        expectedList.add("A1");
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(1);
        assertEquals(expectedList, manager.viewAllocatedSeats());
    }

    @Test
    public void testToAllocateTwoSeats() {
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        ArrayList<String> expectedList = new ArrayList<>(2);
        expectedList.add("A1");
        expectedList.add("A2");
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(2);
        assertEquals(expectedList, manager.viewAllocatedSeats());
    }

    @Test
    public void testToAllocateThreeSeats() {
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        ArrayList<String> expectedList = new ArrayList<>(3);
        expectedList.add("A1");
        expectedList.add("A2");
        expectedList.add("A3");
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(3);
        assertEquals(expectedList, manager.viewAllocatedSeats());
    }

    @Test
    public void testToAllocateRandomSeatsBetweenOneAndThree() {
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        ArrayList<String> expectedList = new ArrayList<>();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 3 +1);
        if (randomNumber == 1) {
            expectedList.add("A1");
        } else if (randomNumber == 2) {
            expectedList.add("A1");
            expectedList.add("A2");
        } else if (randomNumber == 3) {
            expectedList.add("A1");
            expectedList.add("A2");
            expectedList.add("A3");
        }
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(randomNumber);
        assertEquals(expectedList, manager.viewAllocatedSeats());
    }

    @Test
    public void testToAllocateAll15SeatsRandomly() {
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        ArrayList<String> expectedList = new ArrayList(15);
        expectedList.add("A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5");
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(3);
        manager.requestSeatBooking(3);
        manager.requestSeatBooking(3);
        manager.requestSeatBooking(3);
        manager.requestSeatBooking(2);
        manager.requestSeatBooking(1);
        assertEquals(expectedList.toString(), manager.viewAllocatedSeats().toString());
    }
}
