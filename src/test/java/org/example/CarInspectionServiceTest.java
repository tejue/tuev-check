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

    //TESTING FOR SEATBELT
    @Test
    void checkForSeatbelt_whenCarHasSeatbelt_thenReturnTrue() {
        //GIVEN
        boolean hasSeatbelt = true;
        Car car = new Car(0, 0, hasSeatbelt, false);
        //WHEN
        boolean actual = CarInspectionService.checkForSeatbelt(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForSeatbelt_whenCarHasNoSeatbelt_thenReturnFalse() {
        //GIVEN
        boolean hasSeatbelt = false;
        Car car = new Car(0, 0, hasSeatbelt, false);
        //WHEN
        boolean actual = CarInspectionService.checkForSeatbelt(car);
        //THEN
        assertFalse(actual);
    }

    //TESTING FOR AIRBAG
    @Test
    void checkForAirbag_whenCarHasAirbag_thenReturnTrue() {
        //GIVEN
        boolean hasAirbag = true;
        Car car = new Car(0, 0, false, hasAirbag);
        //WHEN
        boolean actual = CarInspectionService.checkForAirbag(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForAirbag_whenCarHasNoAirbag_thenReturnFalse() {
        //GIVEN
        boolean hasAirbag = false;
        Car car = new Car(0, 0, false, hasAirbag);
        //WHEN
        boolean actual = CarInspectionService.checkForAirbag(car);
        //THEN
        assertFalse(actual);
    }

    //TESTING FOR 3 OR 5 DOORS
    @Test
    void checkForNumberOfDoors_whenCarHas3Doors_thenReturnTrue() {
        //GIVEN
        int numberOfDoors = 3;
        Car car = new Car(0, numberOfDoors, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForDoors(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForNumberOfDoors_whenCarHas5Doors_thenReturnTrue() {
        //GIVEN
        int numberOfDoors = 5;
        Car car = new Car(0, numberOfDoors, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForDoors(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForNumberOfDoors_whenCarHas0Doors_thenReturnFalse() {
        //GIVEN
        int numberOfDoors = 0;
        Car car = new Car(0, numberOfDoors, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForDoors(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkForNumberOfDoors_whenCarHas4Doors_thenReturnFalse() {
        //GIVEN
        int numberOfDoors = 4;
        Car car = new Car(0, numberOfDoors, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForDoors(car);
        //THEN
        assertFalse(actual);
    }
}