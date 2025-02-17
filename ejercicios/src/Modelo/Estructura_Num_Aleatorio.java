package Modelo;

import java.util.Arrays;

public class Estructura_Num_Aleatorio {

	public void NumAleatorio(int tam) {

		int contparV1 = 0, contparV2 = 0;
		int acumparV1 = 0, acumparV2 = 0;
		int contImparV1 = 0, contImparV2 = 0;
		int acumImparV1 = 0, acumImparV2 = 0;
		int i = 0;

		int vector1[] = new int[tam];
		int vector2[] = new int[tam];

		for (i = 0; i < tam; i++) {
			vector1[i] = (int) (Math.random() * (500 - 1) + 1);
			vector2[i] = (int) (Math.random() * (500 - 1) + 1);

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

		System.out.println("vector 1: " + Arrays.toString(vector1));

		System.out.println("Vector 2: " + Arrays.toString(vector2));

		System.out.println("cantidad de Numeros pares del vector 1: " + contparV1);
		System.out.println("cantidad de Numeros pares del vector 2: " + contparV2);

		if (contImparV1 > contImparV2) {
			System.out.println("El vector 1 tiene mas numeros impares que el vector 2 ");
		}

		if (contImparV2 > contImparV1) {
			System.out.println("El vector 2 tiene mas numeros impares que el vector 1");
		} else {
			System.out.println("Ambos vectores tiene la misma cantidad de numeros impares");
		}

		System.out.println("Vector 1 ordenado: " + Arrays.toString(Arrays.stream(vector1).sorted().toArray()));
		System.out.println("Vector 2 ordenado: " + Arrays.toString(Arrays.stream(vector2).sorted().toArray()));
	}

}
