package Homework6;

public class lesson6_2 {
    public static class Person {
        public String fullName;
        public int age;
        public void talk(String text) {
            System.out.println(fullName + " talk " + text + "...");
        }

        public void move() {
            System.out.println(fullName + " walk.");
        }
        Person() {
        }
        Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }
        public static void main(String[] args) {
            Person person_1 = new Person();
            person_1.fullName = "Olga Birilova";
            person_1.age = 26;
            person_1.move();
            person_1.talk("hello");

            Person person_2 = new Person("Olga Birilova", 26);
            person_2.move();
            person_2.talk("hello");
        }
    }
}
