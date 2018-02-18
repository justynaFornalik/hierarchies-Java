package vehicles.air;

import vehicles.Vehicle;

public abstract class AirVehicle implements Vehicle {
    @Override
    public String move() {
        return "fly";
    }
}
