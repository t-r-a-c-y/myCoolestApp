package com.bditw.myCoolestApp;

import com.bditw.myCoolestApp.model.Student;
import com.bditw.myCoolestApp.model.Teacher;
import com.bditw.myCoolestApp.repository.StudentDAO;
import com.bditw.myCoolestApp.repository.StudentDAOImp;
import com.bditw.myCoolestApp.repository.TeacherDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyCoolestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCoolestAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO, TeacherDAO teacherDAO) {
		return runner->
				createStudent(studentDAO);
    }

	public void createStudent(StudentDAO studentDAO) {

		System.out.println("We are going to create a new student");
		Student student = new Student("John", "Doe", "john@doe.com");

		studentDAO.save(student);
		System.out.println("We have saved a new student with id " + student.getId());

	}
	public void createTeacher(TeacherDAO teacherDAO) {
		System.out.println("We are going to create a new teacher");
		Teacher teacher = new Teacher("tracy", "tesi", "john2@doe.com","Java");
		teacherDAO.save(teacher);
		System.out.println("We have saved a new teacher with id " + teacher.getId());

	}
}
