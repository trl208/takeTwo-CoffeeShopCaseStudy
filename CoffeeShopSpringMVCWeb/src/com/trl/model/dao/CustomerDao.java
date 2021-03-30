package com.trl.model.dao;


import java.sql.SQLException;

import com.trl.model.bean.Customer;

public interface CustomerDao {
	
	void save(Customer customer) throws ClassNotFoundException, SQLException;
	void saveOrUpdate(Customer customer);
	void delete(Customer customer);
	String getCustomerNameByPhone(long phone) throws ClassNotFoundException, SQLException;

}
