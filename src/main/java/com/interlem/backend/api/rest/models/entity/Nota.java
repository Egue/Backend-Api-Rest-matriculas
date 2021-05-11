package com.interlem.backend.api.rest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notas")
public class Nota implements Serializable{
	
	@Id
	@Column(name="id_nota")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name="valor_nota")
	private Double nota;
	
	@Column(name="estudiantes_materias_id_estudiantes_materias")
	private Long idEstudianteMateria;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Double getNota() {
		return nota;
	}



	public void setNota(Double nota) {
		this.nota = nota;
	}



	public Long getIdEstudianteMateria() {
		return idEstudianteMateria;
	}



	public void setIdEstudianteMateria(Long idEstudianteMateria) {
		this.idEstudianteMateria = idEstudianteMateria;
	}



	private static final long serialVersionUID = 1L;

}
