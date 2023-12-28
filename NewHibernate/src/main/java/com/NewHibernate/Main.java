package com.NewHibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {


	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

		
		StoreDao storedao=new StoreDaoImpl();
		
		 ((StoreDaoImpl) storedao).setEntityManager(entityManagerFactory.createEntityManager());
	
		
		
		
        Store newUser = new Store();
        
        newUser.setId(1);
        newUser.setName("RAHUL");
        newUser.setAddress("NOIDA");

        
        storedao.saveUser(newUser);
        
        entityManagerFactory.close();
	}

}
