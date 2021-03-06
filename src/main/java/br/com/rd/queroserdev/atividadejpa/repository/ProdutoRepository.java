package br.com.rd.queroserdev.atividadejpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.atividadejpa.entities.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>,
										  CrudRepository<Produto, Long>{
	
	public List<Produto> findAll();
}
