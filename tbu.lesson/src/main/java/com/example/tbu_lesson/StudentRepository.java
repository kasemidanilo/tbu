package com.example.tbu_lesson;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findStudentByName(String name);

    void deleteStudentByName(String name);

}
