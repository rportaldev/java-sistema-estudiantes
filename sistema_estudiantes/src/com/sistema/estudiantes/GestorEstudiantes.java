package com.sistema.estudiantes;

import java.util.ArrayList;



public class GestorEstudiantes {

	private ArrayList<Estudiante> estudiantes = new ArrayList<>();
	
	//REGISTRAR UN ESTUDIANTE
	public boolean registrarAlumno(Estudiante estudiante) {
		
		for(Estudiante e : estudiantes) {
			
			if(e.getCodigo() == estudiante.getCodigo()) {
				return false;
			}
		}
		
		if(estudiante.getEdad() <= 0) {
			return false;
		}
		
		estudiantes.add(estudiante);
		
		return true;
	}
	
	
	//LISTAR ESTUDIANTES
	public ArrayList<Estudiante> listarAlumnos() {
		
		return estudiantes;
	}
	
	
	//BUSCAR ESTUDIANTE
	public Estudiante buscarAlumno(int codigo) {
		
		for(Estudiante e : estudiantes ) {
			
			if(e.getCodigo() == codigo) {
				 return e;
			}
		}
		
		return null;
	}
	
	
	//ELIMINAR UN ESTUDIANTE
	public void eliminarAlumno(int codigo) {
		
		for(Estudiante e : estudiantes ) {
			
			if(e.getCodigo() == codigo) {
				estudiantes.remove(e);
			}
		}
	}
}
