package com.aithinkers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aithinkersmodel.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String loadEmptyForm(Model model)
	{
		//Creating empty student object
		Student stud=new Student();
		
		//Adding Empty Student object to the model
		model.addAttribute("student",stud);
		
		return "student-form";
		
	}
	
	@PostMapping("/procssStudentForm")
	public String processForm(@ModelAttribute("student") Student student)
	{
		return null;
		
	}

}
