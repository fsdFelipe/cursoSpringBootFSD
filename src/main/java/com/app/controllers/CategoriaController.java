package com.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CategoriaController {
	
	@GetMapping("/categorias")
	public String bemVindo() {
		return "Controlador REST OK !";
	}

}
