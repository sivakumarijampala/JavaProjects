package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.models.Student1;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student1, Integer> {

	@Modifying
	@Transactional
	@Query(value = "insert into Student1 (studname,studage,studsalary) values(:name,:age,:salary)", nativeQuery = true)
	public void saveStudent(@Param("name") String name, @Param("age") int age, @Param("salary") double salary);

	@Modifying
	@Transactional
	@Query(value = "insert into Project1 (projname,projdesc,studid) values(:name,:description,:studentId)", nativeQuery = true)
	public void saveProject(@Param("name") String name, @Param("description") String description,
			@Param("studentId") int studentId);

	@Query(value = "SELECT LAST_INSERT_ID()", nativeQuery = true)
	int getLastInsertedStudentId();

	@Query(value = "select * from Student1", nativeQuery = true)
	public List<Student1> findallStud();

	@Query(value = "select * from Student1 where id=:id", nativeQuery = true)
	public Student1 findStudentById(int id);

	@Modifying
	@Transactional
	@Query(value = "delete from Student1 s where s.id=:studentId ", nativeQuery = true)
	public void deleteStudent(@Param("studentId") int studentId);

	@Modifying
	@Transactional
	@Query(value = "delete from Project1 p where p.studid=:studentId ", nativeQuery = true)
	public void deleteProjects(@Param("studentId") int studentId);

	@Modifying
	@Transactional
	@Query(value = "update Student1 s set s.studname=:name,s.studage=:age,s.studsalary=:salary where s.id=:studentId", nativeQuery = true)
	public void updateStudent(@Param("name") String name, @Param("age") int age, @Param("salary") double salary,
			@Param("studentId") int studentId);

	@Modifying
	@Transactional
	@Query(value = "update Project1  p set p.projname=:name,p.projdesc=:description where p.studid=:studentId", nativeQuery = true)
	public void updateProject(@Param("name") String name, @Param("description") String description,
			@Param("studentId") int studentId);

}
