package zoo;

public class Crocodile extends Predator{

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "SHSHSHSH";
    }
}
