package Homework5;
import java.util.Random;
import java.util.Scanner;
public class hw5_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        int[][] task5_1 = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                task5_1[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Введите число, необходимое добавить к каждому значению: ");
        int number = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                task5_1[i][j] += number;
            }
        }
        System.out.println("Результат :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(task5_1[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += task5_1[i][j];
            }
        }
        System.out.println("Сумма всех значений: " + sum);
    }
}
