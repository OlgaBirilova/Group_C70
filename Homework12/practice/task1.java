package Homework12.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        // Запись строки в файл
        try (FileOutputStream fos = new FileOutputStream("tms.txt")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            fos.write(input.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение строки из файла и замена пробелов
        try (FileInputStream fin = new FileInputStream("tms.txt")) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);
            String str = new String(buffer);
            str = str.replaceAll(" ", "_");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
