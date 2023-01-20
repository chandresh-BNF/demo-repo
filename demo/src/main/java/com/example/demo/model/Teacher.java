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
public class Teacher {
	
	private String name;
	private int mobileNumber;
	private List<Student> listOfStudents;
	
	public String getName()
	{
		return this.name;
	}

}
