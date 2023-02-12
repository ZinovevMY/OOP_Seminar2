
import zoo.*;
import zoo.radio.Radio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Cow("Зорька"), new Crocodile("Гена"), new Lion("Симба"),
                new Goat("Маруся"), new Duck("Дональд"), new Dolphin("Флиппер"));

        Zoo zoo = new Zoo(animals, new Radio());
        zoo.addAnimal(animals);

        for (Animal an: zoo.getAnimals()){
            System.out.println(an.Say());
        }

        System.out.println("-------------------");
        for (Runable animal: zoo.getRunable()){
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).Say());
            System.out.println("Бегает со скоростью " + animal.getspeed() + "\n");
        }
        System.out.println("-------------------");
        for (Flyable animal: zoo.getFlyable()){
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).Say());
            System.out.println("Летает со скоростью " + animal.getFlySpeed() + "\n");
        }
        System.out.println("-------------------");
        for (Swimmable animal: zoo.getSwimmable()){
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).Say());
            System.out.println("Плавает со скоростью " + animal.getSwimSpeed() + "\n");
        }

    }
}

