package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MeetingConfig {
	static List<String>sk=Arrays.asList("s1","s2","s3");
	@Bean
	public static Address obj4()
	{
		return new Address();
	}
	public static Address obj5()
	{
		return new Address(1,"subi");
	}
	@Bean
	public static Meeting obj1()
	{
		return new Meeting();
	}
	@Bean
	public static Meeting obj2()
	{
		return new Meeting(101,"mythili",123,sk,obj4());
	}
	@Bean
	public static Meeting obj3()
	{
		return new Meeting(101,"mythili",123,sk,obj5());
	}
	@Bean
	public static Records obj6()
	{
		return new Records(101,"sumathi",5,sk,obj5());
	}
	
}
