package lesson4;

public class Demo {

    public static void main(String[] args){

        Student a = new Student();

        Student b = new Student(25, "Informatike Ekonomike");

        String result =  b.test("Test", 5, 'A');

        System.out.println(result);

        b.hello();

    }
}
