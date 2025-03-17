package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		//1.create config class obj
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//2.create sessionFactory obj
		SessionFactory sf=cfg.buildSessionFactory();
		//3.create sesion  obj
		Session session=sf.openSession();
		//4.transaction obj
		Transaction t=session.beginTransaction();
		//transient
		Book b=new Book();
		b.setB_name("python");
		b.setB_author("king");
		b.setB_price(455);
		//5.execute obj
		session.save(b);//persistent state
		//t.commit();
		/*Book bobj=session.get(Book.class,1);
		System.out.println(bobj.getId()+" "+bobj.getB_name()+" "+bobj.getB_author());
		
		bobj.setB_name("servlet");*/
		//session.save(bobj);
		t.commit();
		
		
		
		
		//System.out.println("done");
		//6.close session obj
		session.close();//detached state
		
	}
}
