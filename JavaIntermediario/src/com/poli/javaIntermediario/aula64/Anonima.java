package com.poli.javaIntermediario.aula64;

public class Anonima {

	public void imprimeTexto() {
		System.out.println("Imprime texto.");
	}

	public static void main(String[] args){

		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("Texto sobrescrito.");
			}
		};

		anonima.imprimeTexto();

		Texto texto = new Texto() {
			@Override
			public void imprimeTexto() {
				System.out.println("Texto - Interface");
			}
		};

		texto.imprimeTexto();
	}
}
