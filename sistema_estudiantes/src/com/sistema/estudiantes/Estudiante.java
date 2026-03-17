package com.sistema.estudiantes;

public class Estudiante {

	private int codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private String carrera;
	
	public Estudiante(int codigo, String nombre, String apellido, int edad, String carrera) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.carrera = carrera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Estudiante [Codigo=" + codigo + 
				", Nombre=" + nombre + 
				", Apellido=" + apellido + 
				", Edad=" + edad + 
				", Carrera=" + carrera + "]";
	}
	
	
}
