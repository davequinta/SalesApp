package com.matias.domain;

public class Medida {
	private int id;
	private double largo;
	private double alto;
	private double ancho;
	private double area;
	public Medida(int id, double largo, double alto, double ancho, double area) {
		super();
		this.id = id;
		this.largo = largo;
		this.alto = alto;
		this.ancho = ancho;
		this.area = area;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	

}
