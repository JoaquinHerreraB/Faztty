package com.faztty.Faztty.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Producto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String nombre;
	
	@Column(length = 30)
	private String marca;
	
	@Column
	private Float precio;
	
	@Column
	private Long puntuacion;
	
	@Column(length = 30)
	private String imagen;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idNegocio", referencedColumnName = "id")
    private Negocio negocio;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategoria", referencedColumnName = "id")
    private Categoria categoria;
}
