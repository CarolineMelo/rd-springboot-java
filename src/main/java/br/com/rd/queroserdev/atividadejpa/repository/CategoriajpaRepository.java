package br.com.rd.queroserdev.atividadejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.atividadejpa.entities.Categoria;
@Repository
public interface CategoriajpaRepository extends JpaRepository<Categoria, Long>{

}
