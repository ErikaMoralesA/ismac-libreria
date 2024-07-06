package com.distribuida.entities;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name= "factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="id_factura")
	private int idFactura;
	@Column(name="num_factura")
	private String numfactura;
	@Column(name="fecha")
	private Date  fecha;
	@Column(name="total_neto")
	private Double totalneto;
	@Column(name="iva")
	private Double iva;
	@Column(name="total")
	private Double total;
	//private int idCliente;
	
	//inyeccion de dependencia de cliente a factura
	
	@JoinColumn(name ="id_cliente")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	private Cliente cliente;
	
	public Factura () {}


	public Factura(int idFactura, String numfactura, Date fecha, Double totalneto, Double iva, Double total
			) {
		
		this.idFactura = idFactura;
		this.numfactura = numfactura;
		this.fecha = fecha;
		this.totalneto = totalneto;
		this.iva = iva;
		this.total = total;
		//this.idCliente = idCliente;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getNumfactura() {
		return numfactura;
	}


	public void setNumfactura(String numfactura) {
		this.numfactura = numfactura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Double getTotalneto() {
		return totalneto;
	}


	public void setTotalneto(Double totalneto) {
		this.totalneto = totalneto;
	}


	public Double getIva() {
		return iva;
	}


	public void setIva(Double iva) {
		this.iva = iva;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numfactura=" + numfactura + ", fecha=" + fecha + ", totalneto="
				+ totalneto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
	
	

}
