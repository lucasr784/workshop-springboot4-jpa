package com.springproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.entities.OrderItem;
import com.springproject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
