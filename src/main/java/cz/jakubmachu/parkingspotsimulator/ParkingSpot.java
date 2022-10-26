package cz.jakubmachu.parkingspotsimulator;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpot {
    private static ParkingSpot parking = new ParkingSpot();

    //TODO refactor to some Collection which can hold License plate, LocalDateTime and if ticket was paid(create class/interface which will hold this information at once)
    private List<Car> parkedCars = new ArrayList<>();

    public static ParkingSpot getInstance() {
        return parking;
    }

    public boolean carCheckIn(int licensePlate) {
        return false;
    }

    public boolean carCheckOut(int licensePlate) {
        return false;
    }
}

