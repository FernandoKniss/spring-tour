package io.codetour.domain.professor;

import org.springframework.data.repository.CrudRepository;


public interface ProfessorRepository extends CrudRepository<Professor, Long> {
	public Professor findByNome(String nome);
}
