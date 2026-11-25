package lesson6.collectionsOO.ooExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args){

        List<Student> students = new ArrayList<>(
            List.of(
                new Student("Student 1", new ArrayList<>(List.of(6, 10, 9, 5, 6))),
                new Student("Student 2", new ArrayList<>(List.of(5, 10, 4, 5, 6))),
                new Student("Student 3", new ArrayList<>(List.of(4, 4, 4, 5, 6)))
            ));


        System.out.println(students);


//        for(int i=0; i< students.length; i++){
//            System.out.println(students[i]);
//        }
//
        for(int i=0; i< students.size(); i++){
            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getGrades().stream()
                    .mapToInt(Integer::intValue).average().getAsDouble());
        }


    }
}
