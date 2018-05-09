package com.matias.domain;

public class Producto {
	private int id;
	private String nombre;
	private String desc;
	private double precio_unitario;
	private Medida medida;
	public Producto(int id, String nombre, String desc, double precio_unitario, Medida medida) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.desc = desc;
		this.precio_unitario = precio_unitario;
		this.medida = medida;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public Medida getMedida() {
		return medida;
	}
	public void setMedida(Medida medida) {
		this.medida = medida;
	}
	
	
	
}
