package Homework5;

public class hw5_2 {
    public static void main(String[] args) {
        String[][] task5_2 = new String[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    task5_2[row][col] = "W";
                } else {
                    task5_2[row][col] = "B";
                }
            }
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(task5_2[row][col] + " ");
            }
            System.out.println();
        }
    }
}
