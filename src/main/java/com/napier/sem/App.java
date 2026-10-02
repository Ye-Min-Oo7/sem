package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        // Connect to MongoDB container running on local port 27000
        MongoClient mongoClient = new MongoClient("localhost", 27000);

        // Get or create database
        MongoDatabase database = mongoClient.getDatabase("mydb");

        // Get or create collection
        MongoCollection<Document> collection = database.getCollection("test");

        // Create document
        Document doc = new Document("name", "Kevin Sim")
                .append("class", "DevOps")
                .append("year", "2024")
                .append("result", new Document("CW", 95).append("EX", 85));

        // Insert document
        collection.insertOne(doc);

        // Retrieve and print document
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}