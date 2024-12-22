package com.wlanme.wlanmeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wlanme.wlanmeapp.models.Contacts;

public interface ContactsRepository extends MongoRepository<Contacts, String> {

}
