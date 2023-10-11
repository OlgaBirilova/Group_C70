package Homework13.homework;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {
    public List<String> animals;
    public AnimalCollection() {
        animals = new ArrayList<>();
    }
    public void addAnimal(String animal) {
        animals.add(0, animal);
    }
    public void removeAnimal() {
        if (!animals.isEmpty()) {
            animals.remove(animals.size() - 1);
        }
    }
    public void printAnimals() {
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
