package Homework13.practice;
import java.util.HashSet;
public class task3 {
    public static void main(String[] args) {
        class Person {
            private String name;
            private int age;
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
            public String getName() {
                return name;
            }
            public int getAge() {
                return age;
            }
        }
        HashSet<Person> personSet = new HashSet<>();
        Person person1 = new Person("Sasha", 25);
        Person person2 = new Person("Masha", 30);
        Person person3 = new Person("Pasha", 35);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        for (Person person : personSet) {
            System.out.println(person.getName() + " - " + person.getAge() + " years.");
        }
        personSet.remove(person1);
        personSet.remove(person2);
        System.out.println("Содержит ли коллекция объект person3: " + personSet.contains(person3));
    }
}
