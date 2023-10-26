package Homework17.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task4 {
    public static boolean isNullString(String str) {
        Pattern pattern = Pattern.compile("^null$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String str1 = "null";
        String str2 = "not null";
        System.out.println(isNullString(str1));
        System.out.println(isNullString(str2));
    }
}
