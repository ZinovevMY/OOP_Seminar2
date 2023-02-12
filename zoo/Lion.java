package zoo;

public class Lion extends Predator{

    public Lion(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "RRRRRRRR";
    }
}
