package com.faztty.Faztty.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.faztty.Faztty.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
