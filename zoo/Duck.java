package zoo;

import zoo.radio.Sayable;

public class Duck extends Predator implements Flyable, Sayable, Swimmable{

    public Duck(String name){
        super(name);
    }

    @Override
    public String feed() {
        return "Worms and small fish";
    }

    @Override
    public int getHeight() {
        return 100;
    }

    @Override
    public int getFlySpeed() {
        return 35;
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }

    @Override
    public int getSwimDepth() {
        return 1;
    }

    @Override
    public String Say() {
        return String.format("%s говорит Krya-Krya", super.getName());
    }
}
