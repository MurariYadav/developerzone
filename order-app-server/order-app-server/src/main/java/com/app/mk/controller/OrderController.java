package com.app.mk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.mk.entity.OrderEntity;
import com.app.mk.info.OrderInfo;
import com.app.mk.service.api.OrderServiceApi;


@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceApi orderServiceApi;
	
	
	
	@PostMapping("/submitOrder")
	public ResponseEntity<?> submitOrder(@RequestBody OrderInfo orderInfo){
		orderInfo = orderServiceApi.submitOrder(orderInfo);
		return new ResponseEntity<>(orderInfo,HttpStatus.OK);
		
	}
	 
	@PutMapping("/updateOrder")
	public ResponseEntity<?> updateOrder(@RequestBody OrderInfo orderInfo){
		orderInfo = orderServiceApi.updateOrder(orderInfo);
		return new ResponseEntity<>(orderInfo,HttpStatus.OK);
		
	}
	 
	
	 
}
