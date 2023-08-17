package com.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("clases")
public class ClasesController {
	@GetMapping("/horarios")
	public String horarios() {
		return "ClasesView";
	}
}
