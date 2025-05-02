package com.aithinkers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Student {

	// Load Empty Form
	@GetMapping("/loadEmptyForm")
	public String showForm() {
		return "show-form";
	}

	//Converting name to UpperCase
	@PostMapping("/processForm")
	public String processForm2(@RequestParam("studentName") String name, Model model) {

		model.addAttribute("namewithuprcase", name.toUpperCase());

		return "process-form";
	}
	

}
