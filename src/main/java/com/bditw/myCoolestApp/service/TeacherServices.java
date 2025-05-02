package com.bditw.myCoolestApp.service;

import com.bditw.myCoolestApp.model.Teacher;
import com.bditw.myCoolestApp.repository.TeacherDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServices implements TeacherSer{
    private TeacherDAO teacherDAO;
    public TeacherServices(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public List<Teacher> findAll(){
    return teacherDAO.findAll();
    }

}
