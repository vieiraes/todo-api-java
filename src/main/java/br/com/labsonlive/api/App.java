package br.com.labsonlive.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	GroceryRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

// [x] conexao com BD ok
// [x] criar model ok
// [x] criar repository ok
// TODO: refatorar o funcionamento pois depois que renomeei o Main para App.java
// ele parou de iniciar
// TODO: implementar as primeiras rotas