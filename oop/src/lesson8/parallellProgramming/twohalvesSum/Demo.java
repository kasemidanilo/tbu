package lesson8.parallellProgramming.twohalvesSum;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        int[] vector = {2, 3, 5, 1, 0, 12, 0, 23};

        VectorSum firstHalf = new VectorSum(new int[]{2, 3, 5, 1});
        VectorSum secondHalf = new VectorSum(new int[]{0, 12, 0, 23});


        Thread th1 = new Thread(firstHalf, "First Thread");
        Thread th2 = new Thread(secondHalf, "Second Thread");

        th1.start();
        th2.start();

        th1.join();
        th2.join();


        int sum = firstHalf.getSum() + secondHalf.getSum();

        System.out.println(sum);


    }
}
