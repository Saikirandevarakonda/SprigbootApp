package com.mr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mr.model.StudentForm;

@Repository
public interface StudentRepository extends JpaRepository<StudentForm, String> {

}
