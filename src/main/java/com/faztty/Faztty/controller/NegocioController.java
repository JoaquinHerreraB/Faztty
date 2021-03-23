package com.faztty.Faztty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.faztty.Faztty.entity.Negocio;
import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.entity.TipoNegocio;
import com.faztty.Faztty.service.NegocioService;
import com.faztty.Faztty.service.ProductoService;
import com.faztty.Faztty.service.TipoNegocioService;

@Controller
public class NegocioController {
	
	@Autowired
	TipoNegocioService tnService;
	
	@Autowired
	NegocioService nService;
	
	@Autowired
	ProductoService pService;
	
	@GetMapping({"/principal/{id}"})
	public String login(@PathVariable Long id,Model model) {
		
		for(TipoNegocio tn:tnService.getTipoNegocios()) {
			
			System.out.println("--"+tn.getNombre());
		}
		
		for(Negocio n:nService.getNegociosByTipo(id)) {
			System.out.println(n.getNombre());
		}
		model.addAttribute("tipoList", tnService.getTipoNegocios());
		model.addAttribute("tipoNegocio", tnService.getTipoNegocio(id));
		model.addAttribute("negocioList", nService.getNegociosByTipo(id));
		return "v_principal";
	}

	@GetMapping({"/tienda/{id1}"})
	public String tienda(@PathVariable Long id1,Model model) {

		for(Producto p:pService.getProductosByNegocio(id1)) {
			System.out.println(p.getNombre());
		}
		model.addAttribute("negocio", nService.getNegocio(id1));
		model.addAttribute("productoList",pService.getProductosByNegocio(id1)) ;
		return "producto_cliente";
	}
	@GetMapping({"/mitienda/"})
	public String mitienda(@PathVariable Long id1,Model model) {

		model.addAttribute("negocio", nService.getNegocio(3L));
		model.addAttribute("productoList",pService.getProductosByNegocio(3L)) ;
		return "producto_cliente";
	}

}
