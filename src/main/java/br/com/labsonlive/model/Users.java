package br.com.labsonlive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class Users {

    @Id
    private String userId;
    private String name;
    private Boolean isActive;
    private String createdAt;

    // CONSTRUCTOR
    Users(String name, Boolean isActive, String createdAt) {
        this.name = name;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

}