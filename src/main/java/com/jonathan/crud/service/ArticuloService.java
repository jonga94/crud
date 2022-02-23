package com.jonathan.crud.service;

import java.util.List;

import com.jonathan.crud.entity.Articulo;

public interface ArticuloService {
	
	public List<Articulo> findAll();
	
	public void save(Articulo articulo);
	
	public void deleteById(int id);
	
	public void update(Articulo articulo);

}
