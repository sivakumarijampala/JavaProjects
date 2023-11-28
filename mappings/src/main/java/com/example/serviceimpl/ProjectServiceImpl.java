package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exceptions.StudentNotFoundException;
import com.example.mappings.Project;
import com.example.mappings.Student;
import com.example.repo.ProjectRepo;
import com.example.repo.StudentRepo;
import com.example.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepo projectRepo;

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Project saveProjectByStudentId(int id, Project project) {
		Optional<Student> students = studentRepo.findById(id);
		if (students.isPresent()) {
			Student student = students.get();
			project.setStudent(student);
			return projectRepo.save(project);
		} else {

			throw new StudentNotFoundException("Student with ID " + id + " not found");
		}

	}

	@Override
	public Project updateProject(int id, Project project) {
		Optional<Student> student = studentRepo.findById(id);

		if (student.isPresent()) {
			//Student student1 = student.get();
			Project project1 = projectRepo.FindByStudentId(id);
			if (project1 != null) {
				project1.setName(project.getName());
				project1.setDescription(project.getDescription());
				return projectRepo.save(project1);
			}

			else {
				throw new StudentNotFoundException("Student with ID " + id + " not found");
			}
			
		} else {
			throw new StudentNotFoundException("Student with ID " + id + " not found");
		}

	}

	@Override
	public void deleteProjectByStudentId(int id) {
		Optional<Student> student=studentRepo.findById(id);
		if(student.isPresent()) {
			Student stud=student.get();
			Project proj=projectRepo.FindByStudentId(id);
			if(proj!=null) {
				projectRepo.delete(proj);
			}
		}
		
	}

	@Override
	public void deleteProjectByProjectId(int id) {
		// TODO Auto-generated method stub
		Optional<Project> project=projectRepo.findById(id);
		if(project.isPresent()) {
			Project project1=project.get();
			projectRepo.delete(project1);
		}
		
	}

	@Override
	public List<Project> findAll() {
		List<Project> projects=projectRepo.findAll();
		return projects;
	}
	
	
	
	
	
	

}
