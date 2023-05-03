/**
 * 
 */
package com.maria.hola.mundo;

/**
 * @author MEMORY SISTEMAS
 *
 */
public class HolaMundo {

	/**
	 * 
	 */
	public HolaMundo() {
		// TODO IBR revisar esta función
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Adios Mundo");
		
		// Ejemplo for
		for (int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		// Ejemplo de while
		int i = 0;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		// Ejemplo de if operacion para averiguar si un nº es par o impar (dividiendo entre 2 y quedándonos con el resto: %). 
		
		for (int j=0; j<=10; j++) {
			int resto = j % 2; 
			if (resto == 0) {				
				System.out.println("Valor j: " + j + " Resto: " + resto + " -> ES PAR");
			}
			else {
				System.out.println("Valor j: " + j + " Resto: " + resto + " -> ES IMPAR");
			}
		}

	}

}
