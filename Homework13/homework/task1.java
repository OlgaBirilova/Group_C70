package Homework13.homework;
import java.util.Scanner;
import java.util.HashSet;
public class task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через запятую:");
        String input = scanner.nextLine();
        String[] numbers = input.split(", ");
        HashSet<String> uniqueNumbers = new HashSet<>();
        for (String number : numbers) {
            uniqueNumbers.add(number);
        }
        System.out.println("Уникальные числа:");
        for (String number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}
