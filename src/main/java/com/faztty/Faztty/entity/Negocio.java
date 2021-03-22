package com.faztty.Faztty.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@DiscriminatorValue("N")

public class Negocio extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, length = 30)
	private String RUC;

	@Column(unique = true, length = 30)
	private String razonsocial;
	
	@Column
	private Long puntuacion;
	
	@Column(length = 30)
	private String imagen;
	
	@Column(length = 100)
	private String direccion;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipoNegocio", referencedColumnName = "id")
    private TipoNegocio tipoNegocio;
	
}
