package lesson8.parallellProgramming.twohalvesSum;

public class VectorSum implements Runnable{

    private int[] vector;
    private int sum;

    public VectorSum(int[] vector){
        this.vector = vector;
    }


    @Override
    public void run() {
        for(int i=0; i<vector.length; i++){
            System.out.println(Thread.currentThread().getName());
            sum += vector[i];
        }
    }

    public int getSum(){
        return this.sum;
    }
}
