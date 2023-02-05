package com.example.demoporject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoporject.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
