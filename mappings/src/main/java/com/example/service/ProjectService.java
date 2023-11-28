package com.example.service;

import java.util.List;

import com.example.mappings.Project;
import com.example.mappings.Student;

public interface ProjectService {
	
	public Project saveProjectByStudentId(int id,Project project);
	public Project updateProject(int id,Project project);
    public void deleteProjectByStudentId(int id); 
    public void deleteProjectByProjectId(int id);
    public List<Project> findAll();
}
