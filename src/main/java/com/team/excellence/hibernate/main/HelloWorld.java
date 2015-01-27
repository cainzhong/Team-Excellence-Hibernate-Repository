 /**
 *@Project: Team-Excellence-Hibernate-Repository
 *
 *@Date: 2015Äê1ÔÂ21ÈÕ
 *@Copyright: 2015 sg.nomaka.tk Inc. All rights reserved.
 */
package com.team.excellence.hibernate.main;


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
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Email email=new Email();
		email.setPrimaryEmail("abc@a.com");
		Long emailID=(Long) session.save(email);
		System.out.println("commit");
		tx.commit();
		session.close();
		
		HibernateUtil.shutdown();
	}
}
