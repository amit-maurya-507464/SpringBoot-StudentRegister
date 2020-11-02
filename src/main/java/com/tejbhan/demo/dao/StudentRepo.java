package com.tejbhan.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.tejbhan.demo.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> 
{

}
