package Homework7;

public class hw7_1 {
    public static void main(String[] args) {
        interface Position {
            void printPosition();
        }

        class Director implements Position {
            @Override
            public void printPosition() {
                System.out.println("Директор");
            }
        }

        class Worker implements Position {
            @Override
            public void printPosition() {
                System.out.println("Рабочий");
            }
        }

        class Accountant implements Position {
            @Override
            public void printPosition() {
                System.out.println("Бухгалтер");
            }
        }
        //Проверка
        Director director = new Director();
        director.printPosition();

        Worker worker = new Worker();
        worker.printPosition();

        Accountant accountant = new Accountant();
        accountant.printPosition();
    }
}

