package com.istikis.modelos;

import java.util.Date;


public class Student {

	private Long id;
	private String nombre;
	private String apellidos;
	private String sexo;
	private Date fechaNacimiento;

	private boolean correcto = true;
	private String errorNombre, errorApellidos;

	public Student() {
	}

	public Student(Long id, String nombre, String apellidos, String sexo, Date fechaNacimiento) {
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos);
		setSexo(sexo);
		setFechaNacimiento(fechaNacimiento);
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
		// si nombre es null o tiene mas de un caracter en blanco
		// y su longitud sea inferior a 3 caracteres entonces...

		if (nombre == null || nombre.trim().length() < 3) {
			// si da error salta el mensaje y en método cambia correcto a false
			setErrorNombre("Se necesitan como mínimo 3 caracteres");
		}
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		
		if (nombre == null || nombre.trim().length() < 3) {
			setErrorNombre("Se necesitan como mínimo 3 caracteres");
		}
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		//TODO validar si se seleccionado alguno!?
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		if(fechaNacimiento != null && fechaNacimiento.after(new Date())) {
			throw new RuntimeException("No puedes usar una fecha futura para la fecha de nacimiento");
		}
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

	public String getErrorNombre() {
		return errorNombre;
	}

	public void setErrorNombre(String errorNombre) {
		// al dar error correcto pasa a ser false
		correcto =false;
		this.errorNombre = errorNombre;
	}

	public String getErrorApellidos() {
		return errorApellidos;
	}

	public void setErrorApellidos(String errorApellidos) {
		this.errorApellidos = errorApellidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
