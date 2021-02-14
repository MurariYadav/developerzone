package com.app.mk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.mk.entity.OrderEntity;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

}
