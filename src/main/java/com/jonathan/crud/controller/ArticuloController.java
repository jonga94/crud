package com.jonathan.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.crud.entity.Articulo;
import com.jonathan.crud.service.ArticuloService;
import com.jonathan.crud.service.NotificationServiceimpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	private ArticuloService articuloService;
	@Autowired
	private NotificationServiceimpl notificationService;
	
	@GetMapping("/lista")
	public List<Articulo> findAll(){
		return articuloService.findAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Articulo articulo) {	
		try {
			articuloService.save(articulo);
			notificationService.addNotificacion(articulo);
		} catch (Exception e) {
			throw new RuntimeException("Articulo no Guardado: " +e);
		}
		return "Articulo Guardado Correctamente";
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Articulo articulo) {
		try {
			articuloService.update(articulo);
			notificationService.updateNotificacion(articulo);
		} catch (Exception e) {
			throw new RuntimeException("Articulo no Actualizado: " +e);
		}
		return "Articulo Actualizado Correctamente";
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody Articulo articulo) {
		try {
			articuloService.deleteById(articulo.getIdarticulo());
			notificationService.deleteNotificacion(articulo);
		} catch (Exception e) {
			throw new RuntimeException("Articulo no Eliminado: " +e);
		}
		return "Articulo Elimando Correctamente";
	}

}
