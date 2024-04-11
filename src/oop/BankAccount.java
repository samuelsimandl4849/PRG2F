package oop;

public class BankAccount {
    String owner;
    double balance;

    void printBalance(){
        System.out.println("Account owner: " + owner);
        System.out.println("Account balance: " + balance);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Na ucet pribylo: " + amount);
    }

    void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Bylo vybrano: " + amount);
        } else{
            System.out.println("Vyber neprobehl, maly zustatek na ucte");
        }
    }

    void transfer(double amount, BankAccount beneficiary){
        if (balance >= amount){
            balance -= amount;
            beneficiary.balance += amount;
        } else {
            System.out.println("Prevod neprobehl z duvodu nedostatku financi");
        }
    }
}
