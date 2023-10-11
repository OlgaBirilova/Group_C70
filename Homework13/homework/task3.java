package Homework13.homework;
import java.util.ArrayList;
import java.util.List;
public class task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", "Группа 1", 1, List.of(4, 5, 3)));
        students.add(new Student("Петров", "Группа 2", 2, List.of(3, 3, 2)));
        students.add(new Student("Сидоров", "Группа 1", 1, List.of(4, 4, 4)));
        students.add(new Student("Самойлов", "Группа1", 2, List.of(1, 2, 3)));
        students.add(new Student("Иванько", "Группа 2", 2, List.of(5, 4, 4)));

        Student.removeStudentsWithLowAverage(students);
        Student.printStudents(students, 3);
    }
}
