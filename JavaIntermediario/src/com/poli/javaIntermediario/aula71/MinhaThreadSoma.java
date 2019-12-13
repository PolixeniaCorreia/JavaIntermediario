package com.poli.javaIntermediario.aula71;

public class MinhaThreadSoma implements Runnable{

	private String nome;
	private int[] numeros;
	private static Calculadora cal = new Calculadora();
	
	
	public MinhaThreadSoma (String nome, int[] numeros) {

		this.nome = nome;
		this.numeros = numeros;
		new Thread(this, nome).start();

		//Thread t = new Thread(this, nome);
		//t.start();
	}


	@Override
	public void run() {

		System.out.println(this.nome +  "iniciada");

		int soma = cal.somaArray(this.numeros);
		
		System.out.println("Resultado da soma para thread " +this.nome + " é: " +soma);
		
		System.out.println(this.nome + " terminada");
		
	}
}
