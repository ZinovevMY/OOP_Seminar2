package zoo;

import zoo.radio.Sayable;

public class Crocodile extends Predator implements Sayable, Runable{

    @Override
    public int getspeed() {
        return 10;
    }

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Only meat!!!";
    }

    @Override
    public String Say() {
        return "SHSH";
    }
}
