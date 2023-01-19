package com.Api.Messanger.repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoDBConnector {
    MongoClient mongoClient = MongoClients.create();
}
