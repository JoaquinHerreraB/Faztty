package com.faztty.Faztty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NegocioController {
	
	@GetMapping({"/principal"})
	public String login() {
		return "v_principal";
	}
	


}
