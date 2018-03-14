package aula.topicos2.p01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P01Application {

	public static void main(String[] args) {
		System.out.println("Meu primeiro Projeto com Spring Boot ...");
		SpringApplication.run(P01Application.class, args);
	}
}
