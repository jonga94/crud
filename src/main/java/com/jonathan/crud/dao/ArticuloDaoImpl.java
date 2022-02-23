package com.jonathan.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jonathan.crud.entity.Articulo;

@Repository
public class ArticuloDaoImpl implements ArticuloDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Articulo> findAll() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Articulo> query = currentSession.createQuery("from Articulo", Articulo.class);
		List<Articulo> articulo = query.getResultList();
		return articulo;
	}
	
	
}
