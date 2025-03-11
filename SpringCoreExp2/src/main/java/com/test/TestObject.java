package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestObject {
@Bean
	public static Student getObj1()
	{
		return new Student();
	}

@Bean
public static Order getObj2()
{
	return new Order(11,"ab",12);
}
}
