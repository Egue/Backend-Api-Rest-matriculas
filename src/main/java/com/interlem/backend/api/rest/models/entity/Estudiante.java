package com.interlem.backend.api.rest.models.entity;

import java.io.Serializable;//importamos la libreria Serializable

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity //para JPA pueda identificarla y administrarla
@Table(name="estudiantes") //esta anotación se utiliza para indicar 
//la tabla contra la que mapea la entidad

public class Estudiante implements Serializable{


	@Id //identificamos llave primaria de la base de datos
	@GeneratedValue(strategy = GenerationType.IDENTITY)//para mysql donde la llava es autoincrementable
	@Column(name="id_estudiantes")//se usa para mapear la variable id, con la de nuestra base de datos id_estudiantes
	private Long id;//Long almacena valores numericos 0x8000000000000000L
	
	@Column(name="nombres")//mapeo de nombres de la base de datos
	private String nombre; // String almacena texto 
	
	@Column(name="apellidos")//mapeo de apellidos de la base de datos
	private String apellido;
	
	private String documento;
	private String celular;
	
	@Column(name="tipodocumento_id_tipodocumento")//mape de tipo_documento de la base de datos
	private Long tipoDocumento;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public Long getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(Long tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	private static final long serialVersionUID = 1L;//agregamos la variable estatica de serializable

}
