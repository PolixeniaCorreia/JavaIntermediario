package com.poli.javaIntermediario.aula68;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thr1 = new MinhaThreadRunnable("1", 1000);
		//Thread t1 = new Thread(thread1);
		//t1.start();

		MinhaThreadRunnable thr2 = new MinhaThreadRunnable("2", 600);

		MinhaThreadRunnable thr3 = new MinhaThreadRunnable("3", 200);

	}

}
