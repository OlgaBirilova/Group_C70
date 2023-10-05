package Homework12.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class task2 {
    public static void main(String[] args) {
        // Запись строки в файл
        try (FileWriter fw = new FileWriter("tms2.txt")) {
            fw.write("Cognosce te ipsum");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение строки из файла и вывод первой буквы
        try (FileReader fr = new FileReader("tms2.txt")) {
            int i;
            if ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
