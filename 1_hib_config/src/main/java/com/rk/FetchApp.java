package com.rk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class FetchApp {

	public static void main(String[] args) {
		Configuration cfg=null;
		cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		
		Session openSession = buildSessionFactory.openSession();
		Employee employee = (Employee)openSession.get(Employee.class, 1);
		System.out.println(employee.getEmpid()+"  "+employee.geteName());
		
		openSession.close();
		

	}

}
