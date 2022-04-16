package br.com.rd.queroserdev.atividadejpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.atividadejpa.entities.Produto;
import br.com.rd.queroserdev.atividadejpa.repository.CategoriajpaRepository;
import br.com.rd.queroserdev.atividadejpa.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired(required = true)
	private ProdutoRepository repository;
	
	@Autowired
	private CategoriajpaRepository categoriajpaRepository;
	
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.get();
	}
	
	public void save (Produto produto) {
		produto.setCategorias(categoriajpaRepository.getById(1L));
		repository.save(produto);
	}
	

}
