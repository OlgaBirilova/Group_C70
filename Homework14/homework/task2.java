package Homework14.homework;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4, -5, 6, -7, 8, -9);
        Predicate<Integer> isPositive = number -> number > 0;
        numbers.stream().filter(isPositive).forEach(System.out::println);
    }
}
