package Controlador;

import java.util.Scanner;

import Modelo.Estructura_Nombres;

/*2 Realizar un programa en java que permita leer un arreglo de nombres. 
 * Al final mostrar el nombre con mayor cantidad de caracteres y su posición
*/
public class Principal_Nombres {

	public static void main(String[] args) {

		Estructura_Nombres obj = new Estructura_Nombres();

		var lc = new Scanner(System.in);
		// variable que almacena el tamaño del arreglo.
		int tam;
		// Requerimiento de tamaño del arreglo.
		System.out.println("Digite el tamaño del arreglo: ");
		tam = lc.nextInt();
		// salida de datos.
		obj.nombres(tam);

	}

}
