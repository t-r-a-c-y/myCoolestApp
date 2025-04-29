package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
}
