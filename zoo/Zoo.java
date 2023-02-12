package zoo;

import zoo.radio.Sayable;

import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Animal> animals, Sayable sayable){
        this.radio = sayable;
        this.animals.addAll(animals);
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void addAnimal(List<Animal> animals){
        this.animals.addAll(animals);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayables(){
        List<Sayable> res = new ArrayList<>();
        for (Animal animal: this.animals){
            res.add((Sayable) animal);
        }
        res.add(this.radio);
        return res;
    }

    public List<>
}
