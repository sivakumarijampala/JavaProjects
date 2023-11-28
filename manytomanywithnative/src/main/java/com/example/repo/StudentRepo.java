package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.models.Student2;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student2, Integer> {

	@Modifying
	@Transactional
	@Query(value = "insert into Student2 (studentname,studentage,studentsalary) values(:name,:age,:salary)", nativeQuery = true)
	public void saveStudent(@Param("name") String name, @Param("age") int age, @Param("salary") double salary);

	@Modifying
	@Transactional
	@Query(value = "insert into Project2 (projectname,projectdesc) values(:name,:description)", nativeQuery = true)
	public void saveProject(@Param("name") String name, @Param("description") String description);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO stud_proj (studentid, projectid) VALUES (:studentId, :projectId)", nativeQuery = true)
	public void addStudentToProject(@Param("studentId") int studentId, @Param("projectId") int projectId);

	@Query(value = "SELECT LAST_INSERT_ID()", nativeQuery = true)
	int getLastInsertedStudentId();

	@Query(value = "SELECT MAX(proj_id) FROM Project2", nativeQuery = true)
	Integer getLastInsertedProjectId();

	@Query(value = "select * from Student2", nativeQuery = true)
	public List<Student2> findallStud();

	@Query(value = "select * from Student2 where id=:id", nativeQuery = true)
	public Student2 findStudentById(int id);

	@Modifying
	@Transactional
	@Query(value = "delete from Student2 s where s.stud_id=:studentId ", nativeQuery = true)
	public void deleteStudent(@Param("studentId") int studentId);
    
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM stud_proj WHERE studentid = :studentId", nativeQuery = true)
	public void deleteStudentAsso(@Param("studentId") int studentId);

	
	@Modifying
	@Transactional
	@Query(value = "delete from Project2 p where p.proj_id=:projectId ", nativeQuery = true)
	public void deleteProjects(@Param("projectId") int projectId);

	@Modifying
	@Transactional
	@Query(value = "update Student2 s set s.studentname=:name,s.studentage=:age,s.studentsalary=:salary where s.id=:studentId", nativeQuery = true)
	public void updateStudent(@Param("name") String name, @Param("age") int age, @Param("salary") double salary,
			@Param("studentId") int studentId);

	@Modifying
	@Transactional
	@Query(value = "update Project2  p set p.projectname=:name,p.projectdesc=:description where p.studentid=:studentId", nativeQuery = true)
	public void updateProject(@Param("name") String name, @Param("description") String description,
			@Param("studentId") int studentId);

}
