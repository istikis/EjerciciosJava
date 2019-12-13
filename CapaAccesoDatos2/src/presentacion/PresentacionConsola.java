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
		int opcion, seleccion;
		Long id;
		String nombre, apellido;

		do {
			MenuInicio();
			opcion = Integer.parseInt(br.readLine());

			if (opcion >= 0 && opcion <= 8) {

				switch (opcion) {
				case 1:
					for (Persona persona : dao.getAll()) {
						System.out.println(persona);
					}
					break;
				case 2:
					System.out.println("Bucar Usuario por Id");
					System.out.print("Id: ");
					id = Long.parseLong(br.readLine());
					System.out.println(dao.getById(id));
					break;
				case 3:
					System.out.println("Crear Nuevo");
					System.out.print("Nuevo Id: ");
					id = Long.parseLong(br.readLine());
					System.out.print("Nombre: ");
					nombre = br.readLine();
					System.out.print("Apellido: ");
					apellido = br.readLine();
					CrearNuevo(id, nombre, apellido, dao);
					break;
				case 4:
					System.out.println("Actualizar");
					System.out.print("Id: ");
					id = Long.parseLong(br.readLine());
					System.out.print("Nombre: ");
					nombre = br.readLine();
					System.out.print("Apellido: ");
					apellido = br.readLine();
					Actualizar(id, nombre, apellido, dao);
					break;
				case 5:
					System.out.println("Borrar");
					System.out.print("Id: ");
					id = Long.parseLong(br.readLine());
					System.out.print("Nombre: ");
					nombre = br.readLine();
					System.out.print("Apellido: ");
					apellido = br.readLine();
					Borrar(id, nombre, apellido, dao);
					break;
				case 6:
					System.out.println("Introduce el Id de la persona a borrar: ");
					id = Long.parseLong(br.readLine());
					BorrarPorId(id, dao);
					break;
				case 7:
					System.out.println("Exportación/Importación Excel");
					System.out.println("1.- Exportar Fichero");
					System.out.println("2.- Importar Fichero");
					seleccion = Integer.parseInt(br.readLine());
					Ficheros(FICHERO_TXT, dao, seleccion);

					break;
				case 8:
					GuardarCargar(FICHERO, dao);
					break;
				}

			} else {
				System.out.println("Valor introducido incorrecto, vuelve a intentarlo");
			}
		} while (opcion != 0);

		System.out.println("Vuelve pronto, Agur!");
	}

	@SuppressWarnings({})
	private static void Ficheros(String FICHERO_TXT, Crudable<Persona> dao, int seleccion) {
		FileWriter fw = null;
		PrintWriter pw = null;

		switch (seleccion) {
		case 1:
			try {
				fw = new FileWriter(FICHERO_TXT);
				pw = new PrintWriter(fw);

				ArrayList<Persona> Txt = new ArrayList<>();

				for (Persona p : dao.getAll()) {
					Txt.add(p);
				}
				pw.println(Txt);

			} catch (IOException e) {
				System.out.println("Error al escribir el fichero!");
				return;
			} finally {
				if (pw != null) {
					pw.close();
				}
				if (fw != null) {
					try {
						fw.close();
					} catch (IOException e) {
						System.out.println("No se ha podido cerrar el fichero");
						return;
					}
				}
			}
			System.out.println("Datos exportados correctamente!");
			break;

		case 2:
			try (FileReader fr = new FileReader(FICHERO_TXT)) {
				try (BufferedReader br = new BufferedReader(fr)) {

					String linea;

					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero");
				return;
			} catch (IOException e) {
				System.out.println("No se ha podido leer el fichero");
				return;
			}
			System.out.println("Datos Importados Correctamente!");
			break;
		}

	}

	private static void GuardarCargar(String FICHERO, Crudable<Persona> dao)
			throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream(FICHERO);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		ArrayList<Persona> arrOut = new ArrayList<>();

		for (Persona p : dao.getAll()) {

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

		for (Persona p : leido) {
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
		System.out.println("1.- Listar Todos");
		System.out.println("2.- Listar por Id");
		System.out.println("3.- Crear Nuevo");
		System.out.println("4.- Actualizar");
		System.out.println("5.- Borrar");
		System.out.println("6.- Borrar por Id");
		System.out.println("7.- Ex/Imp Excel");
		System.out.println("8.- Guardar/Cargar");
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
