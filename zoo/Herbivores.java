package zoo;

import zoo.radio.Sayable;

public abstract class Herbivores extends Animal{

    public Herbivores(String name){
        super(name);
    }
    public String feed(){
        return "Grass";
    }
}
