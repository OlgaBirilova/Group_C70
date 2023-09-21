package Homework9;

public class lesson9_2 {
    public static class Person {
        public static final String name = "Olga Birilova";

        public static void printName() {
            System.out.println(name);
        }
    }
    public static class Main {
        public static void main(String[] args) {
            System.out.println(Person.name);
            Person.printName();
        }
    }
}
