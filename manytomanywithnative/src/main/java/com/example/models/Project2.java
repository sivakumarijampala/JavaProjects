package com.example.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project2")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project2 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proj_id")
	private int id;

	@Column(name = "projectname")
	private String name;

	@Column(name = "projectdesc")
	private String description;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "stud_proj", 
	           joinColumns = @JoinColumn(name = "projectid", referencedColumnName = "proj_id"),
	           inverseJoinColumns = @JoinColumn(name = "studentid", referencedColumnName = "stud_id"))
	//@JsonBackReference
	@JsonIgnore
	private List<Student2> student;
}
