package Homework14.homework;
import java.util.function.Function;
public class task3 {
    public static void main(String[] args) {
        String input = "100 BYN";
        Function<String, Double> convertToDollars = str -> {
            double amount = Double.parseDouble(str.split(" ")[0]);
            return amount / 3.3;
        };
        double result = convertToDollars.apply(input);
        System.out.println(result);
    }
}
