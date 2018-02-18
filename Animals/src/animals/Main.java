package animals;

import animals.birds.Crow;
import animals.fish.Piranha;

public class Main {
    public static void main(String[] args) {
        Piranha pir = new Piranha();
        System.out.println(pir.move());
        System.out.println(pir.breathe());

        Crow cr = new Crow();
        System.out.println(cr.move());
    }

}
