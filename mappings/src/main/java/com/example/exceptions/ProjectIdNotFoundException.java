package com.example.exceptions;

import java.security.PublicKey;

public class ProjectIdNotFoundException extends RuntimeException {
	  public ProjectIdNotFoundException(String mess) {
		super(mess);
	}

}
