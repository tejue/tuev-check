package org.example;

public class CarInspectionService {
    public static boolean checkForTires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public static boolean checkForSeatbelt(Car car) {
        return car.isSeatBelt();
    }
}