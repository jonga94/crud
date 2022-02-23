package com.jonathan.crud.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;


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
	public List<Articulo> findAll() {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query<Articulo> query = currentSession.createQuery("from Articulo", Articulo.class);
		List<Articulo> articulo = query.getResultList();
		return articulo;
	}

	@Override
	public void save(Articulo articulo) {
		Articulo obj = validacion(articulo);
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.save(obj);
	}

	@Override
	public void deleteById(int id) {
		Session currentSession =  entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("delete from Articulo where idarticulo=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Articulo articulo) {
		Articulo obj = validacion(articulo);
		Session currentSession =  entityManager.unwrap(Session.class);
		currentSession.update(obj);
	}
	
	public Articulo validacion(Articulo articulo) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Pieza");
		array.add("Kilogramo");
		array.add("Pulgada");
		array.add("Litro");
		
		if (!array.contains(articulo.getUnidad())) {
			throw new RuntimeException();
		}else if(articulo.getClave().length() < 3 && articulo.getClave().length() < 30) {
			throw new RuntimeException();
		}
		return articulo;
	}
	
	
	
}
