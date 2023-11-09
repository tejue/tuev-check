package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    //TESTING FOR 4 WHEELS
    @Test
    void checkFor4Tires_whenTiresIs4_thenReturnTrue() {
        //GIVEN
        int numberOfTires = 4;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkFor4Tires_whenTiresIs3_thenReturnFalse() {
        //GIVEN
        int numberOfTires = 3;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkFor4Tires_whenTiresIs0_thenReturnFalse() {
        //GIVEN
        int numberOfTires = 0;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkFor4Tires_whenTiresIs5_thenReturnFalse() {
        //GIVEN
        int numberOfTires = 5;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkFor4Tires_whenTiresIsMinus4_thenReturnFalse() {
        //GIVEN
        int numberOfTires = -4;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertFalse(actual);
    }

}