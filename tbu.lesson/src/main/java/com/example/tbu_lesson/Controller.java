package com.example.tbu_lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentService service;

    static List<Student> studentList = new ArrayList<>();


    @GetMapping("/helloworld/{name}")
    public String getHello(@PathVariable String name){

        return "Hello "+ name;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
//        studentList.add(student);
//        repository.save(student);
        service.addStudent(student);

    }

    @GetMapping("/student")
    public List<Student> getStudentList(){
//        return studentList;
//        return repository.findAll();
        return service.getStudentList();
    }

    @DeleteMapping("/student/{name}")
    public void deleteStudent(@PathVariable String name){

//        for (int i=0; i< studentList.size(); i++){
//
//            if(studentList.get(i).getName().equals(name)){
//
//                studentList.remove(i);
//            }
//        }

//        repository.deleteStudentByName(name);

        service.deleteStudent(name);

    }

    @PostMapping("/student/{name}")
    public Student getStudentbyName(@PathVariable String name){

//        for (int i=0; i< studentList.size(); i++){
//
//            if(studentList.get(i).getName().equals(name)){
//
//                return studentList.get(i);
//            }
//        }
//        return null;

//        return repository.findStudentByName(name);
        return service.getStudentbyName(name);
    }


    @GetMapping("/average")
    public double getAverage(){
//        int shuma = 0;
//
//        for (int i=0; i< studentList.size(); i++){
//            shuma += studentList.get(i).getAge();
//        }
//
//        return shuma/studentList.size();

//        return studentList
//                .stream()
//                .mapToInt(s-> s.getAge())
//                .average()
//                .orElse(0.0);

        return service.getAverage();

    }

}
