package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Address a = new Address();
		a.setStreet("Ratu road"); a.setCity("Ranchi"); a.setPincode(835214); a.setState("Jharkhand");
		
		Employee e = new Employee();
		e.setEid(101); e.setEname("Karuna"); e.setEsalary(15000.0); e.setAdd(a);
		
		//we will not save address because we have embedded that in Employee class
		
		s.save(e);
		
		t.commit();
		s.close();
	}

}
