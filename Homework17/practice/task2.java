package Homework17.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task2 {
    public static String replaceLettersWithAmpersand(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("&");
    }
    public static void main(String[] args) {
        String str = "Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills";
        String replacedStr = replaceLettersWithAmpersand(str);
        System.out.println(replacedStr);
    }
}
