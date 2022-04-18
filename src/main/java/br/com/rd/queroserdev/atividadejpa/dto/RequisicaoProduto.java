package br.com.rd.queroserdev.atividadejpa.dto;

import javax.validation.constraints.NotBlank;

import br.com.rd.queroserdev.atividadejpa.entities.Categoria;
import br.com.rd.queroserdev.atividadejpa.entities.Produto;

public class RequisicaoProduto {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String nomeCategoria;
	
	@NotBlank
	private String descricao;
	

	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getCategoria() {
		return nomeCategoria;
	}


	public void setCategoria(String categoria) {
		this.nomeCategoria = categoria;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Produto toproduto() {
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setNome(nomeProduto);

		return produto;
	}
	
	
	public Categoria tocategoria() {
		Categoria categoria = new Categoria();
		categoria.setNome(nomeCategoria);

		return categoria;
	}
	
	
}
