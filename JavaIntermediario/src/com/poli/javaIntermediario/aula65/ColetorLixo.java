package com.poli.javaIntermediario.aula65;

import com.poli.javaIntermediario.aula61.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB );
	
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[1000];
		Contato contato;
		
		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" +i, "3265-3656"+i, "contato"+i+"@gmail.com");
			contatos[i] = contato;
			
		}
		
		System.out.println("Contatos criados");

		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUsada();
	
	}

}
