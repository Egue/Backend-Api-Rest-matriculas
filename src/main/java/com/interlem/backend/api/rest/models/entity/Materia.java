package com.interlem.backend.api.rest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materias")
public class Materia implements Serializable{
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_materia")
	private Long id;
	
	@Column(name="nombre")
	private String nombreMateria;
	
	private String profesor;
	
	private String horario;//joranda Diurna o Nocturna
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreMateria() {
		return nombreMateria;
	}


	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}


	public String getProfesor() {
		return profesor;
	}


	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	private static final long serialVersionUID = 1L;

}
