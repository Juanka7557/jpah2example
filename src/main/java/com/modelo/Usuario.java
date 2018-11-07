package com.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Usuarios
 *
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long usu_codigo;

	// @Size(min = 1, max = 50, message = "Debe tener entre 1 y 50 caracteres el
	// Nombre")
	@Column(length = 50, nullable = false)
	private String usu_nombre;

	// @Size(min = 1, max = 50, message = "Debe tener entre 1 y 50 caracteres el
	// Apellido")
	@Column(length = 50, nullable = false)
	private String usu_apellido;

	@Column(length = 30, nullable = false)
	private String usu_nomAcceso;

	@Column(length = 16, nullable = false)
	private String usu_contrasenia;

	// @Email(message = "Ingrese una dirección de email valida")
	@Column(length = 40, nullable = false)
	private String usu_correo;

	@Column(length = 1, nullable = false)
	private Long usu_perf_codigo;

	public Usuario() {
	}

	public Usuario(Long usu_codigo, String usu_nombre, String usu_apellido, String usu_nomAcceso,
			String usu_contrasenia, String usu_correo, Long usu_perf_codigo) {
		super();
		this.usu_codigo = usu_codigo;
		this.usu_nombre = usu_nombre;
		this.usu_apellido = usu_apellido;
		this.usu_nomAcceso = usu_nomAcceso;
		this.usu_contrasenia = usu_contrasenia;
		this.usu_correo = usu_correo;
		this.usu_perf_codigo = usu_perf_codigo;
	}

	public Long getUsu_codigo() {
		return usu_codigo;
	}

	public void setUsu_codigo(Long usu_codigo) {
		this.usu_codigo = usu_codigo;
	}

	public String getUsu_nombre() {
		return usu_nombre;
	}

	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}

	public String getUsu_apellido() {
		return usu_apellido;
	}

	public void setUsu_apellido(String usu_apellido) {
		this.usu_apellido = usu_apellido;
	}

	public String getUsu_nomAcceso() {
		return usu_nomAcceso;
	}

	public void setUsu_nomAcceso(String usu_nomAcceso) {
		this.usu_nomAcceso = usu_nomAcceso;
	}

	public String getUsu_contrasenia() {
		return usu_contrasenia;
	}

	public void setUsu_contrasenia(String usu_contrasenia) {
		this.usu_contrasenia = usu_contrasenia;
	}

	public String getUsu_correo() {
		return usu_correo;
	}

	public void setUsu_correo(String usu_correo) {
		this.usu_correo = usu_correo;
	}

	public Long getUsu_perf_codigo() {
		return usu_perf_codigo;
	}

	public void setUsu_perf_codigo(Long usu_perf_codigo) {
		this.usu_perf_codigo = usu_perf_codigo;
	}

	public static Long getSerialversionuid() {
		return serialVersionUID;
	}

}
