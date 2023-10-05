package Homework12.practice;

public class Student_2 {
    private String group;
    private String lastName;
    private int age;
    public Student_2(String group, String lastName, int age) {
        this.group = group;
        this.lastName = lastName;
        this.age = age;
    }
    public String getGroup() {
        return group;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
