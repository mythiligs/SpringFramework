package com.test.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name="hello wrold",description="the rest api")
@RestController
public class HelloWorld {
	User obj=new User();
	@Value("${name.fname}")
	private String fname;
	@Value("${email.email}")
	private String email;
	@Value("${desg.role}")
	private String desgrole;
	@Operation(summary="fetch all records")
	@GetMapping("/test")
	public String testActuator()
	{
		obj.setDesgrole(desgrole);
		obj.setEmail(email);
		obj.setFname(fname);
		return "simple actuator response"+obj;
	}

}
