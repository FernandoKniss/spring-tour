package io.codetour.domain.login;

import org.springframework.data.repository.CrudRepository;


public interface LoginRepository extends CrudRepository<Login, Long> {
	public Login findByLogin (String login);

}