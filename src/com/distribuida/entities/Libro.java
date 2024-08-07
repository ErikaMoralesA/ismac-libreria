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
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;
	@Column(name="titulo")
	private String titulo;
	@Column(name="editorial")
	private String editorial;
	@Column(name="num_paginas")
	private int num_paginas;
	@Column(name="edicion")
	private String edicion;
	@Column(name="idioma")
	private String idioma;
	@Column(name="fecha_publicacion")
	private Date fecha_Publicacion;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tipo_pasta")
	private String tipo_pasta;
	@Column(name="ISBN")
	private String ISBN;
	@Column(name="num_ejemplares")
	private int num_ejemplares;
	@Column(name="portada")
	private String portada;
	@Column(name="presentacion")
	private String presentacion;
	@Column(name="precio")
	private Double precio;
	
	@JoinColumn(name ="id_categoria")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Categoria categoria;
	
	@JoinColumn(name ="id_autor")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Autor autor; 
	
	public Libro () {}

	public Libro(int idLibro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_Publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, Double precio) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_paginas = num_paginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fecha_Publicacion = fecha_Publicacion;
		this.descripcion = descripcion;
		this.tipo_pasta = tipo_pasta;
		ISBN = iSBN;
		this.num_ejemplares = num_ejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		//this.categoria = categoria;
		//this.autor = autor;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNum_paginas() {
		return num_paginas;
	}

	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFecha_Publicacion() {
		return fecha_Publicacion;
	}

	public void setFecha_Publicacion(Date fecha_Publicacion) {
		this.fecha_Publicacion = fecha_Publicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo_pasta() {
		return tipo_pasta;
	}

	public void setTipo_pasta(String tipo_pasta) {
		this.tipo_pasta = tipo_pasta;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNum_ejemplares() {
		return num_ejemplares;
	}

	public void setNum_ejemplares(int num_ejemplares) {
		this.num_ejemplares = num_ejemplares;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_Publicacion="
				+ fecha_Publicacion + ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", ISBN=" + ISBN
				+ ", num_ejemplares=" + num_ejemplares + ", portada=" + portada + ", presentacion=" + presentacion
				+ ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
	}
	
	
	
}
