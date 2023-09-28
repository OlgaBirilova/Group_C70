package Homework11;

public class lesson11_2 {
    public static void main(String[] args) {
        createPerson.createPersons();
    }
        public static class MyException extends Exception {
            public MyException(String message) {
                super(message);
            }
        }
        public static class Person {
            public int age;

            public Person(int age) throws MyException {
                if (age < 18) {
                    throw new MyException("Возраст меньше 18 лет.");
                }
                this.age = age;
            }

            public int getAge() {
                return age;
            }
        }
        public class createPerson {
            public static void createPersons() {
                try {
                    Person person1 = new Person(10);
                    System.out.println("Возраст первого человека: " + person1.getAge());
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
                try {
                    Person person2 = new Person(20);
                    System.out.println("Возраст второго человека: " + person2.getAge());
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }