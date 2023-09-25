package Homework9;
public class hw9_2 {
    private static class Dog {
        private static Dog instance;
        public void voice() {}
        public void eat(String food) {}
        private Dog() {
            // Конструктор класса Dog
        }
        public static Dog getInstance() {
            if (instance == null) {
                instance = new Dog();
            }
            return instance;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Dog dog = Dog.getInstance();
            dog.voice();
            dog.eat("Meat");
        }
    }
}
