package Homework11;

public class lesson11_1 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Часть 1.");
        task1_1();
        System.out.println("Задача 1. Часть 2.");
        task1_2();
        System.out.println("Задача 1. Часть 3.");
        task1_3();
    }
    public static void task1_1() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива.");
        }
    }
    public static void task1_2() {
        try {
            int result = 1 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
    }
    public static void task1_3() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
            int result = 1/0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
