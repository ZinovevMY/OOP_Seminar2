package zoo;

import zoo.radio.Sayable;

public class Cow extends Herbivores implements Sayable{

    public Cow(String name){
        super(name);
    }

    @Override
    public String feed() {
        return "Green grass";
    }

    @Override
    public String Say() {
        return "MUUUU";
    }


}
