package animals.fish;
import animals.Animal;

public abstract class Fish implements Animal {
    @Override
    public String breathe() {
        return "Breathe with gills" ;
    }
}
