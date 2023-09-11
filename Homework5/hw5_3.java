package Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class hw5_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int m = scanner.nextInt();
        int[][] task5_3 = new int[n][m];
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    task5_3[i][j] = value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    task5_3[i][j] = value++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", task5_3[i][j]);
            }
            System.out.println();
        }
    }
}
