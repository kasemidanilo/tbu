package lesson5.abstraction;

public class Animal implements Sound {

    private int age;

    public void action(){
        System.out.println("Animal is running");
    }

    @Override
    public void makeSound() {
        System.out.println("make sound");
    }

    public int getAge(){
        return this.age;
    }
}
