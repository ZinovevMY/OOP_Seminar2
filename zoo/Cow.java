package zoo;

public class Cow extends Herbivores{

    public Cow(String name){
        super(name);
    }

    @Override
    public String say() {
        return "MUUUU";
    }


}
