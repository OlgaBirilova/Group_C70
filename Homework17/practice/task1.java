package Homework17.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task1 {
    public static String getDigitsFromString(String str) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        StringBuilder digits = new StringBuilder();
        while (matcher.find()) {
            digits.append(matcher.group());
        }
        return digits.toString();
    }
    public static void main(String[] args) {
        String str = "Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills";
        String digits = getDigitsFromString(str);
        System.out.println(digits);
    }
}
