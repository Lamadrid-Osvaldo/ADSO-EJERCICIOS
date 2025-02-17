package Controlador;

import java.util.Scanner;

import Modelo.Estructura_Caja;

/*
 * Realizar un programa en java que permita leer un 
 * arreglo de N precio de productos al final mostrar un arreglo 
 * resultante en donde se le calcule el 10% de descuento a aquellos 
 * precios de productos superiores a 55k y en los demás casos aplicar
 *  un descuento del 5%
 */

public class Principal_Caja {

	public static void main(String[] args) {

		Estructura_Caja obj = new Estructura_Caja();
		Scanner lc = new Scanner(System.in);
		//Variable que almacena el tamaño de los vectores
		int tam = 0;
		//requerimiento de numero de productos del cliente
		System.out.println("Digite la cantidad de productos que desea comprar: ");
		tam = lc.nextInt();
		
		obj.Caja(tam);

	}

}
