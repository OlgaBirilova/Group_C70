package Homework14.practice;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class task2 {
    //    Написать программу для вывода на экран дату следующего вторника.
        public static void main(String[] args) {
            LocalDate currentDate = LocalDate.now();
            System.out.println("Текущая дата: " + currentDate);
            LocalDate nextDay = currentDate.plusWeeks(1);
            if (nextDay.getDayOfWeek() == DayOfWeek.TUESDAY) {
                System.out.println("Дата следующего вторника: " + nextDay);
            } else {
                LocalDate nextTuesday = nextDay.with(DayOfWeek.TUESDAY);
                System.out.println("Дата следующего вторника: " + nextTuesday.format(DateTimeFormatter.ISO_DATE));
            }
        }
}
