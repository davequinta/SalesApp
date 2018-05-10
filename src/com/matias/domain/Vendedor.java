package com.matias.domain;

public class Vendedor {
	private int id;
	private String nombre;
	private String apellido;
	private String user;
	private String clave;
	public Vendedor() {
		super();
	}
	public Vendedor(int id, String nombre, String apellido, String user, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.user = user;
		this.clave = clave;
	}
	public int getId( ) {
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
}
