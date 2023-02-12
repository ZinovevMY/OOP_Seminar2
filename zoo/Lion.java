package zoo;

import zoo.radio.Sayable;

public class Lion extends Predator implements Sayable, Runable {

    public Lion(String name) {
        super(name);
    }

    @Override
    public String Say() {
        return String.format("%s говорит RRRRRRRR", super.getName());
    }

    @Override
    public String feed() {
        return "Meat";
    }

    @Override
    public int getspeed() {
        return 40;
    }
}
