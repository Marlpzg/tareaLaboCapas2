package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(User usuario) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(User usuario) {
		
		if(usuario.getUser().equals("mario") && usuario.getPassword().equals("12345678"))
			return "MostrarMensajeV";
		return "MostrarMensajeF";
		
	}

}
