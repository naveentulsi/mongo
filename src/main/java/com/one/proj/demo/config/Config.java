package com.one.proj.demo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public MongoClient mongoClient(){
		return MongoClients.create("mongodb://localhost:27017");
	}
}
