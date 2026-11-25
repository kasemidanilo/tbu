package lesson5.inheritance;

public class Dog extends Animal {

    public Dog(){
        super();

        super.action();

    }

    public void action(){
        System.out.println("Dog is running!");
    }

    public void test(){
        System.out.println("Test");
    }
}
