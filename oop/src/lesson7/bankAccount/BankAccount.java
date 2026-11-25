package lesson7.bankAccount;

public abstract class BankAccount {

    private float balance;
    private String type;

    public BankAccount(){

    }

    public BankAccount(String type){
        this.type = type;
    }

    public abstract void pay(float value);

    public void setType(String type){
        this.type = type;
    }

    public void deposit(float value){

        if(value <= 0){
            System.out.println("Value to deposit is not allowed!");
        } else {
            this.balance += value;
        }

    }

    public void withdraw(float value){

        if(value <= 0){
            System.out.println("Value to withdraw is not allowed!");
        } else {
            this.balance -= value;
        }

    }
}
