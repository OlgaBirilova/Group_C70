package Homework10;
public class lesson10_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Cucumber");
        sb.append("xxxx");
        sb.insert(4, "y");
        sb.delete(2, 6);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
