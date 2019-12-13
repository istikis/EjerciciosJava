package presentacion;

import java.io.*;
import java.util.*;
import accesodatos.Crudable;
import accesodatos.PersonaMemoria;
import entidades.Persona;

public class PresentacionConsola {

	public static void main(String[] args) throws NumberFormatException, IOException, Exception {

		// DAO: Data Access Object
		Crudable<Persona> dao = PersonaMemoria.getInstancia();

		final String FICHERO = "C:\\datos\\personasDao.per";
		final String FICHERO_TXT = "C:\\datos\\fichero.txt";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion;
		Long id;
		String nombre, apellido;

		do {
			MenuInicio();
			opcion = Integer.parseInt(br.readLine());

			if (opcion >= 0 && opcion <= 7) {

				switch (opcion) {
				case 1:
					for (Persona persona : dao.getAll()) {
						System.out.println(persona);
					}
					break;
				case 2:
					System.out.println("Crear Nuevo");
					System.out.print("Nuevo Id: ");
					id = Long.parseLong(br.readLine());
					System.out.print("Nombre: ");
					nombre = br.readLine();
					System.out.print("Apellido: ");
					apellido = br.readLine();
					CrearNuevo(id, nombre, apellido, dao);
					break;
				case 3:
					System.out.println("Actualizar");
					System.out.print("Id: ");
					id = Long.parseLong(br.readLine());
					System.out.print("Nombre: ");
					nombre = br.readLine();
					System.out.print("Apellido: ");
					apellido = br.readLine();
					Actualizar(id, nombre, apellido, dao);
					break;
				case 4:
					System.out.println("Borrar");
					System.out.print("Id: ");
					id = Long.parseLong(br.readLine());
					System.out.print("Nombre: ");
					nombre = br.readLine();
					System.out.print("Apellido: ");
					apellido = br.readLine();
					Borrar(id, nombre, apellido, dao);
					break;
				case 5:
					System.out.println("Introduce el Id de la persona a borrar: ");
					id = Long.parseLong(br.readLine());
					BorrarPorId(id, dao);
					break;
				case 6 :
					// TODO Exportación/Importación Excel
					
					break;
				case 7:
					GuardarCargar(FICHERO, dao);
					break;
				}

			} else {
				System.out.println("Valor introducido incorrecto, vuelve a intentarlo");
			}
		} while (opcion != 0);

		System.out.println("Vuelve pronto, Agur!");
	}

	private static void GuardarCargar(String FICHERO, Crudable<Persona> dao) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream(FICHERO);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ArrayList<Persona> arrOut = new ArrayList<>();
		
		for(Persona p : dao.getAll()) {
			
			arrOut.add(p);
			System.out.println(p);
		}
		
		oos.writeObject(arrOut);
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(FICHERO);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		@SuppressWarnings("unchecked")
		ArrayList<Persona> leido = (ArrayList<Persona>) ois.readObject();
		
		
		for(Persona p: leido) {
			System.out.println(p);
		}
		
		System.out.println(leido);
		
		ois.close();
		fis.close();
		
	}

	private static void MenuInicio() {
		System.out.println("******************");
		System.out.println("      MENÚ");
		System.out.println("******************");
		System.out.println("1.- Listar BBDD");
		System.out.println("2.- Crear Nuevo");
		System.out.println("3.- Actualizar");
		System.out.println("4.- Borrar");
		System.out.println("5.- Borrar por Id");
		System.out.println("6.- Ex/Imp Excel");
		System.out.println("7.- Guardar/Cargar");
		System.out.println("0.- Salir.");
		System.out.println("******************");
	}
	private static void CrearNuevo(Long id, String nombre, String apellido, Crudable<Persona> dao) {
		dao.insert(new Persona(id, nombre, apellido));
	}
	private static void BorrarPorId(Long id, Crudable<Persona> dao) {
		dao.delete(id);
	}
	private static void Borrar(Long id, String nombre, String apellido, Crudable<Persona> dao) {
		dao.delete(new Persona(id, nombre, apellido));
	}
	private static void Actualizar(Long id, String nombre, String apellido, Crudable<Persona> dao) {
		dao.update(new Persona(id, nombre, apellido));
	}

}
