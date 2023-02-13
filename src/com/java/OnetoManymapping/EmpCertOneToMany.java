package com.java.OnetoManymapping;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class EmpCertOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		   Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();   
		    
		    EmployeeDetails ed = new EmployeeDetails();
		    
		    ed.setName("Deepajj");
		    
		    Certification c = new Certification();
		    
		    c.setCertName("Javajjj");
		    
            Certification c1 = new Certification();
		    
		    c1.setCertName("Angularjj");
		    
		    c.setEmp(ed);
		    c1.setEmp(ed);
		   
		    
		    ed.getCertificate().add(c);
		    
		    ed.getCertificate().add(c1);
		   
		    
		    session.persist(ed);    
		    session.persist(c);
		    session.persist(c1);
		    
		    t.commit();    
		    session.close();    
		    System.out.println("success");
		    

	}

}
