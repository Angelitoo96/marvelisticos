package com.angelfajardo.marvelisticos.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "películas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String titulo;
	private String imagen;
	private String fecha_de_estreno;
	private String sinopsis;
	private boolean estrenada;
	private String trailer;

	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, String imagen, String fecha_de_estreno, String sinopsis, boolean estrenada,
			String trailer) {
		super();
		Id = id;
		this.titulo = titulo;
		this.imagen = imagen;
		this.fecha_de_estreno = fecha_de_estreno;
		this.sinopsis = sinopsis;
		this.estrenada = estrenada;
		this.trailer = trailer;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getFecha_de_estreno() {
		return fecha_de_estreno;
	}

	public void setFecha_de_estreno(String fecha_de_estreno) {
		this.fecha_de_estreno = fecha_de_estreno;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public boolean isEstrenada() {
		return estrenada;
	}

	public void setEstrenada(boolean estrenada) {
		this.estrenada = estrenada;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	

}
