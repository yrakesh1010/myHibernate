package com.rk;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Question;

public class HqlApp_3_pagination {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session openSession = buildSessionFactory.openSession();
		Transaction txt = openSession.beginTransaction();
		String query = "from Question";
		Query createQuery = openSession.createQuery(query);
		createQuery.setFirstResult(0);
		createQuery.setMaxResults(3);
		List<Question> list = createQuery.list();
		for(Question q:list) {
			System.out.println(q.getQuestionId()+" "+q.getQuestion()+" "+q.getAnswer().getAnswer());
		}
		txt.commit();
		openSession.close();
		buildSessionFactory.close();

	}

}
