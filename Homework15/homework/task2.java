package Homework15.homework;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class task2 {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        data.put(1, "John");
        data.put(2, "Alice");
        data.put(3, "Bob");
        data.put(4, "Charlie");
        data.put(5, "David");
        data.put(6, "Eve");
        data.put(7, "Frank");
        data.put(8, "Grace");
        data.put(9, "Henry");
        data.put(10, "Ivy");
        data.put(11, "Jack");
        data.put(12, "Kate");
        data.put(13, "Liam");
        List<String> reversedNames = data.entrySet().stream()
                .filter(entry -> List.of(1, 2, 5, 8, 9, 13).contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedNames);
    }
}