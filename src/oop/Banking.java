package oop;

public class Banking {
    public static void main(String[] args) {
        BankAccount fanda = new BankAccount();
        fanda.balance = 5000;
        fanda.owner = "Franta";
        fanda.printBalance();
        fanda.deposit(5500.50);
        fanda.printBalance();

        fanda.withdraw(2000);
        fanda.withdraw(9999999);

        BankAccount pepa = new BankAccount();
        pepa.owner = "Pepa";
        pepa.balance = 1234;
        pepa.printBalance();
    }
}
