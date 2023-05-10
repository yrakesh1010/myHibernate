package com.rk;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlApp_2_joins {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session openSession = factory.openSession();
		Transaction txt = openSession.beginTransaction();
		//HQL query
		String joinQuery = "select e.questionId,e.question, a.answer from Question e INNER JOIN e.answer a";
        Query createQuery = openSession.createQuery(joinQuery);
        List<Object[]> resultList = createQuery.getResultList();
        for(Object[] obj:resultList) {
        	System.out.println(Arrays.toString(obj));
        }
        
        txt.commit();
        openSession.close();
        factory.close();
        
	}

}
