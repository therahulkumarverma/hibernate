package com.NewHibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class StoreDaoImpl implements StoreDao {

	
	 @PersistenceContext
	    private EntityManager entityManager;

	 @PersistenceContext
	    public void setEntityManager(EntityManager entityManager) {
	        this.entityManager = entityManager;
	    }
	    @Override
	    public void saveUser(Store store) {
	        entityManager.persist(store);
	    }

	  

	    @Override
	    public List<Store> getAllUsers() {
	        TypedQuery<Store> query = entityManager.createQuery("SELECT u FROM store u", Store.class);
	        return query.getResultList();
	    }
}
