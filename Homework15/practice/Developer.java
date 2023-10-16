package Homework15.practice;

public class Developer {
    public int id;
    public String name;
    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Developer: " + "id = " + id + ", name = " + name + '.';
    }
}
