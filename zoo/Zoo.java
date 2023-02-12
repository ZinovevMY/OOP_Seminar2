package zoo;

import zoo.radio.Sayable;

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
            if (animal instanceof Sayable){
                res.add((Sayable) animal);
            }
        }
        res.add(this.radio);
        return res;
    }

    public List<Runable> getRunable(){
        List<Runable> res = new ArrayList<>();
        for (Animal animal: this.animals){
            if (animal instanceof Runable){
                res.add((Runable) animal);
            }
        }
        return res;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> res = new ArrayList<>();
        for (Animal animal: this.animals){
            if (animal instanceof Flyable){
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public List<Swimmable> getSwimmable(){
        List<Swimmable> res = new ArrayList<>();
        for (Animal animal: this.animals){
            if (animal instanceof Swimmable){
                res.add((Swimmable) animal);
            }
        }
        return res;
    }

    public Animal getRunChampion(){
        List<Runable> runners = getRunable();
        Runable champion = runners.get(0);
        for (Runable runner: runners){
            if (runner.getspeed() > champion.getspeed()){
                champion = runner;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlyChampion(){
        List<Flyable> flyers = getFlyable();
        Flyable champion = flyers.get(0);
        for (Flyable flyer: flyers){
            if (flyer.getFlySpeed() > champion.getFlySpeed()){
                champion = flyer;
            }
        }
        return (Animal) champion;
    }

    public Animal getSwimChampion(){
        List<Swimmable> swimmers = getSwimmable();
        Swimmable champion = swimmers.get(0);
        for (Swimmable swimmer: swimmers){
            if (swimmer.getSwimSpeed() > champion.getSwimSpeed()){
                champion = swimmer;
            }
        }
        return (Animal) champion;
    }



}
