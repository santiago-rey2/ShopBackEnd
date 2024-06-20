package com.ShoppBackEndExample.rest.repository;

import com.ShoppBackEndExample.rest.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
