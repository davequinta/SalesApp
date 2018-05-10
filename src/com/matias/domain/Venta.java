package com.matias.domain;

public class Venta {
	private int id;
	private String date;
	private Cliente cliente;
	private Vendedor vendedor;
	private double total;
	public Venta(int id, String date, Cliente cliente, Vendedor vendedor, double total) {
		super();
		this.id = id;
		this.date = date;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	
	

}
