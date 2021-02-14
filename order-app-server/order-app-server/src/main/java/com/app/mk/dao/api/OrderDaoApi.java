/**
 * 
 */
package com.app.mk.dao.api;

import org.springframework.stereotype.Service;

import com.app.mk.entity.OrderEntity;

/**
 * @author Murari
 *
 */

@Service
public interface OrderDaoApi {

	OrderEntity submitOrder(OrderEntity entity);

}
