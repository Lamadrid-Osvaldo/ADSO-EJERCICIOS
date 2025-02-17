package Controlador;

import java.util.Scanner;

import Modelo.Estructura_Nombres;

public class Principal_Nombres {

	public static void main(String[] args) {

		Estructura_Nombres obj = new Estructura_Nombres();

		var lc = new Scanner(System.in);

		int tam;

		System.out.println("Digite el tamaño del arreglo: ");
		tam = lc.nextInt();

		obj.nombres(tam);

	}

}
