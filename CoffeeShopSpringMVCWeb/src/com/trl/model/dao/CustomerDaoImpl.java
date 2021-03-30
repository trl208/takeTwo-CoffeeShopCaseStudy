package com.trl.model.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trl.model.bean.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 */

	@Override
	public void save(Customer customer) throws ClassNotFoundException, SQLException {

		// SessionFactory factory = ConnectionManager.getSessionFactory();
		// For every Transaction one Session object
		Session session = sessionFactory.openSession();
		System.out.println(" session opened-----------");
		Transaction transaction = session.beginTransaction();
		System.out.println(" transaction began-----------");
		session.save(customer);
		System.out.println("=========== customer saved");

		transaction.commit();

		session.close();
		// factory.close();

	}

	@Override
	@Transactional
	public String getCustomerNameByPhone(long phone) throws ClassNotFoundException, SQLException {

		/// SessionFactory factory = ConnectionManager.getSessionFactory();
		// For every Transaction one Session object
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		//Customer cust = session.load(Customer.class, phone);
            Customer cust = (Customer) session.get(Customer.class, phone);
		String name = null;
		/*
		 * Query<Customer> query =
		 * session.createQuery("from Customer where custPhone=:phone");
		 * query.setParameter(phone, phone); name=
		 * query.getResultList().get(0).getName();
		 */

		// System.out.println("===========");

		transaction.commit();

		session.close();
		// factory.close();
		if(cust!=null) {
		return cust.getName();
		}else {
			return name ;
		}
	}

	@Override
	public void saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub

	}

}
