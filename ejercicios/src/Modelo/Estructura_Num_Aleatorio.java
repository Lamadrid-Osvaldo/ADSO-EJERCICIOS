package Modelo;

import java.util.Arrays;

public class Estructura_Num_Aleatorio {

	public void NumAleatorio(int tam) {
		//variables para contar los num pares e impares de los vectores.
		int contparV1 = 0, contparV2 = 0;
		int contImparV1 = 0, contImparV2 = 0;
		
		int i = 0;
		//vectores.
		int vector1[] = new int[tam];
		int vector2[] = new int[tam];
		/*ciclo para generar los numeros de manera aleatorea.
		 * Contar los numeros pares e impares de los vectores. 
		 */
		for (i = 0; i < tam; i++) {
			//Linea 21 e 22 generan los numeros ramdoms de ambos vectores.
			vector1[i] = (int) (Math.random() * (500 - 1) + 1);
			vector2[i] = (int) (Math.random() * (500 - 1) + 1);
			/*
			 * Desde la linea 27 hasta la 39 cuenta los numeros pares 
			 * e impares de los vectores
			 */
			if (vector1[i] % 2 == 0) {
				contparV1++;

			} else {
				contImparV1++;
			}

			if (vector2[i] % 2 == 0) {
				contparV2++;

			} else {
				contImparV2++;
			}

		}
		//Salida de los vectores.
		System.out.println("vector 1: " + Arrays.toString(vector1));

		System.out.println("Vector 2: " + Arrays.toString(vector2));
		//salida de numeros pares de los vectores.
		System.out.println("cantidad de Numeros pares del vector 1: " + contparV1);
		System.out.println("cantidad de Numeros pares del vector 2: " + contparV2);
		//dice cual de los 2 vectores tiene mas numeros pares e impares.
		if (contImparV1 > contImparV2) {
			System.out.println("El vector 1 tiene mas numeros impares que el vector 2 ");
		}

		if (contImparV2 > contImparV1) {
			System.out.println("El vector 2 tiene mas numeros impares que el vector 1");
		} else {
			System.out.println("Ambos vectores tiene la misma cantidad de numeros impares");
		}
		//Salida de ambos vectores de manera ordenada usando la clase stream.
		System.out.println("Vector 1 ordenado: " + Arrays.toString(Arrays.stream(vector1).sorted().toArray()));
		System.out.println("Vector 2 ordenado: " + Arrays.toString(Arrays.stream(vector2).sorted().toArray()));
	}

}
