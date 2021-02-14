/**
 * 
 */
package com.app.mk.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mk.dao.api.OrderDaoApi;
import com.app.mk.entity.OrderEntity;
import com.app.mk.repo.OrderRepo;

/**
 * @author Murari
 *
 */
@Service
public class OrderDaoImpl implements OrderDaoApi {

	
	@Autowired
	private OrderRepo orderRepo;

	@Override
	public OrderEntity submitOrder(OrderEntity entity) {
		try {
		entity=orderRepo.save(entity);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return entity;
	}
}
