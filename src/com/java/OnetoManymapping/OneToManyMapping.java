package com.java.OnetoManymapping;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class OneToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		   Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();   
		    
		  ;
		    
		    User_Details1 us = new User_Details1();
		    
		    us.setName("Guru");
		    
		    Vehicles1 veh = new Vehicles1();
		    veh.setName("Flight jet");
		    
		    Vehicles1 veh1 = new Vehicles1();
		    veh1.setName("Car");
		    
		    us.getVehicleName().add(veh);
		    
		    us.getVehicleName().add(veh1);
		    
		    
		    
		    session.persist(us);    
		    session.persist(veh1);
		    session.persist(veh);
		        
		    t.commit();    
		    session.close();    
		    System.out.println("success");
		    
		    
		    
	}

}
