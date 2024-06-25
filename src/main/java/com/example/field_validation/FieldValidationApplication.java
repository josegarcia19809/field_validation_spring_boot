package com.example.field_validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FieldValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FieldValidationApplication.class, args);
		System.out.println("Servidor ejecutándose en el puerto 8080...");
	}

}
