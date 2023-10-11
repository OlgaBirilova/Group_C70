package Homework13.homework;
public class task2 {
        public static void main(String[] args) {
            AnimalCollection animalCollection = new AnimalCollection();
            animalCollection.addAnimal("Кот");
            animalCollection.addAnimal("Собака");
            animalCollection.addAnimal("Лиса");
            animalCollection.addAnimal("Волк");
            System.out.println("Животные:");
            animalCollection.printAnimals();
            animalCollection.removeAnimal();
            System.out.println("После удаления:");
            animalCollection.printAnimals();
        }
}
