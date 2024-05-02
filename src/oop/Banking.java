package oop;

public class Banking {
    public static void main(String[] args) {
        BankAccount bc = new BankAccount(500000.1,"Karel", 987456112);
        System.out.println("Ucet vlastni " + bc.ownerName);
        System.out.println("Ucet ma cislo " + bc.bankID);
//        System.out.println("Na ucte je " + bc.balance);

    }

} class BankAccount{
    private double balance;
    public String ownerName;
    long bankID;

    public BankAccount(double balance, String ownerName, long bankID) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.bankID = bankID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getBankID() {
        return bankID;
    }

    public void setBankID(long bankID) {
        this.bankID = bankID;
    }

    void increaseBalance(int amount){
        balance += amount;
    }
}
