package com.faztty.Faztty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.faztty.Faztty.entity.Negocio;
import com.faztty.Faztty.entity.TipoNegocio;
import com.faztty.Faztty.service.NegocioService;
import com.faztty.Faztty.service.TipoNegocioService;

@Controller
public class NegocioController {
	
	@Autowired
	TipoNegocioService tnService;
	
	@Autowired
	NegocioService nService;
	
	@GetMapping({"/principal/{id}"})
	public String login(@PathVariable Long id,Model model) {
		
		for(TipoNegocio tn:tnService.getTipoNegocios()) {
			
			System.out.println("--"+tn.getNombre());
		}
		
		for(Negocio n:nService.getNegociosByTipo(id)) {
			System.out.println(n.getNombre());
		}
		model.addAttribute("tipoList", tnService.getTipoNegocios());
		model.addAttribute("negocioList", nService.getNegociosByTipo(1L));
		return "v_principal";
	}
	


}
