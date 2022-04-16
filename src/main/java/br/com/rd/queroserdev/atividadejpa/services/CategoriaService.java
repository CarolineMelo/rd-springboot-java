package br.com.rd.queroserdev.atividadejpa.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.atividadejpa.entities.Categoria;
import br.com.rd.queroserdev.atividadejpa.repository.CategoriajpaRepository;



@Service
public class CategoriaService {
	
	private final  CategoriajpaRepository repository;
	
	
	public CategoriaService(CategoriajpaRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Categoria> findAll() {
		return repository.findAll();
	}

	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.get();

	}

}
