package com.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SedeContoller {

	@GetMapping("/npc")
	public String paginaSedes() {
		return "sedes";
	}
	
	@GetMapping("/otra")
	public String otraPagina() {
		return "otra";
	}
	
	@GetMapping("/ultima")
	public String ultimaPagina() {
		return "ultima";
	}
}
