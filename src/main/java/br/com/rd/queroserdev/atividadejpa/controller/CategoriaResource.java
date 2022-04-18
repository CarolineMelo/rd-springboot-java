package br.com.rd.queroserdev.atividadejpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.queroserdev.atividadejpa.entities.Categoria;
import br.com.rd.queroserdev.atividadejpa.entities.Produto;
import br.com.rd.queroserdev.atividadejpa.services.CategoriaService;

@Controller
@RequestMapping("categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
//	@GetMapping
//	public  ResponseEntity<List<Categoria>> findAll() {
//		List<Categoria> list = service.findAll();
//		return ResponseEntity.ok().body(list);
//	}

	

	@GetMapping("home")
	public String home(Categoria categoria) {
		return "pedido/home";
	}
	
	@PostMapping("novo")
	public String novo( Categoria categoria, BindingResult result) {

		if(result.hasErrors()) {
			return "/home";
		}
		
				
		service.save(categoria);
		
		return "/home";
		
	}
	
	@GetMapping("id")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
				
	}
}
