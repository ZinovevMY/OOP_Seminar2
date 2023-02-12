package zoo;

import zoo.radio.Sayable;

public class Goat extends Herbivores implements Flyable, Sayable {
    @Override
    public int getHeight() {
        return 200;
    }

    @Override
    public int getFlySpeed() {
        return 35;
    }

    @Override
    public String Say() {
        return "KRYA_KRYA_KRYA";
    }

    public Goat(String name) {
        super(name);
    }

}
