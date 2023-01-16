package com.Api.Messanger.MongoDB;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoDBConnector {
    MongoClient mongoClient = MongoClients.create();
}
