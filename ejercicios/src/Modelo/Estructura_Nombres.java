package Modelo;

import java.util.Scanner;

public class Estructura_Nombres {

	public void nombres(int tam) {
		//arreglo de nombres
		String arrayNom[] = new String[tam];
		//variable de control, y de posicionamiento del arreglo.
		int i = 0, posi;
		//nombre Mayor= nombre de mayor numero de caracteres.
		String nomM = "";
		
		var lc = new Scanner(System.in);
		// ciclo para digitar los nombres y almacenarlos en el arreglo.
		for (i = 0; i < arrayNom.length; i++) {

			System.out.println("Digite el " + (i + 1) + " Nombre: ");
			arrayNom[i] = lc.nextLine();
		}

		nomM = arrayNom[0];
		posi = 1;
		/*ciclo para condicionar, si num de caracteres del 
		 * 2 nombre almacenado en el arreglo es mayor al primer nombre almacenado
		 * en el arreglo se guardara en la variable Nombre Mayor (nomM)
		 * y posi tomara esta posicion almacenandola.*/
		for (i = 1; i < arrayNom.length; i++) {
			if (arrayNom[i].length() > nomM.length()) {
				nomM = arrayNom[i];
				posi = i + 1;
			}

		}
		//Salida de datos.
		System.out.println("El nombre con mayor cantidad de caracteres es: " + nomM);
		System.out.println("Que esta en la posicion # " + posi);

	}

}
