package com.ShoppBackEndExample.rest.repository;

import com.ShoppBackEndExample.rest.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {
}
