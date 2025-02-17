package Controlador;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import Modelo.Estructura_Num_Aleatorio;

public class Principal_Num_Aleatorio {

	public static void main(String[] args) {

		Estructura_Num_Aleatorio ob = new Estructura_Num_Aleatorio();
		Scanner lc = new Scanner(System.in);

		int tam = 0;

		System.out.println("Digite el tamaño de los vectores: ");
		tam = lc.nextInt();

		ob.NumAleatorio(tam);

	}
}
