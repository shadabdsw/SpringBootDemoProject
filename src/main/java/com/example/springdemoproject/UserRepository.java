package com.example.springdemoproject;

import com.example.springdemoproject.user.users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<users, String> {
    
}
