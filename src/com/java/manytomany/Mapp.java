package com.java.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		   Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();   
		    Categories cat = new Categories();
		    cat.setCateName("Amul");
		    
		    Items it = new Items();
		    it.setName("Panner");
		    
		    
		    Items it1 = new Items();
		    it1.setName("Butter");
		    
		    it.getCat().add(cat);
		    
		    it1.getCat().add(cat);
		    
		    
		    
		    session.persist(it); 
		    session.persist(it1);  
		    session.persist(cat);    
		   

		    
		    t.commit();    
		    session.close();    
		    System.out.println("success");

	}

}
