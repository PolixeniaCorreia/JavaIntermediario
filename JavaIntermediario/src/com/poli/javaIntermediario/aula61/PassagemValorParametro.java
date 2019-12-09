package com.poli.javaIntermediario.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Poli", "3214-1215", "poli@gmail.com");
		int valor = 10;

		System.out.println("Valores Originais");

		System.out.println(contato);
		System.out.println(valor);

		
		System.out.println("Exemplo 1");
		tetsePassagemValorReferencia(valor, contato);
		System.out.println(contato);
		System.out.println(valor);

		
		System.out.println();
		
		
		System.out.println("Exemplo 2");
		tetsePassagemValorReferencia2(valor, contato);
		System.out.println(contato);
		System.out.println(valor);


	}
	private static void tetsePassagemValorReferencia (int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "3245-2565", "contato2@gmail.com");
	}
	private static void tetsePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato " +novoValor);
	}

}
