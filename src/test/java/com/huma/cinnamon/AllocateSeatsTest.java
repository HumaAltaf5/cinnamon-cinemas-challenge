package com.huma.cinnamon;

import org.testng.annotations.Test;

import java.util.ArrayList;

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
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("A1");
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(1);
        assertEquals(expectedList, manager.viewAllocatedSeats());
    }

    @Test
    public void testToAllocateTwoSeats() {
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("A1");
        expectedList.add("A2");
        BookingManager manager = new BookingManager(cinnamon);
        manager.requestSeatBooking(2);
        assertEquals(expectedList, manager.viewAllocatedSeats());
    }


}
