package Homework3;
import java.util.Scanner;
public class hw3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public void task2(){
        String weather;
        System.out.println("Введите температуру: ");
        int num =scan.nextInt();
        if(num >-5) weather="warm";
        else if (-5>= num && num >-20) weather="normal";
        else weather ="cold";
        System.out.println("Weather is "+ weather + ".");
    }
    public void task3() {
        for(int i=10;i<21;i++)
        {
            System.out.println(i+"^2="+i*i);
        }
    }
    public void task4() {
        int i=7;
        String result = "";
        while(i<100){
            result += i + " ";
            i+=7;
        }
        System.out.println(result);
    }
}
