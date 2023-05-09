package com.rk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Answer;
import com.entity.Question;

public class OneToOneApp {

	public static void main(String[] args) {
		Configuration cfg=null;
		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question qst1=new Question();
		qst1.setQuestion("What is Java?");
		Answer ans1=new Answer(); 
		ans1.setAnswer("Java is programming language");
		qst1.setAnswer(ans1);
		
		
		Question qst2=new Question();
		qst2.setQuestion("What is collection?");
		Answer ans2=new Answer();
		ans2.setAnswer("Collection is a framework");
		qst2.setAnswer(ans2);
		
		Session openSession = factory.openSession();
		Transaction tx = openSession.beginTransaction();
		openSession.save(ans1);
		openSession.save(ans2);
		openSession.save(qst1);
		openSession.save(qst2);
		tx.commit();
		Question question = openSession.get(Question.class, 1);
		System.out.println(question.getQuestion()+" "+question.getAnswer().getAnswer());
		
		openSession.close();
		

	}

}
