package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	// @RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = { "/ola", "/salve" })
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	@PostMapping(path = { "/salve" })
	public String salve() {
		return "Olá Spring Boot! (POST)";
	}	
}
