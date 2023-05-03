package com.maria.poo;

public class ClaseMain {

	public static void main(String[] args) {
//		Vehiculo vehiculo = new Vehiculo();
//		
//		vehiculo.setTipo("Coche");
//		vehiculo.setNumPuertas(5);
//		vehiculo.setNumRuedas(4); // debe estar encapsulado (es decir, privado dentro de la clase). 
		
		Moto moto = new Moto();
		
		moto.setTipo("Moto");
		moto.setNumPuertas(0);
		moto.setNumRuedas(2); // debe estar encapsulado (es decir, privado dentro de la clase). 
		
		System.out.println(moto.toString());
	}

}
