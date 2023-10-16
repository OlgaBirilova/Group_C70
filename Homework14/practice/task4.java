package Homework14.practice;
import java.util.function.BiFunction;
public class task4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> logic = (a, b) -> {
            if (a < b) {
                return a;
            } else if (a > b) {
                return b;
            } else {
                return 0;
            }
        };
        int result1 = logic.apply(3, 5);
        int result2 = logic.apply(7, 2);
        int result3 = logic.apply(4, 4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}