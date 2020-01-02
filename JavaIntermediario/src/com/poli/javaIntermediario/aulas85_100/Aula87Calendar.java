package com.poli.javaIntermediario.aulas85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hj = Calendar.getInstance(); //singleton
		
		int ano = hj.get(Calendar.YEAR);
		int mes = hj.get(Calendar.MONTH);
		int dia = hj.get(Calendar.DAY_OF_MONTH);
		int hora = hj.get(Calendar.HOUR_OF_DAY);
		int minutos = hj.get(Calendar.MINUTE);
		int segundos = hj.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos);
		
		hj.add(Calendar.DAY_OF_MONTH, -1);

		hj.add(Calendar.DAY_OF_MONTH, 6);
		
		System.out.println();
	
		System.out.println(hj.get(Calendar.DAY_OF_MONTH));
		
	}

}
