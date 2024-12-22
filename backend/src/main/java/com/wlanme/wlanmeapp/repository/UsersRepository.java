package com.wlanme.wlanmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wlanme.wlanmeapp.models.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

}
