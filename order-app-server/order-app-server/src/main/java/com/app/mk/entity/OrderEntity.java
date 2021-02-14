package com.app.mk.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_tab")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId")
	private Integer orderId;

	@Column(name = "orderName")
	private String orderName;

	@Column(name = "orderedDate")
	private Date orderedDate;

	 
	
	@Column(name = "orderStatus")
	private String orderStatus;

}
