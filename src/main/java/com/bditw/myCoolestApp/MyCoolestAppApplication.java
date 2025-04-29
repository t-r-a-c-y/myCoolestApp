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

import java.util.List;

@SpringBootApplication
public class MyCoolestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCoolestAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner( StudentDAO studentDAO, TeacherDAO teacherDAO) {
		return runner->
				deleteStudent(studentDAO);
//				updatingTheStudent(studentDAO);
//				gettingStudentByLastName(studentDAO);
//				gettingAllStudents(studentDAO);
//				readStudentById(studentDAO);
//				createStudent(studentDAO);
    }

	private void deleteStudent(StudentDAO studentDAO) {
		int id=3;
		System.out.println(studentDAO.findById(id));
		studentDAO.delete(id);
	}

	private void updatingTheStudent(StudentDAO studentDAO) {
		int id=2;
		Student student = studentDAO.findById(id);
		student.setFirstName("tetat");
		studentDAO.update(student);
		System.out.println(student);
	}

	private void gettingStudentByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Doe");
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private void gettingAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudentById(StudentDAO studentDAO) {

		System.out.println("Creating Student");
		Student student = new Student("Teta","teatte","tttt@gmail.com");
		studentDAO.save(student);
		System.out.println("Saved the student"+ student.getId());
		int theId = student.getId();
		Student theStudent = studentDAO.findById(theId);
		System.out.println(theStudent);
	}

	public void createStudent(StudentDAO studentDAO) {

		System.out.println("We are going to create a new student");
		Student student = new Student("John", "Doe", "john@doe.com");
		Student student2 = new Student("Jane", "Doe", "jane@doe.com");

		studentDAO.save(student);
		studentDAO.save(student2);
		System.out.println("We have saved a new student with id " + student.getId());

	}

}
