package Controlador;

import java.util.Scanner;

import Modelo.Estructura_Caja;

public class Principal_Caja {

	public static void main(String[] args) {

		Estructura_Caja obj = new Estructura_Caja();
		Scanner lc = new Scanner(System.in);

		int tam = 0;

		System.out.println("Digite la cantidad de productos que desea comprar: ");
		tam = lc.nextInt();

		obj.Caja(tam);

	}

}
