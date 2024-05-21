package com.distribuida.entities;

public class FacturaDetalle {

	private int idFacturaDetale;
	private int cantidad;
	private Double subtotal;
	private Factura factura;
	private Libro libro;
	
	public FacturaDetalle () {}

	public FacturaDetalle(int idFacturaDetale, int cantidad, Double subtotal, Factura factura, Libro libro) {
		
		this.idFacturaDetale = idFacturaDetale;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}

	public int getIdFacturaDetale() {
		return idFacturaDetale;
	}

	public void setIdFacturaDetale(int idFacturaDetale) {
		this.idFacturaDetale = idFacturaDetale;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetale=" + idFacturaDetale + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + "]";
	}

	
	
	
}
