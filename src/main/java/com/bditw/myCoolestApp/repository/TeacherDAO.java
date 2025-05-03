package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@RepositoryRestResource(path = "teachers")
public interface TeacherDAO extends JpaRepository<Teacher, Integer> {

}
