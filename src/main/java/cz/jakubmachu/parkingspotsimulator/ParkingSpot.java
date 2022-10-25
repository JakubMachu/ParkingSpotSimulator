package cz.jakubmachu.parkingspotsimulator;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpot {
    private List<Car> parkedCars = new ArrayList<>();
    private static ParkingSpot parking = new ParkingSpot();

    public static ParkingSpot getInstance() {
        return parking;
    }
}

