package lesson7.bankAccount;

public class ALLAccount extends BankAccount {

//    private String type = "ALL";

    public ALLAccount(String type){
        super(type);
//        super.setType(type);
    }

    @Override
    public void pay(float value) {
        withdraw(value);
        System.out.println("Payment was succeful");
    }
}
