package com.ipartek.formacion.ejemploaccesodatos.accesodatos;

import java.util.TreeMap;

import com.ipartek.formacion.ejemploaccesodatos.entidades.Persona;

public class PersonaMemoria implements Crudable<Persona> {

	private TreeMap<Long, Persona> personas = new TreeMap<>();
	
	//SINGLETON
	
	private PersonaMemoria() {
		personas.put(1L, new Persona(1L, "Javier", "Lete"));
		personas.put(2L, new Persona(2L, "Pepe", "Pérez"));
	}
	
	private final static PersonaMemoria INSTANCIA = new PersonaMemoria();
	
	public static PersonaMemoria getInstancia() {
		return INSTANCIA;
	}
	
	//FIN SINGLETON
	
	@Override
	public Iterable<Persona> getAll() {
		return personas.values();
	}

	@Override
	public Persona getById(Long id) {
		//TODO Implementar getById
		throw new AccesoDatosException("No está implementado");
	}

	@Override
	public Persona insert(Persona persona) {
		personas.put(persona.getId(), persona);
		return persona;
	}

	@Override
	public Persona update(Persona persona) {
		personas.replace(persona.getId(), persona);
		return persona;
	}

	@Override
	public Persona delete(Persona persona) {
		personas.remove(persona.getId(), persona);
		return persona;
		
	}

	@Override
	public Persona delete(Long id) {
		personas.remove(id);
		return null;
		
	}

}
