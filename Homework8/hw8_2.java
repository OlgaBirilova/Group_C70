package Homework8;

import java.lang.reflect.Field;
class Apple {
    private String color = "green";

    public String getColor() {
        return color;
    }
}

class Apple2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        Field colorField = Apple.class.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(apple, "blue");
        System.out.println(apple.getColor());
    }
}
