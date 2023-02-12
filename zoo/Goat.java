package zoo;

public class Goat extends Herbivores{
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "BEEEEEE";
    }
}
