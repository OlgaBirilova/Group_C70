package Homework4;
import java.util.Arrays;
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
        System.out.println("///Task 5:///");
        int[] task_5 = new int[5];
        for (int i = 0; i < task_5.length; i++) {
            task_5[i] = (int) (Math.random() * 20 - 10);
        }
        System.out.println(Arrays.toString(task_5));
        int y;
        int x;
        if (task_5.length % 2 == 0) {
            for (y = 0, x = task_5.length - 1; y < task_5.length / 2 && x >= task_5.length / 2; y++, x--) {
                int paramY = task_5[y];
                int paramX = task_5[x];
                task_5[y] = paramX;
                task_5[x] = paramY;
            }
        }else{
            for (y = 0, x = task_5.length - 1; y < (task_5.length - 1) / 2 && x >= (task_5.length + 1) / 2; y++, x--) {
                int paramY = task_5[y];
                int paramX = task_5[x];
                task_5[y] = paramX;
                task_5[x] = paramY;
            }
        }
        System.out.println(Arrays.toString(task_5));

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
//        Имеется массив из неотрицательных чисел(любой). Представьте что массив
//        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//        содержит нуля в начале, кроме самого числа 0.
//        Пример:
//        Input: [1,4,0,5,6,3]
//        Output: [1,4,0,5,6,4]
//        Input: [9,9,9]
//        Output: [1,0,0,0]
        System.out.println("///Task *:///");
        int[] array = new int [4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        int result = 0;
        for (int i =array.length - 1 , n = 0; i >= 0; --i, n++) {
            int pos = (int)Math.pow(10, i);
            result += array[n] * pos;
        }
        System.out.println(Arrays.toString(array));
//        System.out.println(result);
        result++;
//        System.out.println(result);
        int[] newArray = new int[String.valueOf(result).length()];
//        System.out.println(String.valueOf(result).length());
        for (int i = newArray.length -1; i >= 0; i--) {
            newArray[i] = result % 10;
            result /= 10;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
