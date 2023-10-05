package Homework12.practice;

import java.io.*;
public class task3 {
    public static void main(String[] args) {
        // Создание объекта Student
        Student student = new Student("Olga", 26);

        // Сериализация объекта Student
        try (FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);
            System.out.println("Объект успешно сериализован");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта Student
        try (FileInputStream fileInputStream = new FileInputStream("student.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Student deserializedStudent = (Student) objectInputStream.readObject();
            System.out.println("Объект успешно десериализован");
            System.out.println(deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
