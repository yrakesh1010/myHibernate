package com.rk;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Country;
import com.entity.StatesOfCountry;

public class ManyToOne {

	public static void main(String[] args) {
		Configuration cfg=null;
		cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Country country=new Country();
		country.setCountryName("India");
		
		StatesOfCountry states1=new StatesOfCountry();
		states1.setStateList("Madhya Pradesh");
		
		
		StatesOfCountry states2=new StatesOfCountry();
		states2.setStateList("Goa");
		
		StatesOfCountry states3=new StatesOfCountry();
		states3.setStateList("Telangana");
		
		
		List<StatesOfCountry> list=new ArrayList<StatesOfCountry>();
		list.add(states1);
		list.add(states2);
		list.add(states3);
		
		
		country.setStates(list);
		
		states1.setCountry(country);
		states2.setCountry(country);
		states3.setCountry(country);
		
		Session openSession = factory.openSession();
		Transaction tx = openSession.beginTransaction();
		openSession.save(states1);
		openSession.save(states2);
		openSession.save(states3);
		openSession.save(country);
		
		System.out.println("State Name: "+states1.getStateList()+" country:"+states1.getCountry().getCountryName());
		//print list object
		for(StatesOfCountry l: country.getStates() ) {
			System.out.println("country Name: "+country.getCountryName() +"   State Name :"+l.getStateList());
			
		}
		tx.commit();
		openSession.close();
         
	}

}
