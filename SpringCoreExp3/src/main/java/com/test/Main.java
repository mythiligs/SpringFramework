package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Meeting meet=ctx.getBean(Meeting.class);
		System.out.println(meet);
		
		ApplicationContext ctx1=new AnnotationConfigApplicationContext(MeetingConfig.class);
		Meeting obj=(Meeting)ctx1.getBean("obj3");
		System.out.println(obj);
		
		ApplicationContext ctx2=new AnnotationConfigApplicationContext(MeetingConfig.class);
		Records obj1=(Records)ctx2.getBean("obj6");
		System.out.println(obj1);
		
		ApplicationContext ctx3=new ClassPathXmlApplicationContext("beans.xml");
		Records meet1=ctx3.getBean(Records.class);
		System.out.println(meet1);
	}
}
