package com.ShoppBackEndExample.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartItem extends CrudRepository<ShoppingCartItem,Long> {
}
