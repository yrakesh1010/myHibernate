package com.rk;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Project;

public class ManyToMany {

	public static void main(String[] args) {
		//configure hibernate with 
		Configuration cfg=null;
		cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.seteName("Jhon");
		emp2.seteName("Smith");
		emp3.seteName("Symon");
		
		Project proj1=new Project();
		Project proj2=new Project();
		Project proj3=new Project();
		
		proj1.setpName("dataScience");
		proj2.setpName("Web Devlopment");
		proj3.setpName("chat bot");
	
		List<Employee> emp4=new ArrayList<Employee>();
		emp4.add(emp1);
		
		
		List<Project> proj4=new ArrayList<Project>();
		proj4.add(proj1);
		proj4.add(proj3);
		
		emp1.setpList(proj4);
		proj2.seteList(emp4);
		
		Session openSession = factory.openSession();
		Transaction tx = openSession.beginTransaction();
		
		openSession.save(emp1);
		openSession.save(emp2);
		openSession.save(emp3);
		openSession.save(proj1);
		openSession.save(proj2);
		openSession.save(proj3);
		
		tx.commit();
		openSession.close();
		
	}

}
