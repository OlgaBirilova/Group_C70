package Homework12.practice;

import java.util.Arrays;
import java.util.Comparator;
public class task4 {
    public static void main(String[] args) {
        // Создание массива студентов
        Student_2[] students = new Student_2[6];
        students[0] = new Student_2("Group B", "Ivanov", 20);
        students[1] = new Student_2("Group A", "Petrov", 18);
        students[2] = new Student_2("Group C", "Smirnov", 19);
        students[3] = new Student_2("Group B", "Sokolov", 21);
        students[4] = new Student_2("Group A", "Popov", 22);
        students[5] = new Student_2("Group C", "Lebedev", 26);

        // Сортировка массива студентов
        Arrays.sort(students, Comparator.comparing(Student_2::getGroup)
                .thenComparing(Student_2::getAge)
                .thenComparing(Student_2::getLastName));

        // Вывод отсортированного массива студентов
        for (Student_2 student : students) {
            System.out.println(student);
        }
    }
}
