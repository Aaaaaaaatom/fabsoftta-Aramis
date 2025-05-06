package br.univille.projfabsofttarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.univille.entity")

public class ProjfabsofttarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjfabsofttarefasApplication.class, args);
	}

}
