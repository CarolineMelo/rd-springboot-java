package br.com.rd.queroserdev.atividadejpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.queroserdev.atividadejpa.entities.Produto;
import br.com.rd.queroserdev.atividadejpa.services.ProdutoService;



@Controller
@RequestMapping("produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
//	@GetMapping
//	public  ResponseEntity<List<Produto>> findAll() {
//		List<Produto> list = service.findAll();
//		return ResponseEntity.ok().body(list);
//	}
	

	@GetMapping("formulario")
	public String formulario(Produto produto) {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo( Produto produto, BindingResult result) {

		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
				
		service.save(produto);
		
		return "pedido/formulario";
		
	}
	
	@GetMapping("id")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
				
	}
}
