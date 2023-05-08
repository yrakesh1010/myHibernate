package com.rk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Programm Started..." );
    	
    	//hibernats configuration
    	Configuration cfg=null;
        cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //Student object
        Student stu=null;
        stu=new Student();
        
        SessionFactory factory=cfg.buildSessionFactory();
    	
        System.out.println("Factory object"+factory);
    	
        System.out.println(factory.isClosed());
        
        //set student value
        stu.setId(101);
        stu.setName("Jhon");
        stu.setCity("Newyork");
        
        Session currentSession = factory.openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        currentSession.save(stu);
        beginTransaction.commit();
        currentSession.close();
        
        
        
        
        
        
        
        
    }
}
