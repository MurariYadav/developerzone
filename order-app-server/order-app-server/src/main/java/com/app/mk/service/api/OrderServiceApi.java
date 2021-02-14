/**
 * 
 */
package com.app.mk.service.api;

import org.springframework.stereotype.Component;

import com.app.mk.info.OrderInfo;

/**
 * @author Murari
 *
 */
@Component
public interface OrderServiceApi {

	OrderInfo submitOrder(OrderInfo orderInfo);

	OrderInfo updateOrder(OrderInfo orderInfo);

}
