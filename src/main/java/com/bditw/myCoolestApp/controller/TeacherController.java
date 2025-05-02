package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.model.Teacher;
import com.bditw.myCoolestApp.service.TeacherServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tech")
public class TeacherController {
    private TeacherServices teacherService;
    public TeacherController(TeacherServices teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.findAll();
    }

    @GetMapping("/teachers/{teacherId")
    public Teacher getTeacher(@PathVariable int teacherId) {
        return teacherService.findTeacherById(teacherId);
    }

    @PostMapping("/teachers")
    public Teacher createTeacher(@RequestBody Teacher theTeacher) {
        return teacherService.saveTeacher(theTeacher);
    }

    @PutMapping("/teachers")
    public Teacher updateTeacher(@RequestBody Teacher theTeacher) {
        return teacherService.saveTeacher(theTeacher);
    }
    @DeleteMapping("/teachers/{id}")
    public void deleteTeacher(@PathVariable int id) {
        teacherService.deleteTeacher(id);
    }
}
