package Homework8;

public class hw8_2 {
    static class Apple {
        private String color = "green";

        public String getColor() {
            return color;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Apple apple = new Apple();
            apple.color = "blue";
            System.out.println(apple.getColor());
        }
    }
}