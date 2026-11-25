package lesson8.parallellProgramming.synchron;

public class BankAccount {

    private double balance;


    public double getBalance(){
        return this.balance;
    }

    public synchronized void increment(){
        this.balance = this.balance + 1.0;
    }

}
