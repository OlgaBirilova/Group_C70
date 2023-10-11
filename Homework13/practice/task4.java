package Homework13.practice;

public class task4 {
        static class Storage<T> {
            public T item;
            public Storage() {
            }
            public Storage(T item) {
                this.item = item;
            }
            public T getItem() {
                return item;
            }
            public void setItem(T item) {
                this.item = item;
            }
        }
        static class Main {
            public static void main(String[] args) {
                Storage<String> stringStorage = new Storage<>("Hello");
                Storage<Integer> integerStorage = new Storage<>(123);
                System.out.println(stringStorage.getItem());
                System.out.println(integerStorage.getItem());
                stringStorage.setItem("Hello world");
                System.out.println(stringStorage.getItem());
            }
        }
}
