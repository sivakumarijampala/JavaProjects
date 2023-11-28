package com.example.service;

import java.util.List;

import com.example.models.Project2;

public interface ProjectService {

	public Project2 saveProjectByStudentId(int id, Project2 project);

	public Project2 updateProject(int id, Project2 project);

	public void deleteProjectByStudentId(int id);

	public void deleteProjectByProjectId(int id);

	public List<Project2> findAll();
}
