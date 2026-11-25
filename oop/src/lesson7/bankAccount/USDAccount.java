package lesson7.bankAccount;

public class USDAccount extends BankAccount {

//    private String type = "USD";

    @Override
    public void pay(float value) {
        withdraw(value);
        System.out.println("Payment was succeful");
    }
}

