package com.wlanme.wlanmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wlanme.wlanmeapp.models.Discussions;

public interface DiscussionsRepository extends MongoRepository<Discussions, String> {

}
