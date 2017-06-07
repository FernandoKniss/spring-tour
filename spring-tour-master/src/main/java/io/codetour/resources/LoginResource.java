package io.codetour.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.codetour.domain.login.Login;
import io.codetour.domain.login.LoginRepository;

@RestController
@RequestMapping("/login")
public class LoginResource {
	
	private LoginRepository loginRepository;
	
	public LoginResource (LoginRepository loginRepository){
		this.loginRepository = loginRepository;
	}
	
	@GetMapping
	public Iterable<Login> getAllLogin() {
		return loginRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Login getByLogin(@PathVariable Long id) {
		return loginRepository.findOne(id);
	}
	
	@PostMapping
	public Login saveLogin(@RequestBody Login login) {
		return loginRepository.save(login);
	}
	
	@PutMapping(value="/{id}")
	public Login updateLogin(@PathVariable Long id, @RequestBody Login login) {
		return loginRepository.save(login);
	}
	
	@DeleteMapping(value="/{id}")
	public void removeLogin(@PathVariable Long id) {
		loginRepository.delete(id);
	}

}
