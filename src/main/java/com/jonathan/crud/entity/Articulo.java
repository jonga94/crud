package com.jonathan.crud.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idarticulo")
	private int idarticulo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="unidad")
	private String unidad;
	@Column(name="clave")
	private String clave;
	@Column(name="precio")
	private float precio;
	
	public Articulo() {}
	
	public Articulo(String nombre, String unidad, String clave, float precio) {
		this.nombre = nombre;
		this.unidad = unidad;
		this.clave = clave;
		this.precio = precio;
	}

	public int getIdarticulo() {
		return idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [idarticulo=" + idarticulo + ", nombre=" + nombre + ", unidad=" + unidad + ", clave=" + clave
				+ ", precio=" + precio + "]";
	}
	
	
	

}
