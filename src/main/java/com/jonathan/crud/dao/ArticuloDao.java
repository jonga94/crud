package com.jonathan.crud.dao;

import java.util.List;

import com.jonathan.crud.entity.Articulo;

public interface ArticuloDao {

	public List<Articulo> findAll();
	
	public void save(Articulo articulo);
	
	public void deleteById(int id);
	
	public void update(Articulo articulo);
	
}
