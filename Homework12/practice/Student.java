package Homework12.practice;

import java.io.Serializable;
public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String groupB, String smith, int i) {
    }

    @Override
    public String toString() {
        return "Student (name=" + name + ", age=" + age + ')';
    }
}
