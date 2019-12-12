package com.ipartek.formacion.ejemploaccesodatos.presentacionconsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ipartek.formacion.ejemploaccesodatos.accesodatos.Crudable;
import com.ipartek.formacion.ejemploaccesodatos.accesodatos.PersonaMemoria;
import com.ipartek.formacion.ejemploaccesodatos.entidades.Persona;

public class PresentacionConsola {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//DAO: Data Access Object
		Crudable<Persona> dao = PersonaMemoria.getInstancia();
		
		dao.insert(new Persona(3L, "Nuevo", "Nuevez"));
		dao.update(new Persona(1L,"Rodrigo","Soto"));
		dao.delete(new Persona(3L,"Nuevo","Nuevez"));
		dao.delete(3L);
		
		for(Persona persona: dao.getAll()) {
			System.out.println(persona);
			}
		
		// TODO Menú con opciones numéricas (1. Listado, 2. Crear ... 0. Salir)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		String nombre, apellido;
		Long id;

		System.out.println("******************");
		System.out.println("      MENÚ");
		System.out.println("******************");
		System.out.println("1.- Listar BBDD");
		System.out.println("2.- Crear Nuevo");
		System.out.println("3.- Actualizar");
		System.out.println("4.- Borrar");
		System.out.println("5.- Borrar por Id");
		System.out.println("0.- Salir.");

		if (opcion >= 0 && opcion <= 5) {

			switch (opcion) {
			case 1:
				for(Persona persona: dao.getAll()) {
					System.out.println(persona);
					}
				break;
			case 2:
				System.out.print("Nuevo Id: ");
				id = Long.parseLong(br.readLine());
				System.out.print("Nombre: ");
				nombre = br.readLine();
				System.out.print("Apellido: ");
				apellido = br.readLine();
				
				CrearNuevo(id,nombre,apellido, dao);

			default: 
				break;
			}
		}
		// TODO Exportación/Importación Excel
		// TODO Guardar/Cargar
	}

	private static void CrearNuevo(Long id, String nombre, String apellido, Crudable<Persona> dao) {
		
		dao.insert(new Persona(id, nombre, apellido));
		
	}

	
		
	

}
