package com.ShoppBackEndExample.rest.repository;

import com.ShoppBackEndExample.rest.entities.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem,Long> {
}
