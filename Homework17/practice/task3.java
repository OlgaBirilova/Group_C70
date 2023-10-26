package Homework17.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task3 {
    public static String findInstagramUsername(String str) {
        Pattern pattern = Pattern.compile("@\\w+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
    public static void main(String[] args) {
        String str = "Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills";
        String instagramUsername = findInstagramUsername(str);
        System.out.println(instagramUsername);
    }
}
