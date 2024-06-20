package com.ShoppBackEndExample.rest.repository;

import com.ShoppBackEndExample.rest.entities.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
}
