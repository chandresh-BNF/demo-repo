package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String name;
	private int mobileNumber;
	private int mathMarks;
	private int physicsMarks;
	private boolean isTopper;

}
