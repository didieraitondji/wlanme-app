package com.wlanme.wlanmeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoConfig {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void createCollectionIfNotExists() {
        if (!mongoTemplate.collectionExists("users")) {
            mongoTemplate.createCollection("users");
        }

        if (!mongoTemplate.collectionExists("discussions")) {
            mongoTemplate.createCollection("discussions");
        }

        if (!mongoTemplate.collectionExists("messages")) {
            mongoTemplate.createCollection("messages");
        }

        if (!mongoTemplate.collectionExists("contacts")) {
            mongoTemplate.createCollection("contacts");
        }
    }
}
