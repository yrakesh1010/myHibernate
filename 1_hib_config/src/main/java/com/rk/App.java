package com.rk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println( "Programm Started..." );
    	
    	//hibernats configuration
    	Configuration cfg=null;
        cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //Student object
        Student stu=null;
        stu=new Student();
        
        //Address object
        Address addr=null; 
        addr = new Address();
        
        SessionFactory factory=cfg.buildSessionFactory();
    	
        System.out.println("Factory object"+factory);
    	
        System.out.println(factory.isClosed());
        
        //set student value
        stu.setId(102);
        stu.setName("Adam");
        stu.setCity("Australia");
        
        //set address value
        addr.setStreet("street1");
        addr.setCity("Londan");
        addr.setIsopen(true);
        addr.setAddedDate(new Date());
        addr.setX(123.373);
        
        //set Image
        FileInputStream file=new FileInputStream("src\\main\\java\\156662.jpg");
        byte[] img=new byte[file.available()];
        addr.setImage(img);
        
        Session currentSession = factory.openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        currentSession.save(stu);
        currentSession.save(addr);
        beginTransaction.commit();
        currentSession.close();
        
        System.out.println("Task complete....");
        
        
        
        
        
        
        
        
    }
}
