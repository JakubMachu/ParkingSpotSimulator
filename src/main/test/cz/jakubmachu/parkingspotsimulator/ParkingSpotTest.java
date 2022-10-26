package cz.jakubmachu.parkingspotsimulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingSpotTest {

    ParkingSpot parkingSpot = ParkingSpot.getInstance();

    @Test
    public void carCheckInTest() {
        //TODO create method which checks free parking spots and if there are free spots on parking, save info about car
        Map<Integer, LocalDateTime> parkedCars = new HashMap<>();
        Car car1 = Car.builder()
                .setLicensePlate(23489)
                .build();

        //free spot is available
        Assertions.assertTrue(parkingSpot.carCheckIn(car1.getLicensePlate()));
        parkedCars.put(23489, LocalDateTime.of(2022, 10, 26, 12, 0));
        //free spot is not available
        Assertions.assertFalse(parkingSpot.carCheckIn(68913));
    }

    @Test
    public void carCheckOutTest() {
        //TODO create method which checks leaving car, count time spent on parking lot, if ticket has been paid and if it was, let car to leave parking spot and destroy info about it.
        Map<Integer, LocalDateTime> parkedCars = new HashMap<>();
        Car car1 = Car.builder()
                .setLicensePlate(23489)
                .build();
        Car car2 = Car.builder()
                .setLicensePlate(69812)
                .build();
        //free spot is available
        parkingSpot.carCheckIn(car1.getLicensePlate());
        parkedCars.put(23489, LocalDateTime.of(2022, 10, 26, 12, 0));
        parkingSpot.carCheckIn(car2.getLicensePlate());
        parkedCars.put(69812, LocalDateTime.of(2022, 10, 26, 12, 5));
        //car leaving,ticket is paid
        Assertions.assertTrue(parkingSpot.carCheckOut(68913));
        //car leaving,ticket is NOT paid
        Assertions.assertFalse(parkingSpot.carCheckOut(23489));
    }
}
