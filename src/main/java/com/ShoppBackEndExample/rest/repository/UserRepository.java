package com.ShoppBackEndExample.rest.repository;

import com.ShoppBackEndExample.rest.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
