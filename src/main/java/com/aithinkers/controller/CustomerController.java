package com.aithinkers.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aithinkers.model.Customer;

import jakarta.validation.Valid;

@Controller
public class CustomerController {

	//Executed everytime when formData comes
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}

	@GetMapping("/loadCustomerForm")
	public String showCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());

		return "customer-form";
	}

	@PostMapping("/processCustomerForm")
	public String processCustomerForm(@Valid @ModelAttribute("customer") Customer cust, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "customer-form";

		} else {
			return "customer-confirmation";

		}
	}
}
