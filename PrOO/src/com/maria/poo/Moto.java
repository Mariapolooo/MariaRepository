package com.maria.poo;

public class Moto extends Vehiculo {
	boolean esMoto = true;

	@Override
	public String toString() {
		return super.toString() + "Moto [esMoto=" + esMoto + "]";
	} 

}
