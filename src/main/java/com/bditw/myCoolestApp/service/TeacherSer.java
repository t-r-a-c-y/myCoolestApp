package com.bditw.myCoolestApp.service;

import com.bditw.myCoolestApp.model.Teacher;

import java.util.List;

public interface TeacherSer {
    Teacher saveTeacher(Teacher teacher);
    List<Teacher> findAll();
    Teacher findTeacherById(int id);
    void deleteTeacher(int id);
    Teacher updateTeacher(Teacher teacher);
}
