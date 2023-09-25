package Homework10;

public class lesson10_3 {
    public static void main(String[] args) {
        String str = "It was noon, the child sat down at the computer and passed a new level in the game.";
        //3.1. Найти количество слов в строке(слова разделены пробелами)
        str = str.replace(",", "").replace(".","");
        String[] words = str.split(" ");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
        //3.2. Найти слово с минимальной длинной
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        System.out.println("Shortest word: " + shortestWord);
        //3.3. Найти в строке слова палиндромы и вывести их через запятую
        StringBuilder palindromeWords = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            if (word.contentEquals(reversedWord)) {
                palindromeWords.append(word).append(",");
            }
        }
        String palindromeWordsStr = palindromeWords.toString();
        if (palindromeWordsStr.length() > 0) {
            palindromeWordsStr = palindromeWordsStr.substring(0, palindromeWordsStr.length() - 1);
        }
        System.out.println("Palindrome words: " + palindromeWordsStr);
    }
}
