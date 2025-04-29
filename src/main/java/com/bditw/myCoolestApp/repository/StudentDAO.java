package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(int id);
}
