package com.aithinkers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Utility {

	@GetMapping("/getTimeAndDate")
	public String getTimeAndDate(Model model) {
		model.addAttribute("theDate", java.time.LocalDateTime.now());
		return "dateTime";
	}

}
