package com.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
	@GetMapping("/")
	public String principal() {
		return "principalView";
	}
	
	@GetMapping("/principal")
	public String principal2() {
		return "principalView";
	}
}
