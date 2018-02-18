package vehicles.water;

import vehicles.Vehicle;

public abstract class WaterVehicle implements Vehicle {
    @Override
    public String move() {
        return "Move on the water";
    }
}
