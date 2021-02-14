/**
 * 
 */
package com.app.mk.service.impl;


import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mk.dao.api.OrderDaoApi;
import com.app.mk.entity.OrderEntity;
import com.app.mk.info.OrderInfo;
import com.app.mk.service.api.OrderServiceApi;

/**
 * @author Murari
 *
 */

@Service
public class OrderServiceImpl implements OrderServiceApi {
 
	@Autowired
	private OrderDaoApi orderDaoApi;

//	@Autowired
//	private ModelMapper modelMapper;
	
	 ModelMapper modelMapper = new ModelMapper();
	@Override
	public OrderInfo submitOrder(OrderInfo orderInfo) {
		orderInfo.setModifiedDate(new Date());
		orderInfo.setOrderedDate(new Date());
		orderInfo.setOrderStatus("Palaced");
		OrderEntity orderEntity  = modelMapper.map(orderInfo, OrderEntity.class);
		orderEntity = orderDaoApi.submitOrder(orderEntity);
		orderInfo  =modelMapper.map(orderEntity, OrderInfo.class);
		return orderInfo;
	}

	@Override
	public OrderInfo updateOrder(OrderInfo orderInfo) {
			orderInfo.setModifiedDate(new Date());
			OrderEntity orderEntity  = modelMapper.map(orderInfo, OrderEntity.class);
			orderEntity = orderDaoApi.submitOrder(orderEntity);
			orderInfo  =modelMapper.map(orderEntity, OrderInfo.class);
			return orderInfo;
		}
	
}
