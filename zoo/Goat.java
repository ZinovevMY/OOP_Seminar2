package zoo;

import zoo.radio.Sayable;

public class Goat extends Herbivores implements Sayable, Runable {

    public Goat(String name) {
        super(name);
    }

    @Override
    public String Say() {
        return String.format("%s говорит BEEEEEEE", super.getName());
    }

    @Override
    public int getspeed() {
        return 40;
    }
}
