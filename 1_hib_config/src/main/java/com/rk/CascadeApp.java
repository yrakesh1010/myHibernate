package com.rk;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.BankBranch;
import com.entity.Banks;

public class CascadeApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
		//Bank obj
		Banks bank1=new Banks();
        bank1.setBankName("SBI");
        Banks bank2=new Banks();
        bank1.setBankName("KOTAK");
        Banks bank3=new Banks();
        bank1.setBankName("ICICI");
        
        //BankBranch obj
        BankBranch branch1=new BankBranch();
        branch1.setBranch("Jamuna colliey");
        branch1.setBank(bank1);
        BankBranch branch2=new BankBranch();
        branch2.setBranch("Bhalumada");
        branch2.setBank(bank2);
        BankBranch branch3=new BankBranch();
        branch3.setBranch("Kotma");
        branch3.setBank(bank3);
        List<BankBranch> list1=new ArrayList<BankBranch>();
        list1.add(branch1);
        list1.add(branch2);
        
        bank1.setBranch(list1);
        
        Session openSession = factory.openSession();
        Transaction txt = openSession.beginTransaction();
        openSession.save(bank1);
        openSession.save(bank2);
        openSession.save(bank3);
        
        txt.commit();
        openSession.close();
        factory.close();
        
        
        
	}

}
