package com.rk;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class HqlApp_1 {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Student std1=new Student();
//		std1.setName("Karan");
//		std1.setId(1);
//		std1.setCity("Hydrabad");
//		Student std2=new Student();
//		std2.setId(2);
//		std2.setName("Ram");
//		std2.setCity("Raipur");
//		Student std3=new Student();
//		std3.setId(3);
//		std3.setName("Rahul");
//		std3.setCity("Bhopal");
		
		Session openSession = factory.openSession();
		Transaction txt = openSession.beginTransaction();
//		openSession.save(std1);
//		openSession.save(std2);
//		openSession.save(std3);
		
		//Fetch data by using HQL 
		String fetchQuery="from Student as s where s.city=:x";
		Query createNamedQuery = openSession.createQuery(fetchQuery);
		createNamedQuery.setParameter("x", "Raipur");
		List<Student> list = createNamedQuery.list();
		for(Student std:list) {
			System.out.println("Student Name : "+std.getName());
		}
		
		//Delete data by using HQL
	    String deleteQuery = "delete from Student where city='raipur'";
		Query createQuery = openSession.createQuery(deleteQuery);
		int count = createQuery.executeUpdate();
		System.out.println(count+" record deleted");
		
		//Update data by using HQL
		String updateQuery = "update Student set city='Bilaspur' where id=1";
		Query createQuery2 = openSession.createQuery(updateQuery);
		int count1 = createQuery2.executeUpdate();
		System.out.println(count1+" Record Updated");
		
		txt.commit();
		openSession.close();
		factory.close();
		
	}

}
