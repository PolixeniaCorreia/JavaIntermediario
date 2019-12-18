package com.poli.javaIntermediario.teste3;

import java.lang.reflect.InvocationTargetException;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException, 
	 InvocationTargetException{

		Thread t1 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i+ ":t1");
				}
			}

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i+ ":t2");
				}
			}

		};

		System.out.println("Threads Ativas = " +Thread.activeCount());
		
		t1.start();
		t1.join();
		t2.start();
//		t2.join();
		
		System.out.println("Nome Thread T1: " +t1.getName() + " | isAlive:" + t1.isAlive());
		System.out.println("Nome Thread T2: " +t2.getName() + " | isAlive:" + t2.isAlive());
		
		System.out.println("Threads Ativas = " +Thread.activeCount());
	}

}
