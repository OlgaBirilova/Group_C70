package Homework6;

public class hw6_2 {
    public static class ATM {
        public int countBanknoteTwenty;
        public int countBanknoteFifty;
        public int countBanknoteHundred;

        public ATM(int countBanknoteTwenty, int countBanknoteFifty, int countBanknoteHundred) {
            this.countBanknoteTwenty = countBanknoteTwenty;
            this.countBanknoteFifty = countBanknoteFifty;
            this.countBanknoteHundred = countBanknoteHundred;
        }
        public void addMoney(int twentyBills, int fiftyBills, int hundredBills) {
            countBanknoteTwenty += twentyBills;
            countBanknoteFifty += fiftyBills;
            countBanknoteHundred += hundredBills;
        }

        public boolean withdrawalMoney(int amount) {
            int remainingAmount = amount;
            int hundredBillsToWithdraw = Math.min(countBanknoteHundred, remainingAmount / 100);
            remainingAmount -= hundredBillsToWithdraw * 100;
            int fiftyBillsToWithdraw = Math.min(countBanknoteFifty, remainingAmount / 50);
            remainingAmount -= fiftyBillsToWithdraw * 50;
            int twentyBillsToWithdraw = Math.min(countBanknoteTwenty, remainingAmount / 20);
            remainingAmount -= twentyBillsToWithdraw * 20;

            if (remainingAmount == 0) {
                countBanknoteHundred -= hundredBillsToWithdraw;
                countBanknoteFifty -= fiftyBillsToWithdraw;
                countBanknoteTwenty -= twentyBillsToWithdraw;
                System.out.println("Withdrawn: ");
                System.out.println("Hundred bills: " + hundredBillsToWithdraw);
                System.out.println("Fifty bills: " + fiftyBillsToWithdraw);
                System.out.println("Twenty bills: " + twentyBillsToWithdraw);
                return true;
            } else {
                System.out.println("It is not possible to withdraw the requested amount.");
                return false;
            }
        }

        public static void main(String[] args) {
            ATM atm = new ATM(20, 10, 5);
            atm.addMoney(7, 3, 4);
            boolean success = atm.withdrawalMoney(740);
            if (success) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Withdrawal unsuccessful.");
            }
        }
    }
}
