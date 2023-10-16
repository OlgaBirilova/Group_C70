package Homework14.practice;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class task1 {
//    Напишите программу для вывода на консоль названия дня недели по введенной дате.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date in the format 'YYYY-MM-DD':");
        String date = scanner.nextLine();
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.parse(date).getDayOfWeek());
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
