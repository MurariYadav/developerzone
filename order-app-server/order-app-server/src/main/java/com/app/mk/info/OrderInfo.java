package com.app.mk.info;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderInfo {
	
	 
	private Integer orderId;
	
	 
	private String orderName;
	
	private Date orderedDate;
	
	private Date modifiedDate;
	
	private String orderStatus;
	
	
	

}
