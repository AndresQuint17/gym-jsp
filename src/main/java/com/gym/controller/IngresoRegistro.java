package com.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class IngresoRegistro {
	@GetMapping("registroUsuario")
	public String hacerRegistro(){
		return "RegistroView";
	}
}
