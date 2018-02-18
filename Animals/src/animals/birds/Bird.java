package animals.birds;

import animals.Animal;

public abstract class Bird implements Animal {
    @Override
    public String breathe() {
        return "Breathe with lungs";
    }

}
