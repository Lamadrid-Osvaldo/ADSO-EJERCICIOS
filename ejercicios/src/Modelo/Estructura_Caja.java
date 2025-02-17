package Modelo;

import java.util.Arrays;
import java.util.Scanner;

public class Estructura_Caja {

	public void Caja(int tam) {

		Scanner lc = new Scanner(System.in);
		//Declaracion de variables y arreglos.
		String nomProduc[] = new String[tam];
		double precioProduc[] = new double[tam], precioFinal[] = new double[tam];
		double descuento = 0.0;
		int i = 0;
		/*ciclo en el cual se piden los nombres y precios de los productos y 
		 almacenados en su respectivo arreglo.
		*/
		for (i = 0; i < precioProduc.length; i++) {

			System.out.println("Nombre del producto No. " + (i + 1) + " :");
			nomProduc[i] = lc.nextLine();

			System.out.println("Precio del producto No. " + (i + 1) + " :");
			precioProduc[i] = lc.nextDouble();
			lc.nextLine();
		}
		// Ciclo para proceso de condiciones.
		for (i = 0; i < precioProduc.length; i++) {
			/*Condicional si el precio de x producto es superior a 55k 
			 * aplicarle un descuento del 10%.
			 */
			if (precioProduc[i] >= 55000) {
				descuento = 0.10 * precioProduc[i];
				precioFinal[i] = precioProduc[i] - descuento;

			}/* Si no cumple la condicional se le hara un descuento del 5% 
			a x producto */
			else {
				descuento = 0.05 * precioProduc[i];
				precioFinal[i] = precioProduc[i] - descuento;
			}

		}
		/*Salida de datos. nombre de los productos y su precio final 
		 * con descuento ya restadp al precio final.*/
		System.out.println("Productos: " + Arrays.toString(nomProduc));

		System.out.println("Precio final con descuento agregado: " + Arrays.toString(precioFinal));

	}

}
