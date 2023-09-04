package Homework3;
import java.util.Scanner;
public class lesson3 {
    public static void main (String[] args) {
        Scanner console2 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12: ");
        String month = console2.nextLine();
        switch (month) {
            case "1" -> System.out.println("January");
            case "2" -> System.out.println("February");
            case "3" -> System.out.println("March");
            case "4" -> System.out.println("April");
            case "5" -> System.out.println("May");
            case "6" -> System.out.println("June");
            case "7" -> System.out.println("July");
            case "8" -> System.out.println("August");
            case "9" -> System.out.println("September");
            case "10" -> System.out.println("October");
            case "11" -> System.out.println("November");
            case "12" -> System.out.println("December");
            default -> System.out.println("Ошибка! Введите корректный номер месяца!");
        }
    }

    public void task_2() {
        int a = 0;
        while (a < 26) {
            System.out.print(a + " ");
            a++;
        }
    }

    public void task_3() {
        for (int i = 10; i < 21;i++){
            if (i % 2 == 0)
        System.out.print(i + " ");
        }
    }
    public void task_4(){
        Scanner calc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double money = calc.nextDouble();
        System.out.println("Введите количество месяцев: ");
        int month = calc.nextInt();
        double percent = 7;
        for (int i = 0; i < month; i++){
            money = money * (percent/100) + money;
        }
        System.out.println("Сумма по окончанию срока в банке: " + money);
    }
}


