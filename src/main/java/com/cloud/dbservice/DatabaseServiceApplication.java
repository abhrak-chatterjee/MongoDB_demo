package com.cloud.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages="com.cloud.dbservice.resource")
@SpringBootApplication
public class DatabaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServiceApplication.class, args);
	}
}
