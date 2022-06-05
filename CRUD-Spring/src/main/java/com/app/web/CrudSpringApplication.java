package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
	
		/*
		Estudiante estudiante1 = new Estudiante("Juan", "Romero", "sebastiandias@gmail.com");
		repositorio.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Sebastian", "Diaz", "sebastian@gmail.com");
		repositorio.save(estudiante2);
		*/
	}

}
