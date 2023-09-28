package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	private int idproducto;
	private String descripcion;
	private double preciounidad;
	private int stock;
	private char estado;
	public Producto() {
		super();
	}
	public Producto(int idproducto, String descripcion, double preciounidad, int stock, char estado) {
		super();
		this.idproducto = idproducto;
		this.descripcion = descripcion;
		this.preciounidad = preciounidad;
		this.stock = stock;
		this.estado = estado;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPreciounidad() {
		return preciounidad;
	}
	public void setPreciounidad(double preciounidad) {
		this.preciounidad = preciounidad;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
}
