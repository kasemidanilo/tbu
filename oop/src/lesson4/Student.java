package lesson4;

public class Student {
    private int mosha;
    private String kursi;

    public Student(){
        this.mosha = 20;
        this.kursi = "Software Engineer";
    }

    public Student(int mosha, String kursi){
        this.mosha = mosha;
        this.kursi = kursi;
    }

    public String test(String a, int b, char c){
        return a + b + c;
    }

    public void hello(){
        for(int i = 0; i<10; i++){
            if(i%2==1){
               System.out.println(i);
            }

        }
    }
}
