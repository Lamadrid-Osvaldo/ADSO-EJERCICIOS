package Modelo;

import java.util.Scanner;

public class Estructura_Nombres {

	public void nombres(int tam) {

		String arrayNom[] = new String[tam];

		int i = 0, posi;
		String nomM = "";

		var lc = new Scanner(System.in);

		for (i = 0; i < arrayNom.length; i++) {

			System.out.println("Digite el " + (i + 1) + " Nombre: ");
			arrayNom[i] = lc.nextLine();
		}

		nomM = arrayNom[0];
		posi = 1;

		for (i = 1; i < arrayNom.length; i++) {
			if (arrayNom[i].length() > nomM.length()) {
				nomM = arrayNom[i];
				posi = i + 1;
			}

		}

		System.out.println("El nombre con mayor cantidad de caracteres es: " + nomM);
		System.out.println("Que esta en la posicion # " + posi);

	}

}
