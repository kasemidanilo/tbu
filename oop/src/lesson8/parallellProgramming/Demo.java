package lesson8.parallellProgramming;

import java.util.concurrent.ThreadPoolExecutor;

public class Demo {

    public static void main(String[] args){

//        for(int i=0; i<10; i++){
//            System.out.println(i);
//        }
//
//        for(int i=0; i<10; i++){
//            System.out.println(i);
//        }


//        Runnable r = ()-> {
//            for(int i=0; i<10; i++){
//            System.out.println(Thread.currentThread().getName() + " "+ i);
//        }};

        Runnable runnable = new Loop();

        Thread th1 = new Thread(runnable, "Tread 1");
        Thread th2 = new Thread(runnable, "Thread 2");


        th1.start();
        th2.start();

    }
}
