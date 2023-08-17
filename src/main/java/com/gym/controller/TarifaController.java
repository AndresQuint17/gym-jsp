package com.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tarifas")
public class TarifaController {
	@GetMapping("/tipoTarifas")
	public String tarifas() {
		return "TarifasView";
	}
}
