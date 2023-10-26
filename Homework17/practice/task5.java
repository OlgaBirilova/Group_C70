package Homework17.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task5 {
    public static String replaceNewLines(String str) {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
    public static void main(String[] args) {
        String str = "Hello \n world \n !!!";
        String replacedStr = replaceNewLines(str);
        System.out.println(replacedStr);
    }
}