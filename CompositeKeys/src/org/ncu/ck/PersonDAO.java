package org.ncu.ck;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ncu.personck.PersonComposite;

public class PersonDAO {
	
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	/* saving object state into the database */
	public void create() {
		
		PersonComposite  res = new PersonComposite("USA", "California", "Gurgson",122003,"Residential");
		PersonComposite off = new PersonComposite("India","Haryana","Gurugram",122003,"Official");
		Person per = new Person("John", new Date() ,"john@ncu.com", 25);
		per.setpCom(off);
		per.setRes(res);
		// step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();
	
		// step 2: create a transaction boundary
		session.beginTransaction();
		
		// step 3: perform save/insert operation
		session.save(per);
		
		// step 4: commit the transaction
		session.getTransaction().commit();
		
		// step 5: close the session
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
	
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
}

