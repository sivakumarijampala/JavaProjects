package com.example.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student2")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student2 implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stud_id")
	private int id;

	@Column(name = "studentname")
	private String name;

	@Column(name = "studentage")
	private int age;

	@Column(name = "studentsalary")
	private double salary;

	@ManyToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JsonManagedReference
	private List<Project2> projects;

}
