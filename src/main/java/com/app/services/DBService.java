package com.app.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.Categoria;
import com.app.repositories.CategoriaRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void instantiateTestDataBase() {
		
		Categoria cat1 = new Categoria();
		cat1.setNome("Pizza");
		Categoria cat2 = new Categoria();
		cat2.setNome("Lanches");
		Categoria cat3 = new Categoria();
		cat3.setNome("Salgados");
		Categoria cat4 = new Categoria();
		cat4.setNome("Sucos");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
	}

}
