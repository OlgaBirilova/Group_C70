package Homework6;

public class lesson6_1 {
    public static class Calculator {
            public int weight;
            public double cost;
            public String color;

           Calculator(int weight, double cost, String color) {
                this.weight = weight;
                this.cost = cost;
                this.color = color;
                System.out.println("Создаётся объект Calculator:");
            }
            public int sum(int num1, int num2) {
                return num1 + num2;
            }

            public int difference(int num1, int num2) {
                return num1 - num2;
            }

            public double division(double num1, double num2) {
                return num1 / num2;
            }

            public int multiplication(int num1, int num2) {
                return num1 * num2;
            }
            public int getWeight() {
                return weight;
            }

            public double getCost() {
                return cost;
            }

            public String getColor() {
                return color;
            }
        }
        static class Calculator_2 {
            public static void main(String[] args) {
                Calculator calculator = new Calculator(5, 10.2, "Green");

                System.out.println("Weight: " + calculator.getWeight());
                System.out.println("Cost: " + calculator.getCost());
                System.out.println("Color: " + calculator.getColor());

                int sumResult = calculator.sum(5, 3);
                System.out.println("Sum: " + sumResult);

                int differenceResult = calculator.difference(10, 4);
                System.out.println("Difference: " + differenceResult);

                double divisionResult = calculator.division(15.5, 2.5);
                System.out.println("Division: " + divisionResult);

                int multiplicationResult = calculator.multiplication(6, 7);
                System.out.println("Multiplication: " + multiplicationResult);
            }
        }
    }
