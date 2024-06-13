package oop.references;

public class BankAccount {
    double balance;
    long bankID;
    Person owner;

    public BankAccount(double balance, long bankID, Person owner) {
        this.balance = balance;
        this.bankID = bankID;
        this.owner = owner;
    }

    void deposit(double amount){
        balance+=amount;
    }

    boolean withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        System.out.println("Uzivatel " + owner.name + " nemohl vybrat castku");
        return false;
    }

    boolean transaction(double amount, BankAccount other){
        if (withdraw(amount)){
            other.deposit(amount);
            return true;
        }
        System.out.println("Nebyl mozny prevod");
        return false;
    }


    public static void main(String[] args) {
        Person p1 = new Person("Karel", "Praha");
        Person p2 = new Person("Franta", "Plzen");

        BankAccount account1 = new BankAccount(40000, 2131, p1);
        BankAccount account2 = new BankAccount(20000, 1425545, p2);

        account1.withdraw( 20000);
        if (account1.transaction(5000,account2)){
            System.out.println("Uzivatel " + account1.owner.name + " prevedl penize uzivateli " + account2.owner.name);
        }

    }


}
