package br.com.rd.queroserdev.atividadejpa.dto;

import javax.validation.constraints.NotBlank;

import br.com.rd.queroserdev.atividadejpa.entities.Produto;

public class RequisicaoProduto {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String categoria;
	
	@NotBlank
	private String descricao;
	

	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
		pedido.setUrlProduto(urlProduto);
		pedido.setNomeProduto(nomeProduto);

		return pedido;
	}
	
	
	public Categoria tocategoria() {
		Categoria categoria = new Categoria();
		categoria.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);

		return pedido;
	}
	
	
}
