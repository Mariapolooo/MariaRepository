package com.maria.poo;

public class Vehiculo {
	private String tipo; // coche, furgoneta, moto, camión, autobus
	private int numPuertas; 
	private int numRuedas;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder cadenaSalida = new StringBuilder(); 
		cadenaSalida.append(tipo + ", ");
		cadenaSalida.append(numPuertas + ", ");
		cadenaSalida.append(numRuedas + ".");
		return cadenaSalida.toString();
	}
	
	
	

}
