package com.hunghoang.catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogServiceApplication {

    public static void main(String[] args) {
        System.out.println("Catalog Service is starting...");
        SpringApplication.run(CatalogServiceApplication.class, args);
    }
}
