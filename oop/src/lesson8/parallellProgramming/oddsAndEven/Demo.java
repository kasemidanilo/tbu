package lesson8.parallellProgramming.oddsAndEven;

public class Demo {

    public static void main(String[] args){
        Runnable odd = new Runnable() {
            @Override
            public void run() {
                for(int i = 2; i<9; i=i+2) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Runnable even = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<10; i=i+2) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread th1 = new Thread(odd, "Odds Thread");
        Thread th2 = new Thread(even, "Evens Thread");

        th1.start();
        th2.start();


    }
}
