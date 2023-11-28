package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptions.ProjectDetailsNotFoundException;
import com.example.exceptions.ProjectIdNotFoundException;
import com.example.exceptions.SaveProjectException;
import com.example.exceptions.StudentIdNotFoundException;
import com.example.exceptions.UpdateProject;
import com.example.mappings.Project;
import com.example.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;

	
	Logger logger=LoggerFactory.getLogger(ProjectController.class);
	
	@PostMapping(value="/savepro/{id}",produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> saveProjectByStudentId(@PathVariable int id,@RequestBody Project project){
		logger.info("entered save project by student id method in project controller");
		if(project==null) {
			logger.error("project can not be null throwing save project exception");
			throw new SaveProjectException("project details can not be null");
		}
		logger.info("project saved successfully");
		return ResponseEntity.ok(projectService.saveProjectByStudentId(id, project));
		
	}

	
	@PutMapping(value="/updateproject/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable int id,@RequestBody  Project project){
		logger.info("entered update project method in project controlller class");
		if(project==null) {
			logger.error("project details are null throwing upadte project exception");
			throw new UpdateProject("project can not be null");
		}
		logger.info("student updated succeffully");
		return ResponseEntity.ok(projectService.updateProject(id, project));
		
	}
	
	@DeleteMapping(value="/deleteprobystudentid/{studId}")
	public ResponseEntity<String> deleteProjByStudentId(@PathVariable int studId){
		if(studId <=0) {
			throw new StudentIdNotFoundException("student id not found");
		}
	    projectService.deleteProjectByStudentId(studId);
	    return ResponseEntity.ok("project deleted with student id successfully");
		
	}
	
	@DeleteMapping(value="/deletepro/{projId}")
	public ResponseEntity<String> deleteProject(@PathVariable  int projId){
		logger.info("entered into delete project method in project controller");
		if(projId<=0) {
		throw new ProjectIdNotFoundException("project id not found");
		}
		projectService.deleteProjectByProjectId(projId);
		return ResponseEntity.ok("project deleted succefully with" +projId);
	}
	
	
	@GetMapping(value="/fetchallpro")
	public ResponseEntity<List<Project>> findAll(){
		logger.info("entered into find all method in project controller");
		List<Project> projects=projectService.findAll();
		if(projects==null) {
			throw new ProjectDetailsNotFoundException("project details not found");
		}
		return ResponseEntity.ok(projects);
	}
	

}
