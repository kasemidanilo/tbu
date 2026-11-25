package lesson7.bankAccount;

public class EurAccount extends BankAccount {

//    private String type = "EUR";

    @Override
    public void pay(float value) {
        withdraw(value);
        System.out.println("Payment was succeful");
    }

}
