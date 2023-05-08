package com.rk;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Programm Started..." );
    	
    	Configuration cfg=null;
        cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
    	
        System.out.println("Factory object"+factory);
    	
        System.out.println(factory.isClosed());
    }
}
