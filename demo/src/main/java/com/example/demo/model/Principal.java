package com.example.demo.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Principal {
	
	private String name;
	private String schoolName;
	private int mobileNumber;
	
	
	
	List<Teacher> listOfTeachers;

}
