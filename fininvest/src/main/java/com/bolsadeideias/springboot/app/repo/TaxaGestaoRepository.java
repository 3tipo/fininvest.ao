package com.bolsadeideias.springboot.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideias.springboot.app.modell.TaxaGestao;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public interface TaxaGestaoRepository extends CrudRepository<TaxaGestao, Integer>{
			
	Optional<TaxaGestao> findByEscalao(String escalao);
}
