package com.faztty.Faztty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faztty.Faztty.entity.Categoria;
import com.faztty.Faztty.entity.Negocio;
import com.faztty.Faztty.entity.Producto;
import com.faztty.Faztty.repository.CategoriaRepository;
import com.faztty.Faztty.repository.NegocioRepository;
import com.faztty.Faztty.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository repoProducto;
	
	@Autowired
	CategoriaRepository repoCategoria;

	@Autowired
	NegocioRepository repoNegocio;

	public Iterable<Producto> getProductosByCategoriaNegocio(Long idCategoria, Long idNegocio){
		Categoria c=repoCategoria.findById(idCategoria).get();
		Negocio n=repoNegocio.findById(idNegocio).get();
		return repoProducto.findAllByCategoriaAndNegocioOrderByPuntuacionAsc(c,n);
	}

	public Iterable<Producto> getProductosByNegocio(Long idNegocio){
		
		Negocio n=repoNegocio.findById(idNegocio).get();
		return repoProducto.findAllByNegocioOrderByPuntuacionAsc(n);
	}
}
