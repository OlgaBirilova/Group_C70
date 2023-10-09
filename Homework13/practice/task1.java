package Homework13.practice;
import java.util.ArrayList;
public class task1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Польша");
        countries.add("Испания");
        countries.add("Германия");
        System.out.println(countries);
        countries.set(1, "Италия");
        countries.remove(1);
        countries.remove("Германия");
        int index = countries.indexOf("Польша");
        System.out.println("Индекс страны Польша: " + index);
        System.out.println("Содержит ли коллекция страну Польша: " + countries.contains("Польша"));
        System.out.println("Содержит ли коллекция страну Испания: " + countries.contains("Испания"));
    }
}
