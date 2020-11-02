package com.tejbhan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tejbhan.demo.dao.StudentRepo;
import com.tejbhan.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return("home.jsp");
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student)
	{
		repo.save(student);
		return("home.jsp");
	}
	
	@RequestMapping("/findStudent")
	public ModelAndView findStudent(@RequestParam int rollno)
	{
		ModelAndView mv = new ModelAndView("/detail.jsp");
		Student student = repo.findById(rollno).orElse(new Student());
		mv.addObject(student);
		return mv;
	}
	
		
}
