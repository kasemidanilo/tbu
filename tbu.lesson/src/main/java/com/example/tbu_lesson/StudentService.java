package com.example.tbu_lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    static List<Student> studentList = new ArrayList<>();

    public void addStudent(@RequestBody Student student){
//        studentList.add(student);
        repository.save(student);

    }

    public List<Student> getStudentList(){
//        return studentList;
        return repository.findAll();
    }

    public void deleteStudent(@PathVariable String name){

//        for (int i=0; i< studentList.size(); i++){
//
//            if(studentList.get(i).getName().equals(name)){
//
//                studentList.remove(i);
//            }
//        }

        repository.deleteStudentByName(name);

    }

    public Student getStudentbyName(@PathVariable String name){

//        for (int i=0; i< studentList.size(); i++){
//
//            if(studentList.get(i).getName().equals(name)){
//
//                return studentList.get(i);
//            }
//        }
//        return null;

        return repository.findStudentByName(name);
    }


    public double getAverage(){
//        int shuma = 0;
//
//        for (int i=0; i< studentList.size(); i++){
//            shuma += studentList.get(i).getAge();
//        }
//
//        return shuma/studentList.size();

        return studentList
                .stream()
                .mapToInt(s-> s.getAge())
                .average()
                .orElse(0.0);

    }

}
