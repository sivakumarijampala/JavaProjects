package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.models.Project1;
import com.example.models.Student1;
import com.example.repo.StudentRepo;
import com.example.service.StudentService;

@Service
public class StudentServiceNativeImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student1 savestudent(Student1 student) {
		studentRepo.saveStudent(student.getName(), student.getAge(), student.getSalary());
		int studentId = studentRepo.getLastInsertedStudentId();
		List<Project1> projects = student.getProjects();
		for (Project1 pro : projects) {

			studentRepo.saveProject(pro.getName(), pro.getDescription(), studentId);
		}

		return student;
	}

	@Override
	public List<Student1> findAll() {
		List<Student1> students = studentRepo.findallStud();
		return students;
	}

	@Override
	public Student1 updateStudent(int id, Student1 student) {
		Student1 stud = studentRepo.findStudentById(id);
		studentRepo.updateStudent(student.getName(), student.getAge(), student.getSalary(), stud.getId());

		List<Project1> projects = student.getProjects();

		for (Project1 pro : projects) {
			studentRepo.updateProject(pro.getName(), pro.getDescription(), stud.getId());
		}
		return student;
	}

	@Override
	public Page<Student1> getPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		studentRepo.deleteProjects(id);
		studentRepo.deleteStudent(id);

	}

	

}
