package com.example.serviceimpl;

import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.mappings.Student;
import com.example.repo.StudentRepo;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student savestudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAll() {
		List<Student> students = studentRepo.findAll();
		return students;
	}

	@Override
	public Student updateStudent(int id, Student student) {
		student.setId(id);
		return studentRepo.save(student);
	}

	

	
	
	public Page<Student> getPage(int pageNo, int pageSize) {

		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return studentRepo.findAll(pageable);

	}

	@Override
	public void delete(int id) {
		Optional<Student> student=studentRepo.findById(id);
		// TODO Auto-generated method stub
		if(student.isPresent()) {
			Student stu=student.get();
			studentRepo.delete(stu);
		}
		
		
	}

}
