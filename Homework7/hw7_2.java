package Homework7;

public class hw7_2 {
    abstract static class Figure {
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }

    static class Triangle extends Figure {
        public final double side1;
        public final double side2;
        public final double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        double calculateArea() {
            // Подсчет площади треугольника
            double p = (side1 + side2 + side3) / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }

        @Override
        double calculatePerimeter() {
            // Подсчет периметра треугольника
            return side1 + side2 + side3;
        }
    }

    static class Rectangle extends Figure {
        public final double width;
        public final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double calculateArea() {
            // Подсчет площади прямоугольника
            return width * height;
        }

        @Override
        double calculatePerimeter() {
            // Подсчет периметра прямоугольника
            return 2 * (width + height);
        }
    }

    static class Circle extends Figure {
        public final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            // Подсчет площади круга
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            // Подсчет периметра круга
            return 2 * Math.PI * radius;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Figure[] figures = new Figure[5];
            figures[0] = new Triangle(3, 4, 5);
            figures[1] = new Rectangle(2, 3);
            figures[2] = new Circle(5);
            figures[3] = new Triangle(7.5, 8, 9.7);
            figures[4] = new Rectangle(4, 6);

            double totalPerimeter = 0;
            for (Figure figure : figures) {
                totalPerimeter += figure.calculatePerimeter();
            }

            System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
        }
    }
}
