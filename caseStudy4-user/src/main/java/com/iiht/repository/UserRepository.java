package com.iiht.repository;

import org.springframework.data.repository.CrudRepository;

import com.iiht.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}