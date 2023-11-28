package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.models.Project2;
import com.example.models.Student2;
import com.example.repo.StudentRepo;
import com.example.service.StudentService;

@Service
public class StudentServiceNativeImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<Student2> savestudent(List<Student2> students) {
	    for (Student2 student : students) {
	        studentRepo.saveStudent(student.getName(), student.getAge(), student.getSalary());
	        int studentId = studentRepo.getLastInsertedStudentId();
	        List<Project2> projects = student.getProjects();
	        for (Project2 pro : projects) {   
	            studentRepo.saveProject(pro.getName(), pro.getDescription());
	            int projectId = studentRepo.getLastInsertedProjectId(); // Get the last inserted project's ID
	            studentRepo.addStudentToProject(studentId, projectId);
	        }
	    }
	    return students;
	}


	@Override
	public List<Student2> findAll() {
		List<Student2> students = studentRepo.findallStud();
		return students;
	}

	@Override
	public Student2 updateStudent(int id, Student2 student) {
		Student2 stud = studentRepo.findStudentById(id);
		studentRepo.updateStudent(student.getName(), student.getAge(), student.getSalary(), stud.getId());

		List<Project2> projects = student.getProjects();

		for (Project2 pro : projects) {
			studentRepo.updateProject(pro.getName(), pro.getDescription(), stud.getId());
		}
		return student;
	}

	@Override
	public Page<Student2> getPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		studentRepo.deleteStudentAsso(id);
		studentRepo.deleteProjects(id);
		studentRepo.deleteStudent(id);

	}

}
