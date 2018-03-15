package aula.topicos2.p01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class P01Application {


	public static void main(String[] args) {
		SpringApplication.run(P01Application.class, args);
		System.out.println("Iniciando a aplicação ...");
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner() {
	
		return (args) -> { 
			System.out.println("Testando 1 2 3 ..."); 
		};
		
	}
	
	
	
	
}
