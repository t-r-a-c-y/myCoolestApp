package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TeacherDAO extends JpaRepository<Teacher, Integer> {

}
