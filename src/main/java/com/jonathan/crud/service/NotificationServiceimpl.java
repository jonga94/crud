package com.jonathan.crud.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.jonathan.crud.entity.Articulo;

@Service
public class NotificationServiceimpl{
	
	@Async
	public void addNotificacion(Articulo articulo) {
		System.out.println("Add "+articulo);
	}

	@Async
	public void updateNotificacion(Articulo articulo) {
		System.out.println("update "+articulo);
		
	}

	@Async
	public void deleteNotificacion(Articulo articulo) {
		System.out.println("delete "+articulo);
		
	}

}
