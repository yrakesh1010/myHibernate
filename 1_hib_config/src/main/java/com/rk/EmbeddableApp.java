package com.rk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Certificate;
import com.entity.Student;

public class EmbeddableApp {

	public static void main(String[] args) {
		Configuration cfg=null;
		cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student std1=new Student();
		std1.setId(111);
		std1.setCity("Mumbai");
		std1.setName("karan");
		Certificate cer=new Certificate();
		cer.setCourse("Java");
		cer.setDuration("2 month");
		std1.setCer(cer);
		
		Student std2=new Student();
		std2.setId(222);
		std2.setCity("Banglore");
		std2.setName("Ajay");
		Certificate cer2=new Certificate();
		cer2.setCourse("Hibernate");
		cer2.setDuration("3 months");
		std2.setCer(cer2);
		
		Session openSession = factory.openSession();
		Transaction tx = openSession.beginTransaction();
		openSession.save(std1);
		openSession.save(std2);
		tx.commit();
		openSession.close();
	}

}
