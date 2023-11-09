package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    //TESTING FOR 4 WHEELS
    @Test
    void checkWheels_whenWheelsIs4_thenReturnTrue() {
        //GIVEN
        int amountOfWheels = 4;
        boolean expected = true;
        //WHEN
        boolean actual = CarInspectionService.checkWheels(amountOfWheels);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkWheels_whenWheelsIs0_thenReturnFalse() {
        //GIVEN
        int amountOfWheels = 0;
        //WHEN
        boolean actual = CarInspectionService.checkWheels(amountOfWheels);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkWheels_whenWheelsIs2_thenReturnFalse() {
        //GIVEN
        int amountOfWheels = 2;
        //WHEN
        boolean actual = CarInspectionService.checkWheels(amountOfWheels);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkWheels_whenWheelsIs5_thenReturnFalse() {
        //GIVEN
        int amountOfWheels = 5;
        //WHEN
        boolean actual = CarInspectionService.checkWheels(amountOfWheels);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkWheels_whenWheelsIsMinus4_thenReturnFalse() {
        //GIVEN
        int amountOfWheels = -4;
        //WHEN
        boolean actual = CarInspectionService.checkWheels(amountOfWheels);
        //THEN
        assertFalse(actual);
    }

    //
}