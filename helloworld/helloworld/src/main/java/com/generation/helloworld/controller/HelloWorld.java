package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "Habilidades: Trabalho em equipe, atenção aos detalhes, proatividade e comunicação. Mentalidades: Orientação ao futuro, responsabilidade pessoal, mentalidade de crescimento e persistência.";
	}
}
