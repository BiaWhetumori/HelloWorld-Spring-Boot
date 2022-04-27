package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")
public class HelloWorldController {
	@GetMapping
	public String hello() { 
		return "Hello";
	}
@GetMapping("/BSM")
public String BSM() {
	return "Orientação ao futuro <br/>"
			+ "Responsabilidade pessoal <br/>"
			+ "Mentalidade de crecimentp <br/>"
			+ "Persistência<br/>"
			+ "Trabalho em equipe<br/>"
			+ "Atenção aos detalhes<br/>"
			+ "Proatividade<br/>"
			+ "Comunicação";
			
}
@GetMapping("/Objetivos") //página 
public String Objetivos() { //Método
	return "Persistência<br/>"
			+ "Proatividade<br/>"
			+ "Orientação ao futuro";
}
}
