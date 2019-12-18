package com.poli.javaIntermediario.teste1;

public class ThreadStart {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i+ ":t1");
				}
			}

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i+ ":t2");
				}
			}

		};

		t1.start();
		t2.start();
		
	}

}
