package zoo;

import zoo.radio.Sayable;

public abstract class Animal implements Sayable {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this instanceof Runable){
            sb.append("Скорость бега = " + ((Runable)this).getspeed());
        }
        if (this instanceof Flyable){
            sb.append("Скорость полета = " + ((Flyable)this).getFlySpeed());
        }
        return String.format(sb + " %s ест %s", this.name, this.feed());
    }
}
