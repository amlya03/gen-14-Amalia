package com.roytuts.spring.boot.ajax.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/")
	public String list() {
		return "index";
	} 
	
}