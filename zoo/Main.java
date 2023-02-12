package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Cow("Зорька"), new Crocodile("Гена"), new Lion("Симба"),
                new Goat("Маруся"));

        Zoo zoo = new Zoo();
        zoo.addAnimal(animals);

        for (Animal an: zoo.getAnimals()){
            System.out.println(an.say());
        }
    }
}
