package com.rk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Banks;

public class CacheApp_1_FiestLevel {

	public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       
       Session openSession = factory.openSession();
       //Transaction txt = openSession.beginTransaction();
      
       Banks bankBranch1 = openSession.get(Banks.class, 1);
       System.out.println(bankBranch1.getBankName());
    
       System.out.println("Dowing other work....");
       
       Banks bankBranch2= openSession.get(Banks.class, 1);
       System.out.println(bankBranch2.getBankName());
       
       System.out.println(openSession.contains(bankBranch2));
       
      // txt.commit();
       openSession.close();
       factory.close();
	}

}
