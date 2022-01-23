package com.telusko.xml.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien alien = new Alien();
		alien.setId(110);
		alien.setAname("Nagammai");
		alien.setColor("Black");
		
		//In some configurations instead of @Entity and other annotations hbm.xml file will have all the configurations 
		
//		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//    	Session session = sessionFactory.openSession();  
//		Transaction t = session.beginTransaction();   
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();   
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();    
//		SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();  
//    	Session session = sessionFactory.openSession();  
//		Transaction t = session.beginTransaction();  
		
//		Here entity is identified from the xml file <mapping tag>
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = sessionFactory.openSession();  
		Transaction t = session.beginTransaction();  
//		session.save(alien);
		
		t.commit();
		
		Transaction t1 = session.beginTransaction();  
		Alien a1 =  new Alien();
		a1 = session.get(Alien.class,101);
		System.out.println(a1);
		t1.commit();
		
	}

}
