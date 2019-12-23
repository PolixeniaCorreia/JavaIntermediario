package com.poli.javaIntermediario.aula75_84;

public class Aula81 {

	public static void main(String[] args) {
		
		String teste = "Teste";

		String testeMinusc = teste.toLowerCase();
		String testeMaiusc = teste.toUpperCase();
		
		System.out.println(testeMaiusc);
		System.out.println(testeMinusc);
		
		if (teste.toLowerCase().equals(teste.toLowerCase())) {
			System.out.println("Igual");
		}

	}

}
