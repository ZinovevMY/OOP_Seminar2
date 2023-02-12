package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void addAnimal(List<Animal> animals){
        this.animals.addAll(animals);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
