package Homework6;

public class hw6_1 {
    public static class CreditCard {
        public int accountNumber;
        public double balance;
        CreditCard(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void charging(double sum) {
            balance += sum;
        }
        public void withdrawal(double sum) {
            if (sum <= balance) {
                balance -= sum;
            } else {
                System.out.println("Not enough money.");
            }
        }
        public void printInfo() {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
        public static void main(String[] args) {
            CreditCard card_1 = new CreditCard(123456789, 159.75);
            CreditCard card_2 = new CreditCard(147852369, 5621.00);
            CreditCard card_3 = new CreditCard(987456321, 56986.00);
            card_1.charging(1000.79);
            card_2.charging(550.00);
            card_3.withdrawal(40000.00);
            card_1.printInfo();
            card_2.printInfo();
            card_3.printInfo();
        }
    }
}
