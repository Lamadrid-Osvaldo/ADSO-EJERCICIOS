package Controlador;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import Modelo.Estructura_Num_Aleatorio;

/*1.	Realizar un programa en java que permita llenar 2 vectores con números aleatorios entre 1 y 500.
•	Mostrar la cantidad de números pares en ambos vectores 
•	Indicar cuál de los vectores contiene más números impares 
•	Mostrar los vectores ordenados ascendentemente (usando stream)*/

public class Principal_Num_Aleatorio {

	public static void main(String[] args) {

		Estructura_Num_Aleatorio ob = new Estructura_Num_Aleatorio();
		Scanner lc = new Scanner(System.in);
		//variable que almacena el tamaño de los vectores
		int tam = 0;
		//Requerimiento de tamaño de los vectores.
		System.out.println("Digite el tamaño de los vectores: ");
		tam = lc.nextInt();

		ob.NumAleatorio(tam);

	}
}
