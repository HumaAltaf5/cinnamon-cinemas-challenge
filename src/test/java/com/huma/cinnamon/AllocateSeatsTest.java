package com.huma.cinnamon;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AllocateSeatsTest {
    @Test

    public void testToGetTotalCinemaSeats() {
        //Arrange
        int expected = 15;
        CinnamonTheatre cinnamon = new CinnamonTheatre();
        //Act
        int actual = cinnamon.getSeats();
        //Assert
        assertEquals(actual, expected);
    }

}
