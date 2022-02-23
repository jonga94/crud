package com.jonathan.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.crud.dao.ArticuloDao;
import com.jonathan.crud.entity.Articulo;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	private ArticuloDao articuloDao;
	
	@GetMapping("/lista")
	public List<Articulo> findAll(){
		return articuloDao.findAll();
	}

}
