package br.com.labsonlive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("categories")
public class Categories {
    @Id
    public String categoryId;
    public String categoryName;
    public String createdAt;
    public String updatedAt;

    // CONSTRUCTOR
    Categories(String categoryId, String categoryName, String createdAt, String updatedAt) {
        super();
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
