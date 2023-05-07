package com.mr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.model.StudentForm;
import com.mr.repository.StudentRepository;

@Service
public class StudentService {
	
@Autowired	
private StudentRepository studentRepository;

public void saveStudentFormdata(StudentForm sf) {
	
	studentRepository.save(sf);
}
	
	
	

}
