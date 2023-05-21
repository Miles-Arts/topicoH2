package com.foro.burofy.topico.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Topico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	@Column
	private String mensaje;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topico other = (Topico) obj;
		return Objects.equals(id, other.id);
	}
	
	
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
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	
	
}
