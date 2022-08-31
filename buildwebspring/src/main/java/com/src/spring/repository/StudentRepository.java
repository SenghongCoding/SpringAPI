package com.src.spring.repository;

import java.util.ArrayList;

import com.src.spring.model.Student;

public interface StudentRepository {
    boolean insertStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudent(Long id);
    ArrayList<Student> findAllStudent();
    Student findStudentById(Long id);
}
