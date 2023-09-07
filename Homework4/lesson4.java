package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson4 {
    public static void main (String[] args) {


//        Task 1:
//        Сгенерировать 5 случайных чисел. Оба возвести в квадрат и вывести в консоль.

        System.out.println("///Task 1:///");
        for(int i = 0; i < 5;i++) {
            int а = (int) (Math.random() * 10);
            System.out.println(Math.pow(а, 2));
        }


//        Task 2:
//        2.1 Создать массив фруктов и наполнить его 4 произвольными фруктами.
//        2.2 вывести в консоль второй и четвертый.
//        2.3 вывести в консоль длину массива.
//        2.4 третий фрукт заменить на иной.
//        2.5 проверить результат в консоли.

        System.out.println("///Task 2:///");
        String[] fruits = {"peach", "apple", "banana", "pineapple"};
        System.out.println(fruits[1] + ", " + fruits[3]);
        System.out.println(fruits.length);
        fruits[2]="pear";
        System.out.println(Arrays.toString(fruits));


//        Task 3:
//        3.1 Создать пустой массив типа double с названием masDouble такого размера, который
//        пользователь управляет клавиатурой.
//        3.2 Заполнить masDouble случайными числами используя Math.random() и вывести его в
//        консоль.
//        3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом направлении и
//        в обратном порядке.

        System.out.println("///Task 3:///");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите необходимый размер массива: ");
        int lengthArray = scan.nextInt();
        double[] masDouble = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            masDouble[i] = (double) (Math.random() * lengthArray);
        }
        for (int i = 0; i < lengthArray; i++){
            if (i % 2 == 0)
                masDouble[i] = (double)(Math.pow(masDouble[i],2));
        }
        System.out.println(Arrays.toString(masDouble));
        for (int i = lengthArray-1; i >= 0; i--){
        System.out.println(masDouble[i] + ", ");
        }


//        Task 4:
//        Посчитайте среднее арифметическое массива.

        System.out.println("///Task 4:///");
        int[] newArray = new int[]{1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }
            System.out.println("Среднее арифметическое массива: " + sum/newArray.length);


//        Task 5:
//        Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс
//        его последнего вхождения в массив.
        System.out.println("///Task 5:///");
        int[] array_2 = new int[12];
        for (int i = 0; i < 12; i++) {
            array_2[i] = (int) (Math.random() * 31 - 15);
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            if(array_2[i] > max){
                max = array_2[i];
                index = i;
            }
        }
        System.out.println("Индекс последнего вхождения максимального элемента: " + index);
    }
//    Task 6:

}
