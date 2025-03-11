package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestDemo {
	public static void main(String[] args) {
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Student obj=ctx.getBean("std",Student.class);
		System.out.println(obj);*/
		
		/*ApplicationContext ctx=new AnnotationConfigApplicationContext(TestObject.class);
		Student obj=ctx.getBean("getObj1",Student.class);
		obj.setId(111);
		obj.setName("kohli");
		List<String>skills=Arrays.asList("python",".net","c++");
		obj.setSkills(skills);
		System.out.println(obj);*/
		
		ApplicationContext ctx1=new AnnotationConfigApplicationContext(TestObject.class);
		Order obj1=ctx1.getBean("getObj2",Order.class);
		System.out.println(obj1);
	}
}
