package Homework13.practice;
import java.util.LinkedList;
public class task2 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.addFirst("Франция");
        countries.addFirst("Италия");
        countries.addLast("Германия");
        countries.addLast("Испания");
        System.out.println(countries);
        countries.removeFirst();
        countries.removeLast();
        System.out.println(countries);
        String firstCountry = countries.getFirst();
        String lastCountry = countries.getLast();
        System.out.println("Первая страна: " + firstCountry);
        System.out.println("Последняя страна: " + lastCountry);
    }
}
