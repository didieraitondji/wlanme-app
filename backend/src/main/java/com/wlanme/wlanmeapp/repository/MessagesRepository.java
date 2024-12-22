package com.wlanme.wlanmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wlanme.wlanmeapp.models.Messages;

public interface MessagesRepository extends MongoRepository<Messages, String> {

}
