package com.trl.coffee.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trl.coffee.bean.OrderDetail;
import com.trl.coffee.dao.OrderDetailsDao;
import com.trl.coffee.dao.OrderDetailsDaoImpl;
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	@Autowired
	private OrderDetailsDao orderDetailDao ;
	
	public void setOrderDetailDao(OrderDetailsDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
	}

	@Override
	public void save(OrderDetail order) throws ClassNotFoundException, SQLException {
	
		orderDetailDao.save(order);
		
	}

	/*
	 * @Override public void saveOrUpdate(OrderDetail order) throws
	 * ClassNotFoundException, SQLException { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void delete(OrderDetail order) throws
	 * ClassNotFoundException, SQLException { // TODO Auto-generated method stub
	 */		
//	}

	@Override
	public OrderDetail convertUpperCase(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
}
