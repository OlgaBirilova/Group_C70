package Homework10;

import java.util.Scanner;
import java.util.Arrays;

public class hw10_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//1. Ввести 3 строки с консоли, найдите самую короткую и самую длинную строки. Вывести найденные строки и их длину.

        System.out.println("Enter three lines: ");
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = scanner.nextLine();
        }
        String shortestLine = lines[0];
        String longestLine = lines[0];
        for (int i = 1; i < 3; i++) {
            if (lines[i].length() < shortestLine.length()) {
                shortestLine = lines[i];
            }
            if (lines[i].length() > longestLine.length()) {
                longestLine = lines[i];
            }
        }
        System.out.println("The shortest line is: " + shortestLine + ". Its length is " + shortestLine.length() + " characters.");
        System.out.println("The longest line is: " + longestLine + ". Its length is " + longestLine.length() + " characters.");

//2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.

        System.out.println("Enter three lines: ");
        for (int i = 0; i < 3; i++) {
            lines[i] = scanner.nextLine();
        }
        Arrays.sort(lines, (a, b) -> a.length() - b.length());
        System.out.println("Strings in ascending order of length: ");
        for (String string : lines) {
            System.out.println(string);
        }

//3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину.

        System.out.println("Enter three lines: ");
        for (int i = 0; i < 3; i++) {
            lines[i] = scanner.nextLine();
        }
        int totalLength = 0;
        for (String string : lines) {
            totalLength += string.length();
        }
        double averageLength = totalLength / 3.0;

        System.out.println("Strings that are less than " + averageLength + " in length: ");
        for (String string : lines) {
            if (string.length() < averageLength) {
                System.out.println(string + ". Its length is : " + string.length() + " characters.");
            }
        }
    }

//4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.

        public static void hw_4(String[] args) {
        System.out.println("Enter three lines: ");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();

        String uniqueCharacterWord = "";

        if (hasUniqueCharacters(string1)) {
            uniqueCharacterWord = string1;
        } else if (hasUniqueCharacters(string2)) {
            uniqueCharacterWord = string2;
        } else if (hasUniqueCharacters(string3)) {
            uniqueCharacterWord = string3;
        }

        if (!uniqueCharacterWord.isEmpty()) {
            System.out.println("A word with unique characters: " + uniqueCharacterWord);
        } else {
            System.out.println("No words with unique characters were found.");
        }
    }

    public static boolean hasUniqueCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

//5. Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки. Например, "Hello" -> "HHeelllloo".
    public static void hw_5(String[] args) {
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        StringBuilder duplicatedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            duplicatedString.append(input.charAt(i)).append(input.charAt(i));
        }

        System.out.println("Дублированная строка: " + duplicatedString.toString());
    }
}
