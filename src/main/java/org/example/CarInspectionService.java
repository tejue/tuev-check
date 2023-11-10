package org.example;

public class CarInspectionService {
    public static boolean checkForTires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public static boolean checkForSeatbelt(Car car) {
        return car.isSeatBelt();
    }

    public static boolean checkForAirbag(Car car) {
        return car.isAirbag();
    }

    public static boolean checkForDoors(Car car) {
        return car.getNumberOfDoors() == 3 || car.getNumberOfDoors() == 5;
    }
}