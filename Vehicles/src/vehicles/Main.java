package vehicles;

import vehicles.Land.Truck;
import vehicles.water.Motorboat;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck.move());
        System.out.println(truck.makeSound());
        Vehicle veh = new Motorboat();
        System.out.println(veh.makeSound());
        Motorboat m = new Motorboat();
        System.out.println(m.sink());
        System.out.println(m.move());
    }
}
