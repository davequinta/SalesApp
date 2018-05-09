package com.matias.domain;

public class Cliente {
	private int id;
	private String nom;
	private String ape;
	public Cliente(int id, String nom, String ape) {
		super();
		this.id = id;
		this.nom = nom;
		this.ape = ape;
	}
	public Cliente() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	
	
	
	
}
