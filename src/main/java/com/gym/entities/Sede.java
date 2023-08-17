package com.gym.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sedes")
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idSede")
	private int idSede;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	public Sede() {
	}
	public Sede(String nombre, String direccion, String email) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
	}
	
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Sede [idSede=" + idSede + ", nombre=" + nombre + ", direccion=" + direccion + ", phone=" + phone
				+ ", email=" + email + "]";
	}
}
