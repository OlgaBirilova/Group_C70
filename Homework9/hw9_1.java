package Homework9;

public class hw9_1 {
    public static class Animal {
        public void voice() {
        }
        public void eat(String food) {
        }
    }
    public static class Dog extends Animal {
        @Override
        public void voice() {
            System.out.println("Woof");
        }
        @Override
        public void eat(String food) {
            if (food.equals("meat")) {
                System.out.println("I love eating meat.");
            } else {
                System.out.println("I don't eat " + food + ".");
            }
        }
    }

    public static class Tiger extends Animal {
        @Override
        public void voice() {
            System.out.println("Roar");
        }
        @Override
        public void eat(String food) {
            if (food.equals("meat")) {
                System.out.println("I love eating meat.");
            } else {
                System.out.println("I don't eat " + food + ".");
            }
        }
    }
    public static class Rabbit extends Animal {
        @Override
        public void voice() {
            System.out.println("Squeak");
        }
        @Override
        public void eat(String food) {
            if (food.equals("grass")) {
                System.out.println("I love eating grass.");
            } else {
                System.out.println("I don't eat " + food + ".");
            }
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.voice();
            dog.eat("meat");

            Tiger tiger = new Tiger();
            tiger.voice();
            tiger.eat("meat");

            Rabbit rabbit = new Rabbit();
            rabbit.voice();
            rabbit.eat("grass");

            Dog dog2 = new Dog();
            dog2.voice();
            dog2.eat("cookie");

            Tiger tiger2 = new Tiger();
            tiger2.voice();
            tiger2.eat("grass");

            Rabbit rabbit2 = new Rabbit();
            rabbit2.voice();
            rabbit2.eat("meat");
        }
    }
}
