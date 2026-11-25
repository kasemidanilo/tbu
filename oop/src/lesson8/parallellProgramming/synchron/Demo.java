package lesson8.parallellProgramming.synchron;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.increment();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.increment();
            }
        });
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.increment();
            }
        });
        th1.start();
        th2.start();
        th3.start();
        th1.join();
        th2.join();
        th3.join();
        System.out.println(bankAccount.getBalance());

    }

}
