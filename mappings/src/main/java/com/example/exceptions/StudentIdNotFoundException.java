package com.example.exceptions;

public  class StudentIdNotFoundException  extends RuntimeException{
  public StudentIdNotFoundException(String mess) {
	  super(mess);
  }
}
