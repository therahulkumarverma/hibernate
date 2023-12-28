package com.NewHibernate;

import java.util.List;

public interface StoreDao {

	void saveUser(Store store);


    List<Store> getAllUsers();
}
