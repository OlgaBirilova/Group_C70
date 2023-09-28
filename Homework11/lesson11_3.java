package Homework11;

public class lesson11_3 {
    public static void main(String[] args) {
        System.out.println("Метод try-catch:");
        method1();
        System.out.println("Метод try-catch, где catch будет несколько:");
        method2();
        System.out.println("Метод try-catch, с использованием multi-catch:");
        method3();
        System.out.println("Метод try-catch-finally:");
        method4();
    }
    public static void method1() {
        // Деление на ноль - исключение ArithmeticException.
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
    }
    public static void method2() {
        try {
            int b = 1 / 0;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
    public static void method3() {
        try {
            int[] arr = new int[5];
            int element = arr[10];
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива или массив равен null!");
        }
    }
    public static void method4() {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }finally{
            System.out.println("Конец!");
        }
    }
}
