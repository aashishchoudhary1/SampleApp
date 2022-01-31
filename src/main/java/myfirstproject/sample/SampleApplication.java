package myfirstproject.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication

public class SampleApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		
		
		
		System.out.println("Inside main");
	}

	

	
	
	
	
	/*
	 * @Bean public CommandLineRunner demo(Myservice serv) { return (args) -> {
	 * serv.print(); }; }
	 */
}
