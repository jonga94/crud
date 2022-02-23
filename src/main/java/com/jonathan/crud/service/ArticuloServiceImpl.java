package com.jonathan.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonathan.crud.dao.ArticuloDao;
import com.jonathan.crud.entity.Articulo;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	private ArticuloDao articuloDao;
	
	@Override
	@Transactional
	public List<Articulo> findAll() {
		return articuloDao.findAll();
	}

	@Override
	@Transactional
	public void save(Articulo articulo) {
		articuloDao.save(articulo);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		articuloDao.deleteById(id);
	}

	@Override
	@Transactional
	public void update(Articulo articulo) {
		articuloDao.update(articulo);
	}

}
