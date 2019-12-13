package accesodatos;

import java.util.TreeMap;

import entidades.Persona;

public class PersonaMemoria implements Crudable<Persona> {

	private TreeMap<Long, Persona> personas = new TreeMap<>();

	// SINGLETON
	// Limita la creación de objetos de la misma clase y esta contenga una sola
	// instancia.

	private PersonaMemoria() {
		personas.put(1L, new Persona(1L, "Rodrigo", "Soto"));
		personas.put(2L, new Persona(2L, "Juana", "de Arco"));
		personas.put(3L, new Persona(3L, "Cara", "Portazo"));
	}

	private final static PersonaMemoria INSTANCIA = new PersonaMemoria();

	public static PersonaMemoria getInstancia() {
		return INSTANCIA;
	}

	// FIN SINGLETON.-

	@Override
	public Iterable<Persona> getAll() {
		return personas.values();
	}

	@Override
	public Persona getById(Long id) {
		return personas.get(id);
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
