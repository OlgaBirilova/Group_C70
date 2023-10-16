package Homework14.practice;

public class task3 {
//    Создать интерфейс IShape с помощью метода getSquare(int x, int y). Используя лямбда-
//    выражение, реализуйте его для квадрата(a*b) и треугольника(0.5a*h).
    interface IShape {
        double getSquare(int x, int y);
    }
    public static void main(String[] args) {
        IShape square = (x, y) -> x * y;
        IShape triangle = (x, y) -> 0.5 * x * y;
        double squareArea = square.getSquare(4, 4);
        double triangleArea = triangle.getSquare(3, 6);
        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}