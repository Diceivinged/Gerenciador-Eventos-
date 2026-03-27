package com.example.demo;

import com.example.demo.model.Evento;
import com.example.demo.Repository.EventoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(EventoRepository repository) {
		return args -> {
			// Criando um evento de teste
			Evento e1 = new Evento(
					"Workshop de Java Spring Boot",
					"Rua da Tecnologia, 123",
					"Educação",
					LocalDateTime.now().plusDays(5),
					"Aprenda a criar APIs do zero!"
			);

			// Salvando no banco de dados (H2)
			repository.save(e1);

			System.out.println("--------------------------------------");
			System.out.println("SISTEMA PRONTO: Evento de teste criado!");
			System.out.println("--------------------------------------");
		};
	}
}