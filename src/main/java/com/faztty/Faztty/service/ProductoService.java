package com.faztty.Faztty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository repoProducto;
	
	public Iterable<Producto> getNegocios(){
		return repoProducto.findAllByOrderByPuntuacionAsc();
	}
}
