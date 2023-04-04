package br.com.labsonlive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("groceryitems")
public class Groceries {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;

    public Groceries(String id, String name, int quantity, String category) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}