package com.huma.cinnamon;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;
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
}
