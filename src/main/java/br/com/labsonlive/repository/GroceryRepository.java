package br.com.labsonlive.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.labsonlive.model.Groceries;

public interface GroceryRepository extends MongoRepository<Groceries, String> {

    @Query("{name:'?0'}")
    Groceries findItemByName(String name);

    @Query(value = "{category:'?0'}", fields = "{'name' : 1, 'quantity' : 1}")
    List<Groceries> findAll(String category);

    public long count();

}