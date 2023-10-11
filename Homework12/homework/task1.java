package Homework12.homework;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\USER\\Desktop\\TeachMeSkills\\Group_C70\\Homework12\\homework\\RomeoAndJuliet.txt";
        String outputFileName = "C:\\Users\\USER\\Desktop\\TeachMeSkills\\Group_C70\\Homework12\\homework\\LongestWord.txt";
        try {
            // Чтение файла
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder text = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }
            reader.close();

            // Разделение текста на слова
            String[] words = text.toString().split("\\s+");

            // Поиск самого длинного слова
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            // Запись самого длинного слова в новый файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write(longestWord);
            writer.close();

            System.out.println("Самое длинное слово успешно записано в файл " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        }
    }
}
