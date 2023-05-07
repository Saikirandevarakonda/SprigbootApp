 package com.mr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mr.model.StudentForm;
import com.mr.service.StudentService;

public class StudentController {
	
	
	@Autowired
public StudentService studentService;
	@PostMapping("/savestudentform")
	public ResponseEntity<String>saveRecord(@RequestBody StudentForm sf){
	try {
		
		studentService.saveStudentFormdata(sf);
		System.out.println("after save record");
			}
	catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
}
	return new ResponseEntity<>("Record successfully",HttpStatus.CREATED);
	


		
		
	}
	
}
