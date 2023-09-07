package Homework4;
import java.util.Arrays;
import java.util.Scanner;
public class hw4 {
//    Task 1:
//    Пройти по массиву, вывести все элементы в прямом и обратном порядке.
    public static void main (String[] args) {
        System.out.println("///Task 1:///");
        double[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(number));
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }

//    Task 2:
//    Найти минимальный-максимальный элементы и вывести в консоль.
        System.out.println(" ");
        System.out.println("///Task 2:///");
        int max = 0;
        int min = 0;
        int[] max_min = {0, 4, 2, 3, -7, 5, 6, 12, 8, 9};
        for (int i = 0; i < max_min.length; i++) {
            if (max_min[i] > max) {
                max = max_min[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        for (int i = 0; i < max_min.length; i++) {
            if (max_min[i] < min) {
                min = max_min[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);

//        Task 3:
//        Найти индексы минимального и максимального элементов и вывести в консоль.
        System.out.println("///Task 3:///");
        int maxindex = 0;
        int minindex = 0;
        for (int i = 0; i < max_min.length; i++) {
            if (max_min[i] == max) {
                maxindex = i;
            }
        }
        System.out.println("Индекс максимального элемента массива: " + maxindex);
        for (int i = 0; i < max_min.length; i++) {
            if (max_min[i] == min) {
                minindex = i;
            }
        }
        System.out.println("Индекс минимального элемента массива: " + minindex);

//        Task 4:
//        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//        сообщение, что их нет.
        System.out.println("///Task 4:///");
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = (int) (Math.random() * 29 - 15);
        }
        System.out.println(Arrays.toString(mass));
        int nul = 0;
        for (int i = 0; i < 10; i++) {
            if (mass[i] == 0) {
                nul++;
            }
        }
        if (nul > 0) {
            System.out.println("Количество нулевых элементов: " + nul);
        } else {
            System.out.println("Нулевых элементов нет.");
        }
//        Task 5:
//        Пройти по массиву и поменять местами элементы первый и последний, второй и
//        предпоследний и т.д.
//        System.out.println("///Task 5:///");
//        int[] task_5 = new int[8];
//        for (int i = 0; i < 8; i++) {
//            task_5[i] = (int) (Math.random() * 20 - 10);
//        }
//        System.out.println(Arrays.toString(task_5));
//        for (int i = 0; i < 8; i++) {
//            task_5[i] = (int) (Math.random() * 20 - 10);
//        }

//        Task 6:
//        Проверить, является ли массив возрастающей последовательностью (каждое следующее
//        число больше предыдущего).
        System.out.println("///Task 6:///");
        int[] task_6 = {1, 2, 3, 4, 5};
        boolean arg = true;
        for (int i = 1; i < task_6.length; i++) {
            if (task_6[i] <= task_6[i - 1]) {
                arg = false;
                break;
            }
        }
            if(arg){
                System.out.println("Массив является возрастающей последовательностью.");
            } else {
                System.out.println("Массив не является возрастающей последовательностью.");
            }
//        Task *:
    }
}
