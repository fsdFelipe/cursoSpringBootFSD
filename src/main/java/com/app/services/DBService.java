package com.app.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.Categoria;
import com.app.domain.Produto;
import com.app.repositories.CategoriaRepository;
import com.app.repositories.ProdutoRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void instantiateTestDataBase() {
		
		Categoria cat1 = new Categoria();
		cat1.setNome("Pizza");
		Categoria cat2 = new Categoria();
		cat2.setNome("Lanches");
		Categoria cat3 = new Categoria();
		cat3.setNome("Salgados");
		Categoria cat4 = new Categoria();
		cat4.setNome("Sucos");
		
		Produto prod1 = new Produto();
		prod1.setNome("XBurguer");
		prod1.setPreco(10.00);
		Produto prod2 = new Produto();
		prod2.setNome("XFrango");
		prod2.setPreco(15.00);
		Produto prod3= new Produto();
		prod3.setNome("coxinha");
		prod3.setPreco(3.70);
		Produto prod4 = new Produto();
		prod4.setNome("Laranja");
		prod4.setPreco(1.00);
		
		cat2.getProdutos().addAll(Arrays.asList(prod1,prod2));
		cat3.getProdutos().addAll(Arrays.asList(prod3));
		cat4.getProdutos().addAll(Arrays.asList(prod4));
		
		prod1.getCategorias().addAll(Arrays.asList(cat2));
		prod2.getCategorias().addAll(Arrays.asList(cat2));
		prod3.getCategorias().addAll(Arrays.asList(cat3));
		prod4.getCategorias().addAll(Arrays.asList(cat4));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3,prod4));
		
	}
	


}
