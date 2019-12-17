package EjerciciosCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerciciosCondicionales {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * // 1.- Programa Java que lea un número entero por teclado y calcule si es par
		 * o // impar.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce número"); int numero =
		 * Integer.parseInt(br.readLine());
		 * 
		 * if (numero % 2 == 0) { System.out.println("el número es par"); }else {
		 * System.out.println("El número es impar"); }
		 */

		/*
		 * //***************************************************************************
		 * ** //2.-Programa que lea un número entero y muestre si el número es múltiplo
		 * de 10.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce número"); int numero =
		 * Integer.parseInt(br.readLine());
		 * 
		 * if(numero%10 == 0) { System.out.println("El número es múltiplo de 10"); }else
		 * { System.out.println("El número NO es múltiplo de 10"); }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * // 3.-Programa que lea un carácter por teclado y compruebe si es una letra //
		 * mayúscula
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce una letra"); String letra = br.readLine(); char
		 * caracter = letra.charAt(0);
		 * 
		 * if (Character.isUpperCase(caracter)) {
		 * 
		 * System.out.println("Es una letra mayúscula"); } else {
		 * System.out.println("Es una letra minúscula"); }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * // 4.- Programa que lea dos caracteres y compruebe si son iguales.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("introduce primer caracter"); String letra1 =
		 * br.readLine(); System.out.println("introduce segundo caracter"); String
		 * letra2 = br.readLine();
		 * 
		 * char char1 = letra1.charAt(0); char char2 = letra2.charAt(0);
		 * 
		 * if (char1 == char2) { System.out.println("si"); } else {
		 * System.out.println("no"); }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * // 5.- Programa java que lea dos caracteres por teclado y compruebe si los
		 * dos // son letras minúsculas
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce primer caracter"); String letra1 =
		 * br.readLine();
		 * 
		 * System.out.println("Introduce segundo caracter"); String letra2 =
		 * br.readLine();
		 * 
		 * char car1 = letra1.charAt(0); char car2 = letra2.charAt(0);
		 * 
		 * if (Character.isLowerCase(car1) && Character.isLowerCase(car2)) {
		 * System.out.println("Los dos caracteres son minúscula"); } else {
		 * System.out.println("uno o ambos caracteres no son minúscula"); }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * // 6.- Programa java que lea un carácter por teclado y compruebe si es un
		 * dígito // numérico (cifra entre 0 y 9).
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Ingresa un caracter por teclado"); char caracter =
		 * br.readLine().charAt(0);
		 * 
		 * if (Character.isDigit(caracter)) {
		 * System.out.println("Es un dígito numérico");
		 * 
		 * } else { System.out.println("No es un dígito numérico"); }
		 */

		/*
		 * //
		 * *****************************************************************************
		 * // 7.-Programa que lea dos números por teclado y muestre el resultado de la
		 * // división del primer número por el segundo. Se debe comprobar que el
		 * divisor // no puede ser cero.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * int num1, num2;
		 * 
		 * do { System.out.println("Introduce primer número"); num1 =
		 * Integer.parseInt(br.readLine());
		 * 
		 * System.out.println("Introduce segundo número"); num2 =
		 * Integer.parseInt(br.readLine());
		 * 
		 * if (num2 == 0) {
		 * System.out.println("El divisor no puede ser cero!!...Prueba otra vez"); }
		 * 
		 * } while (num2 == 0);
		 * 
		 * int resultado = num1 / num2; System.out.println("El resultado de " + num1 +
		 * "/" + num2 + " = " + resultado);
		 */

		/*
		 * //
		 * *****************************************************************************
		 * // 8.- El programa lee por teclado tres números enteros y calcula y muestra
		 * el // mayor de los tres.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("ingresa el primer número"); int num1 =
		 * Integer.parseInt(br.readLine());
		 * 
		 * System.out.println("ingresa el segundo número"); int num2 =
		 * Integer.parseInt(br.readLine());
		 * 
		 * System.out.println("ingresa el tercer número"); int num3 =
		 * Integer.parseInt(br.readLine());
		 * 
		 * if (num1 > num2 && num1 > num3) { System.out.println(num1 +
		 * " que es el primer numero es el mayor"); } if (num2 > num3 && num2 > num1) {
		 * System.out.println(num2 + " que es el segundo numero es el mayor"); } if
		 * (num3 > num2 && num3 > num1) { System.out.println(num3 +
		 * " que es el tercer numero es el mayor"); }
		 */

		// *****************************************************************************
		// 9.- Programa que lea por teclado tres números enteros H, M, S
		// correspondientes a hora, minutos y segundos respectivamente, y comprueba si
		// la hora que indican es una hora válida.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minutos = 0;
		int segundos = 0;

		System.out.println("Introduce la hora de 0 a 24");
		int hora = Integer.parseInt(br.readLine());

		if (hora <= 24 && hora >= 0) {
			System.out.println("Introduce los minutos");
			minutos = Integer.parseInt(br.readLine());

			if (minutos <= 60 && minutos >= 0) {
				System.out.println("Introduce los segundos");
				segundos = Integer.parseInt(br.readLine());
			}
		} else {
			System.out.println("los valores introducidos no son correctos");
		}

		System.out.println("Hora registrada " + hora + ":" + minutos + ":" + segundos);

		// *****************************************************************************
		// 10.- Programa que lea una variable entera "mes" y compruebe si el valor
		// corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
		// 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor
		// introducido esté comprendido entre 1 y 12.

		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce el numero del Mes"); int mes =
		 * Integer.parseInt(br.readLine());
		 * 
		 * if (mes <= 12 && mes > 0) {
		 * 
		 * switch (mes) { case 1: System.out.println("El mes de Enero tiene 31 días");
		 * break; case 2: System.out.println("El mes de Febrero tiene 28 días"); break;
		 * case 3: System.out.println("El mes de Marzo tiene 31 días"); break; case 4:
		 * System.out.println("El mes de Abril tiene 30 días"); break; case 5:
		 * System.out.println("El mes de Mayo tiene 31 días"); break; case 6:
		 * System.out.println("El mes de Junio tiene 30 días"); break; case 7:
		 * System.out.println("El mes de Julio tiene 31 días"); break; case 8:
		 * System.out.println("El mes de Agosto tiene 31 días"); break; case 9:
		 * System.out.println("El mes de Septiembre tiene 30 días"); break; case 10:
		 * System.out.println("El mes de Octubre tiene 31 días"); break; case 11:
		 * System.out.println("El mes de Noviembre tiene 30 días"); break; case 12:
		 * System.out.println("El mes de Diciembre tiene 31 días"); break; }
		 * 
		 * } else { System.out.println("El valor ingresado no es correcto"); }
		 */

	}

}
