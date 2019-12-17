import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ejercicios_01 {

	
	public static void main(String[] args) throws IOException {
		//EJERCICIOS BÁSICOS RESUELTOS CON ESTRUCTURA SECUENCIAL
		
		/*
		 * // 1. Programa Java que lea dos números enteros por teclado y los muestre por
		 * pantalla. // declaración de variables int n1, n2;
		 * 
		 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in); // leer el
		 * primer número System.out.println("Introduce un número entero: "); n1 =
		 * sc.nextInt(); // lee un entero por teclado // leer el segundo número
		 * System.out.println("Introduce otro número entero: "); n2 = sc.nextInt(); //
		 * lee un entero por teclado // mostrar resultado
		 * System.out.println("Ha introducido los números: " + n1 + " y " + n2);
		 */
		
		//------------------------------------------------------------------------------
		/*
		 * //2.-Programa Java que lea un nombre y muestre por pantalla:"Buenos dias
		 * nombre_introducido”
		 * 
		 * //Forma1 //Scanner entrada = new Scanner(System.in);
		 * //System.out.println("Ingresa el nombre:"); //String nombre =
		 * entrada.nextLine(); //System.out.println("Buenos Días " + nombre);
		 * 
		 * //Forma2 BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce tu nombre"); String nombre = br.readLine();
		 * System.out.println("Buenos Días " + nombre);
		 */
		
		//-------------------------------------------------------------------------------
		//3.- Escribe un programa Java que lee un número entero por teclado y obtiene y 
		//muestra por pantalla el doble y el triple de ese número.
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce un número:"); int numero =
		 * Integer.parseInt(br.readLine()); System.out.println("El doble de " + numero +
		 * " es " + numero*2 + " y el triple es " + numero*3);
		 */
		
		
		//-------------------------------------------------------------------------------
		/*
		 * //4.- Programa que lea una cantidad de grados centígrados y la pase a grados
		 * Fahrenheit. //La fórmula correspondiente para pasar de grados centígrados a
		 * fahrenheit es: //F = 32 + ( 9 * C / 5)
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("introduce grados centígrados"); double grados =
		 * Double.parseDouble(br.readLine()); System.out.println(grados +
		 * " grados centígrados son " + (32 + ( 9 * grados / 5)) +
		 * " grados Fahrenheit");
		 */
		
		//-------------------------------------------------------------------------------
		/*
		 * //5.-Programa que lee por teclado el valor del radio de una circunferencia y
		 * //calcula y muestra por pantalla la longitud y el área de la circunferencia.
		 * //Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
		 * PI*Radio^2
		 * 
		 * BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce el Radio de la Circunferencia"); double radio =
		 * Double.parseDouble(br.readLine());
		 * System.out.println("La longitud de la circunferencia de " + radio + " es " +
		 * (Math.round(2*Math.PI*radio)));
		 * System.out.println("y el área de la circunferencia es " +
		 * (Math.round(Math.pow(Math.PI*radio, 2))));
		 */
		
		//-------------------------------------------------------------------------------
		/*
		 * //6.-Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
		 * teclado.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce la velocidad en Km/h"); double velocidad =
		 * Double.parseDouble(br.readLine()); System.out.println(velocidad + " Km/h sn "
		 * + Math.round(velocidad*1000/3600) + " m/s" );
		 */
		
		//-------------------------------------------------------------------------------
		/*
		 * //7.- Programa lea la longitud de los catetos de un triángulo rectángulo y
		 * calcule //la longitud de la hipotenusa según el teorema de Pitágoras.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("introduce el valor del primer cateto"); double cateto1 =
		 * Double.parseDouble(br.readLine());
		 * System.out.println("introduce el valor del segundo cateto"); double cateto2 =
		 * Double.parseDouble(br.readLine());
		 * 
		 * System.out.println("Hipotenusa " + Math.sqrt(Math.pow(cateto1,2)+
		 * Math.pow(cateto2, 2)));
		 */		
		
		//-------------------------------------------------------------------------------
		/*
		 * //8.- Programa que tome como dato de entrada un número que corresponde a la
		 * longitud //del radio una esfera y nos calcula y escribe el volumen de la
		 * esfera que se corresponden //con dicho radio. //La fórmula para calcular el
		 * volumen de la esfera es v = (4/3)*PI*r^3
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce la longitud del radio de la esfera"); double
		 * radioEsfera = Double.parseDouble(br.readLine());
		 * 
		 * System.out.println("Volumen de la Esfera " +
		 * ((4/3)*Math.PI*Math.pow(radioEsfera, 3)));
		 */
		
		//-------------------------------------------------------------------------------
		/*
		 * //9.-Programa Java que calcule el área de un triángulo en función de las
		 * longitudes //de sus lados (a, b, c), según la siguiente fórmula: //Area =
		 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) //donde p = (a+b+c)/2
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("introduce el primer lado del triángulo"); double lado1 =
		 * Double.parseDouble(br.readLine());
		 * System.out.println("introduce el segundo lado del triángulo"); double lado2 =
		 * Double.parseDouble(br.readLine());
		 * System.out.println("introduce el tercer lado del triángulo"); double lado3 =
		 * Double.parseDouble(br.readLine()); double p = lado1 + lado2 + lado3 /2;
		 * System.out.println("El área del triángulo es "+
		 * Math.sqrt(p*p-lado1)*(p-lado2)*(p-lado3));
		 */
		
		//-------------------------------------------------------------------------------
		/*
		 * //10.- Programa Java que lea un número entero de 3 cifras y muestre por
		 * separado //las cifras del número.
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Introduzca valor de N: "); int numero = sc.nextInt();
		 * //supondremos que el número introducido tiene 3 cifras
		 * System.out.println("Primera cifra de " + numero + " -> " + (numero/100));
		 * System.out.println("Cifra central de " + numero + " -> " + (numero/10)%10);
		 * System.out.println("Última cifra  de " + numero + " -> " + (numero%10));
		 */
		
		//-------------------------------------------------------------------------------
		/*
		 * //11.- Programa que lea un número entero N de 5 cifras y muestre sus cifras
		 * igual que en //el ejemplo.
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Introduce un número de 5 cifras!"); int numero =
		 * Integer.parseInt(br.readLine());
		 * 
		 * System.out.println(numero/10000); System.out.println(numero/1000);
		 * System.out.println(numero/100); System.out.println(numero/10);
		 * System.out.println(numero);
		 */
		
		//-------------------------------------------------------------------------------
		//12.-
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("Introduce un número de 5 cifras"); int num =
		 * Integer.parseInt(br.readLine()); System.out.println(num%10);
		 * System.out.println(num%100); System.out.println(num%1000);
		 * System.out.println(num%10000); System.out.println(num);
		 */
		
		//-------------------------------------------------------------------------------		 
		//13.- Número de la suerte
	 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("introduce día de nacimiento");
//		int dia = Integer.parseInt(br.readLine());
//		System.out.println("introduce mes de nacimiento");
//		int mes = Integer.parseInt(br.readLine());
//		System.out.println("introduce año de nacimiento");
//		int año = Integer.parseInt(br.readLine());
//	 
//		int sumaFecha = dia + mes + año;
//		int num1 = sumaFecha / 1000;
//		int num2 = sumaFecha / 100 % 10;
//		int num3 = sumaFecha / 10 % 10;
//		int num4 = sumaFecha % 10;
//
//		int numSuerte = num1 + num2 + num3 + num4;
//		System.out.println("Tu número de la suerte es el: " + numSuerte);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
	    numeros.add(4);
	    numeros.add(8);
	    numeros.add(5);
	    numeros.add(1);
	    numeros.add(2);
	    numeros.add(9);
	    numeros.add(0);
	    numeros.add(3);
	    numeros.add(7);
	    numeros.add(6);
	    
	    for (int i : numeros) {
			System.out.println(i);
//			Collections.sort(numeros);			
		
		}
	    
	    System.out.println(numeros);

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
