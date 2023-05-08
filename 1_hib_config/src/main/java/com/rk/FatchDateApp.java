package com.rk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;

public class FatchDateApp {
	
   public static void main(String[] args) {
	   
	   System.out.println("featch App start...");
	   SessionFactory factory=null;
	   Configuration con=null;
	   con=new Configuration();
	   con.configure("hibernate.cfg.xml");
	   factory=con.buildSessionFactory();
	   
	   Session openSession = factory.openSession();
	   //get method(if object not found it will return Null)
	   Student student = (Student)openSession.get(Student.class, 102);
	   System.out.println(student);
	   //load method(if object not found it will throw objectNotFoundException)
	   Address addr = openSession.load(Address.class, 1);
	   System.out.println(addr.getCity()+" "+addr.getStreet());
	   
	   openSession.close();
	   factory.close();
	   System.out.println("featch App end...");
}
   
 
   
}
