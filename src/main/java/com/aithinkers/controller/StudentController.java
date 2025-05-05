package com.aithinkers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.aithinkers.SpringMvcThymeleafApplication;
import com.aithinkers.model.Student;

@Controller
public class StudentController {
	
	@Value("${countries}")
	private List<String> countries;
	
	@Value("${languages}")
	private List<String> languages;
	
	@Value("${systems}")
	private List<String> systems;

	@GetMapping("/")
	public String loadEmptyForm(Model model)
	{
		//Creating empty student object
		Student stud=new Student();
		
		//Adding Empty Student object to the model
		model.addAttribute("student",stud);
		
		//Adding List of countries
		model.addAttribute("countries",countries);
		
		//Adding List of languages
		model.addAttribute("languages",languages);

		//Adding List of Operating Systems
		model.addAttribute("systems",systems);

		
		return "student-form";
		
	}
	
	@PostMapping("/procssStudentForm")
	public String processForm(@ModelAttribute("student") Student stud)
	{
		System.out.println(stud.getFirstName()+" "+stud.getLastName());
		return "student-confirmation";
		
	}

}
