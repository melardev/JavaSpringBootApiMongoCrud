package com.melardev.spring.mongo.config;

import com.mongodb.MongoClient;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

// @Configuration
// @EnableReactiveMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration {


    @Override
    protected String getDatabaseName() {
        return "crud_api_todo";
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient("mongodb://localhost");
    }
}
