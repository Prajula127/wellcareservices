package com.wellcareservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wellcareservices.modal.Student;

@RestController
@RequestMapping(value = "/welcome")
public class Controller {

	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getStudent(){

      Student std = new Student();
		std.setId(1);
		std.setName("Hello");
		
	  Student std1 = new Student();
		std1.setId(2);
		std1.setName("World");
		
	List<Student> listofstd = new ArrayList<Student>();
		   listofstd.add(std);
		   listofstd.add(std1);
		   
		   return listofstd;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String postStudent(@RequestBody Student std) {
		return "Student ID: "+std.getId()+" , "+" Student Name: "+std.getName();
	}
	
}
