package Modelo;

import java.util.Arrays;
import java.util.Scanner;

public class Estructura_Caja {

	public void Caja(int tam) {

		Scanner lc = new Scanner(System.in);

		String nomProduc[] = new String[tam];
		double precioProduc[] = new double[tam], precioFinal[] = new double[tam];
		double descuento = 0.0;
		int i = 0;

		for (i = 0; i < precioProduc.length; i++) {

			System.out.println("Nombre del producto No. " + (i + 1) + " :");
			nomProduc[i] = lc.nextLine();

			System.out.println("Precio del producto No. " + (i + 1) + " :");
			precioProduc[i] = lc.nextDouble();
			lc.nextLine();
		}

		for (i = 0; i < precioProduc.length; i++) {

			if (precioProduc[i] >= 55000) {
				descuento = 0.10 * precioProduc[i];
				precioFinal[i] = precioProduc[i] - descuento;

			} else {
				descuento = 0.05 * precioProduc[i];
				precioFinal[i] = precioProduc[i] - descuento;
			}

		}

		System.out.println("Productos: " + Arrays.toString(nomProduc));

		System.out.println("Precio final con descuento agregado: " + Arrays.toString(precioFinal));

	}

}
