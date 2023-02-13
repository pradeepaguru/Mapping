package com.java.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OnetoOneMapping {
	
	
   public static void main(String[] args){
		   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		   Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();   
		    
		    
		   User_Details user = new User_Details();
		    user.setName("Deepa");
		    
		    Vehicles vehicle = new Vehicles();
		    vehicle.setVehicleName("MiniCooper");
		    
		    user.setVehicle(vehicle);
		    
		    session.persist(user);    
		    session.persist(vehicle);      
		    
		        
		    t.commit();    
		    session.close();    
		    System.out.println("success");
   }
     
     

}
