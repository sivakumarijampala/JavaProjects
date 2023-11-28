package com.example.exceptions;

public class ProjectDetailsNotFoundException extends RuntimeException {
	public ProjectDetailsNotFoundException(String mess) {
		super(mess);

	}

}
