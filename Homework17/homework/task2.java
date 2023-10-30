package Homework17.homework;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task2 {
    public static void main(String[] args) {
        String text = "Текст с номером документа 1234-5678-90 и емейлом example@gmail.com, а также номером телефона +375(29)1234567";

        // Поиск номера документа
        Pattern docNumberPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher docNumberMatcher = docNumberPattern.matcher(text);
        if (docNumberMatcher.find()) {
            String documentNumber = docNumberMatcher.group();
            System.out.println("Document number: " + documentNumber);
        }

        // Поиск e-mail
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(text);
        if (emailMatcher.find()) {
            String email = emailMatcher.group();
            System.out.println("Email: " + email);
        }

        // Поиск номера телефона
        Pattern phonePattern = Pattern.compile("\\+\\d{3}\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        if (phoneMatcher.find()) {
            String phoneNumber = phoneMatcher.group();
            System.out.println("Phone number: " + phoneNumber);
        }
    }
}
