package lesson6.collectionsOO.ooExercise;

import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer>grades){
        this.name = name;
        this.grades = grades;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Integer> getGrades(){
        return this.grades;
    }

//    public String printGrades(){
//        String grades = "";
//        for(int i=0; i< this.grades.length; i++){
//            grades += this.grades[i] + " ";
//        }
//        return grades;
//    }

//    public float calculateAverage(){
//        int shuma = 0;
//
//        for(int i=0; i < this.grades.length; i++){
//            shuma += this.grades[i];
//        }
//
//        float result = (float)shuma/this.grades.length;
//
//        return result;
//
//    }
//
    @Override
    public String toString() {
        return this.name +"\n"+ this.grades +"\n";
    }
}
