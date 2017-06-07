package io.codetour.domain.coordenador;

import org.springframework.data.repository.CrudRepository;

public interface CoordenadorRepository extends CrudRepository<Coordenador, Long> {
	public Coordenador findByNome(String nome);
	
}
