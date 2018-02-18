package vehicles.water;

public class Motorboat extends WaterVehicle {
    @Override
    public String makeSound() {
        return "Plum plum";
    }

    public String sink() {
        return "Sinkin'!";
    }
}
