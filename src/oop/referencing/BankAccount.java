package oop.referencing;

public class BankAccount {
    long bankID;
    double balance;
//    String ownerName;
    Person owner;

    public BankAccount(long bankID, double balance, Person owner) {
        this.bankID = bankID;
        this.balance = balance;
        this.owner = owner;
    }

    void deposit(double amount){
        balance += amount;
    }

    boolean withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        System.out.println("Uzivatel " + owner.name + " nemohl z uctu vybrat");
        return false;
    }

    boolean transaction(double amount, BankAccount other){
        if (this.withdraw(amount)){
            other.deposit(amount);
            return true;
        }
        System.out.println("Prevod neprobehl");
        return false;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Karel", "Plzen");
        Person p2 = new Person("Franta", "Praha");

        BankAccount account1 = new BankAccount(541, 40000.50, p1);
        BankAccount account2 = new BankAccount(111, 10000, p2);

        account1.withdraw(20000);
        account1.transaction(40000, account2);

        if (account1.transaction(5000, account2)){
            System.out.println(account1.owner.name + " prevedl na ucet uzivatele "
                    + account2.owner.name);
        }
    }
}
