package com.poli.javaIntermediario.aulas85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {

		Date hj = new Date();
		
		System.out.println(hj);

		System.out.println("Milisegundos desde 1 Jan 1970 " +hj.getTime());
		
		System.out.println(hj.getDate());

		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("MILISEGUNDOS DESDE 1 JAN 1970 " + hoje.getTime());
		
		System.out.println(hoje.getDate());
	}

}
