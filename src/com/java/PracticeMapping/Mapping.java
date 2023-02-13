package com.java.PracticeMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		   Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();   
		    
		    School sc = new School();
		    sc.setTeacherName("Sai");
		   
		    
		    Students su = new Students();
		    su.setStudent_name("deepa");
		   ;
		   
		   
		    Students su1 = new Students();
		    su1.setStudent_name("guru");
		   ;
		    
		    su1.setSchool(sc);
		    sc.getStudents().add(su);
		    
		    
		    session.persist(sc);    
		    session.persist(su);
		    session.persist(su);
		        
		    t.commit();    
		    session.close();    
		    System.out.println("success");
	}

}
