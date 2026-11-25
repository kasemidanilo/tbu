package lesson6.ooExercise;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args){

        Student[] students = {
          new Student("Student 1", new int[]{6, 10, 9, 5, 6}),
                new Student("Student 2", new int[]{5, 10, 4, 5, 6}),
                new Student("Student 3", new int[]{4, 4, 4, 5, 6})
        };



        for(int i=0; i< students.length; i++){
            System.out.println(students[i]);
        }

        for(int i=0; i< students.length; i++){
            System.out.println(students[i].getName());
            System.out.println(students[i].calculateAverage());
        }


    }
}
