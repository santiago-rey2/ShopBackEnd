package com.ShoppBackEndExample.rest.repository;

import com.ShoppBackEndExample.rest.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
