import java.util.Scanner;
public class hw2 {
    public static void main (String[] args) {
        System.out.println("Задача 1.1: " + "Ольга Бирилова");
        int age = 26;
        System.out.println("Задача 1.2: " + age + " лет");

        int b = 2;
        int c = 1;
        int a = 4*(b+c-1)/2;
        System.out.println("Задача 2.1: " + a);

        int n = 26;
        System.out.println("Задача 2.2: " + (n/10 + n%10));

        int s = 126;
        System.out.println("Задача 2.3: " + (s/100 + s/10%10 + s%10));

        double h = 2.55;
        int hh = (int)h;
        System.out.println("Задача 2.4: " + hh);

        int q = 21;
        int w = 8;
        System.out.println("Задача 2.5: " + 21/8 + " и " + 21%8 + " в остатке");

        int r = 9;
        int t = 2;
        t = t + r;
        r = t - r;
        t = t - r;
        System.out.println("Задача 2.6: " + r + ", " + t);
    }
}