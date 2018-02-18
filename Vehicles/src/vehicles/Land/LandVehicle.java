package vehicles.Land;

import vehicles.Vehicle;

public abstract class LandVehicle implements Vehicle {
    @Override
    public String move() {
        return "Move on the wheels";
    }
}

