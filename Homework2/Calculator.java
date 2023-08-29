import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double number1 = console.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = console.nextDouble();
        System.out.println("Введите оператор (+, -, *, /): ");
        char symbol = console.next().charAt(0);
        double answer;
        switch(symbol) {
            case '+': answer = number1 + number2;
                break;
            case '-': answer = number1 - number2;
                break;
            case '*': answer = number1 * number2;
                break;
            case '/': answer = number1 / number2;
                break;
            default:  System.out.printf("Ошибка! Введите корректный оператор!");
                return;
        }
        System.out.print("Ответ: " + answer);
    }

}
