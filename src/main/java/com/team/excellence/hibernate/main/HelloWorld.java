 /**
 *@Project: Team-Excellence-Hibernate-Repository
 *
 *@Date: 2015Äê1ÔÂ21ÈÕ
 *@Copyright: 2015 sg.nomaka.tk Inc. All rights reserved.
 */
package com.team.excellence.hibernate.main;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.team.excellence.hibernate.domain.Email;
import com.team.excellence.hibernate.util.HibernateUtil;

/**
 * @author Cain
 *
 */
public class HelloWorld {
	public static void main(String args[]){
		System.out.println("***********************11******************");
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("*****************************************");
		Email email=new Email();
		email.setPrimaryEmail("abc@a.com");
		Long emailID=(Long) session.save(email);
		tx.commit();
		session.close();
		
		Session newSession=HibernateUtil.getSessionFactory().openSession();
		Transaction newTransaction=newSession.beginTransaction();
		
		List<Email> emailList=newSession.createQuery("from Email").list();
		
		System.out.println(emailList.size()+" record(s) found:");
		
		newTransaction.commit();
		newSession.close();
		
		HibernateUtil.shutdown();
	}
}
