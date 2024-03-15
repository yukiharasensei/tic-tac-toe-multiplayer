package config;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBConnection() {
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("tictactoe");
    }

    public MongoDatabase getDatabase() {
        return database;
    }
    
}
