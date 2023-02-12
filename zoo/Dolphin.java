package zoo;

import zoo.radio.Sayable;

public class Dolphin extends Predator implements Sayable, Swimmable {

    public Dolphin(String name){
        super(name);
    }

    @Override
    public String Say() {
        return String.format("%s говорит I like jump!)))", super.getName());
    }

    @Override
    public String feed() {
        return "A lot of fish";
    }

    @Override
    public int getSwimSpeed() {
        return 60;
    }

    @Override
    public int getSwimDepth() {
        return 200;
    }
}
