package lesson5.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args){

        Sound s = new Animal();

        s.makeSound();

        Sound s1 = new Human();

        s1.makeSound();


        int[] vektor = new int[5];
        int[][] matrix = new int[5][5];


        for(int i=0; i<5; i++){
            System.out.println(vektor[i]);
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==j)
                    matrix[i][j] = 1;
            }
        }


        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        List<Integer> list = new ArrayList<Integer>();

        list.add(5);

        System.out.println(list);
        list.add(10);
        list.add(3);

        System.out.println(list);

        Animal a1 = new Animal();
        Human h1 = new Human();

        List<Sound> animalList = new ArrayList<>();

        animalList.add(a1);
        animalList.add(h1);
    }
}
