package EjerciciosIteradores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerciciosIteradores {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * // 01.- Ejemplo de uso de while: Programa Java que muestre los números del 1
		 * al // 100 utilizando la instrucción while.
		 * 
		 * int count = 1; while (count <= 100) { System.out.println(count); count++; }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * * // 2.- Ejemplo de uso de do-while. Programa Java que muestre los números
		 * del 1 // al 100 utilizando la instrucción do..while.
		 * 
		 * int count = 1;
		 * 
		 * do { System.out.println(count); count++; } while (count <= 100);
		 */

		/*
		 * //
		 * *****************************************************************************
		 * * // 3.- Ejemplo de uso de for. Programa Java que muestre los números del 1
		 * al 100 // utilizando la instrucción for.
		 * 
		 * int count = 1; for (int i = 1; i <= 100; i++) { System.out.println(count);
		 * count++; }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * * // 4.- Ejemplo de uso de while. Programa Java que muestre los números del
		 * 100 al // 1 utilizando la instrucción while.
		 * 
		 * int count = 100; while (count >= 1) { System.out.println(count); count--;
		 * 
		 * }
		 */

		// ******************************************************************************
		// 5.- Ejemplo de uso de do-while. Programa Java que muestre los números del 100
		// al 1 utilizando la instrucción do..while.

//		int count = 100;
//
//		do {
//			System.out.println(count);
//			count--;
//		} while (count >= 1);

		// ******************************************************************************
		// 6.- Ejemplo de for. Programa Java que muestre los números del 100 al 1
		// utilizando la instrucción for.

//		int count = 100;
//
//		for (int i = 100; i >= 1; i--) {
//			System.out.println(count);
//			count--;
//		}

		// ******************************************************************************
		// 7.- Escribe un programa Java que pida por teclado el valor de un número N y
		// muestre por pantalla todos los números desde 1 hasta N. Resuelve este
		// ejercicio de tres formas distintas:

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int count = 1;
//
//		System.out.println("Dime, hasta que número quieres que cuente??");
//		int numero = Integer.parseInt(br.readLine());

//		while (count <= numero) {
//			System.out.println(count);
//			count++;
//		}

//		do {
//			System.out.println(count);
//			count++;
//		} while (count <= numero);

//		for (int i = 1; i <= numero; i++) {
//			System.out.println(count);
//			count++;			
//		}

		// ******************************************************************************
		// 8.- Programa que pida que se introduzca por teclado el valor de un número
		// entero N y muestre los números desde N hasta 1 ambos incluidos. Se debe
		// resolver este ejercicio de tres formas distintas: utilizando la estructura
		// repetitiva while, utilizando la estructura repetitiva do .. while y
		// utilizando la estructura repetitiva for.

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("Desde que número comenzamos la cuenta regresiva?");
//		int numero = Integer.parseInt(br.readLine());

//		for (int i = 1; i <= numero;) {
//			System.out.println(numero);
//			numero--;			
//		}

//		while (numero >= 1) {
//			System.out.println(numero);
//			numero--;
//		}

//		do {
//			System.out.println(numero);
//			numero--;
//		} while (numero >= 1);

		// ******************************************************************************
		// 9.- Leer dos números y mostrar los números desde el menor hasta el mayor

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduce primer número");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Introduce segundo número");
		int num2 = Integer.parseInt(br.readLine());
		
		if(num1 > num2) {
			System.out.println();
		}

	}

}
