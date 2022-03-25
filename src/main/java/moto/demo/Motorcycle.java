package moto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class Motorcycle {

	public static void main(String[] args) {
		SpringApplication.run(Motorcycle.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World";
	}

}