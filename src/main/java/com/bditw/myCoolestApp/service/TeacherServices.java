package com.bditw.myCoolestApp.service;

import com.bditw.myCoolestApp.model.Teacher;
import com.bditw.myCoolestApp.repository.TeacherDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Teacher findTeacherById(int id) {
        Optional<Teacher> teacher = teacherDAO.findById(id);
        return teacher.isPresent() ? teacher.get() : null;
    }

    @Override
    public Teacher updateTeacher(Teacher theTeacher) {
        return teacherDAO.save(theTeacher);
    }

    @Override
    public void deleteTeacher(int theid) {
        teacherDAO.deleteById(theid);
    }
    @Override
    public Teacher saveTeacher(Teacher theTeacher) {
        return teacherDAO.save(theTeacher);
    }
}
