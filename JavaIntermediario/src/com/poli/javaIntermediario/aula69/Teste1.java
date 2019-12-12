package com.poli.javaIntermediario.aula69;

public class Teste1 {
	public static void main(String[] args) {

		MinhaThreadRunnable thr1 = new MinhaThreadRunnable("1", 500);
		MinhaThreadRunnable thr2 = new MinhaThreadRunnable("2", 500);
		MinhaThreadRunnable thr3 = new MinhaThreadRunnable("3", 500);

		Thread t1 = new Thread(thr1);
		Thread t2 = new Thread(thr2);
		Thread t3 = new Thread(thr3);

		t1.start();
		t2.start();
		t3.start();

		for (int i = 0; i < 7; i++) {

			try {

				Thread.sleep(200);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}
		}

		System.out.println("Programa finalizado");	

	}

}
