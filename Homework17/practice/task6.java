package Homework17.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task6 {
    public static void findNameAndSurname(String str) {
        Pattern pattern = Pattern.compile("Меня зовут (\\p{L}+) (\\p{L}+)");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String name = matcher.group(1);
            String surname = matcher.group(2);
            System.out.println("Имя: " + name);
            System.out.println("Фамилия: " + surname);
        }
    }
    public static void main(String[] args) {
        String str = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        findNameAndSurname(str);
    }
}
