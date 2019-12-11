package com.poli.javaIntermediario.aula68;

public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		
		try {
			
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();	
		}
		
		System.out.println(nome + "Terminou execução.");

	}

}
