package com.sistema.estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		GestorEstudiantes gestor = new GestorEstudiantes();
		
		do {
			System.out.println("\n===== SISTEMA DE ESTUDIANTES =====");
			System.out.println(); 
			System.out.println("1. REGISTRAR ESTUDIANTES");
			System.out.println("2. MOSTRAR TODOS LOS ESTUDIANTES");
			System.out.println("3. BUSCAR ESTUDIANTES POR CODIGO");
			System.out.println("4. ELIMINAR ESTUDIANTES");
			System.out.println("5. ===== SALIR =====");
			System.out.println("Ingrese una opción: ");
			
			if(sc.hasNextInt()) {
				opcion = sc.nextInt();
				sc.nextLine();
			}else {
				System.out.println("Entrada inválida. Por favor, ingrese un número.");
				sc.nextLine();
				opcion = 0;
			}
			
			switch(opcion) {

            case 1:
                // PIDE DATOS DEL ESTUDIANTE
                System.out.print("Código: ");
                int codigo = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                
                System.out.print("Apellido: ");
                String apellido = sc.nextLine();
                
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Carrera: ");
                String carrera = sc.nextLine();

                
                Estudiante estudiante = new Estudiante(codigo, nombre, apellido, edad, carrera);
				
             
                if(gestor.registrarAlumno(estudiante)) {
                    System.out.println("✅ Estudiante registrado exitosamente.");
                } else {
                    System.out.println("❌ Error: código duplicado o edad inválida.");
                }
                break;
                
				case 2:
					
					ArrayList<Estudiante> lista = gestor.listarAlumnos();
					if(lista.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        System.out.println("\n===== LISTA DE ESTUDIANTES =====");
                        for(Estudiante e : lista) {
                            System.out.println(e);
                        }
                    }
                    break;
					
				case 3:
					// PIDE EL CODIGO A BUSCAR
                    System.out.print("Ingrese el código del estudiante: ");
                    int codigoBuscar = sc.nextInt();
                    
                    Estudiante encontrado = gestor.buscarAlumno(codigoBuscar);
                    
                    if(encontrado != null) {
                        System.out.println("\n===== ESTUDIANTE ENCONTRADO =====");
                        System.out.println(encontrado.toString());
                    } else {
                        System.out.println("❌ Estudiante no encontrado.");
                    }
                    break;
					
				case 4:
					// PIDE EL CODIGO A ELIMINAR
                    System.out.print("Ingrese el código del estudiante a eliminar: ");
                    int codigoEliminar = sc.nextInt();
                    
                    Estudiante aEliminar = gestor.buscarAlumno(codigoEliminar);
                    
                    if(aEliminar != null) {
                        gestor.eliminarAlumno(codigoEliminar);
                        System.out.println("✅ Estudiante eliminado exitosamente.");
                    } else {
                        System.out.println("❌ Estudiante no encontrado.");
                    }
                    break;
					
				case 5:
					System.out.println("👋 Saliendo del sistema...");
					break;	
					
				default:
                    System.out.println("❌ Opción inválida. Intente de nuevo.");
			}
			
			
		} while (opcion != 5);
		
		
		sc.close();
	}

}
