package Homework14.homework;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате ГГГГ-ММ-ДД:");
        String birthdayString = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(birthdayString);
        LocalDate hundredthBirthday = birthday.plusYears(100);
        Period period = Period.between(LocalDate.now(), hundredthBirthday);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Вам исполнится 100 лет через " + years + " лет, " + months + " месяцев и " + days + " дней.");
    }
}
