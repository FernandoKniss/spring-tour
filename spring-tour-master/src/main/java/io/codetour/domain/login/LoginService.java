package io.codetour.domain.login;

import java.io.PrintWriter;

import ch.qos.logback.core.net.SyslogOutputStream;

public class LoginService {

	private LoginRepository loginRepository;
	
	public LoginService (LoginRepository loginRepository) {
		this.loginRepository = loginRepository;	
	}
	
	public void validarLogin (Login login) {
		if(login.toString().equals("")) {
			System.out.println("Seja Bem vindo!!!");
		} else {
		System.out.println("Login ou senha incorreta!");
		}
	}
	
}
