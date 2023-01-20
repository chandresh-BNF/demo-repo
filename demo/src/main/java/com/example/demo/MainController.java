package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Principal;
import com.example.demo.model.Teacher;


@RestController
public class MainController {
	
	Teacher t = new Teacher();
	
	
	
	
	@GetMapping("/")
	public String homePage()
	{
		return "This is home page";
	}
	
	
	@GetMapping("/home/{value}")
	public String firstApi(@RequestBody Integer a)
	{
		return "Hello this is first api hit and its value is: ";
		
	}

}
