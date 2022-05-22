package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.Categoria;
import com.app.services.CategoriaService;

@RestController
@RequestMapping("/")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categorias")
	public String bemVindo() {
		return "Controlador REST OK !";
	}
	
	@GetMapping("/categorias/{id}")
	public ResponseEntity<?> buscar(@PathVariable Integer id){
		Categoria obj = categoriaService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
