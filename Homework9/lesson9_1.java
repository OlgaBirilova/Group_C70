package Homework9;

public class lesson9_1 {
    public static class Share {
        public void draw() {
        }
        public void erase() {
        }
    }

    public static class Circle extends Share {
        @Override
        public void draw() {
            System.out.println("I draw Circle");
        }

        @Override
        public void erase() {
            System.out.println("I erase Circle");
        }
    }
    public static class Square extends Share {
        @Override
        public void draw() {
            System.out.println("I draw Square");
        }

        @Override
        public void erase() {
            System.out.println("I erase Square");
        }
    }
    public static class Triangle extends Share {
        @Override
        public void draw() {
            System.out.println("I draw Triangle");
        }
        @Override
        public void erase() {
            System.out.println("I erase Triangle");
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Share share = new Share();
            share.draw();
            share.erase();

            Circle circle = new Circle();
            circle.draw();
            circle.erase();

            Square square = new Square();
            square.draw();
            square.erase();

            Triangle triangle = new Triangle();
            triangle.draw();
            triangle.erase();
        }
    }
}
