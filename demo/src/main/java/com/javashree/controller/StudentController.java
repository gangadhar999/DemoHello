package com.javashree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/Message")
	public String getMessage() {
		
		return "Hello Student";
	}

}
