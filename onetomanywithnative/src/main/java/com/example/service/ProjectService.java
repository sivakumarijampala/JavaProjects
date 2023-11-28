package com.example.service;

import java.util.List;

import com.example.models.Project1;

public interface ProjectService {

	public Project1 saveProjectByStudentId(int id, Project1 project);

	public Project1 updateProject(int id, Project1 project);

	public void deleteProjectByStudentId(int id);

	public void deleteProjectByProjectId(int id);

	public List<Project1> findAll();
}
