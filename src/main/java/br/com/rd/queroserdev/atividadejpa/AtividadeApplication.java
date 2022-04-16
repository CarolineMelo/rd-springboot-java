package br.com.rd.queroserdev.atividadejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ComponentScan({"br.com.queroserdev.atividadejpa"})
//@EnableJpaRepositories("br.com.queroserdev.atividadejpa")
//@EntityScan("br.com.queroserdev.atividadejpa")
@SpringBootApplication
public class AtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

}
