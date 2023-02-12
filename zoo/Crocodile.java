package zoo;

import zoo.radio.Sayable;

public class Crocodile extends Predator implements Sayable, Runable, Swimmable{

    @Override
    public int getspeed() {
        return 10;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public int getSwimDepth() {
        return 15;
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
        return String.format("%s говорит SHSH", super.getName());
    }
}
