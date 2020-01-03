package com.poli.javaIntermediario.aulas85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {
		
		Calendar hj1 = Calendar.getInstance();
		
		GregorianCalendar hj = new GregorianCalendar();
		
		//System.out.println(hj);
		
		imprimeData(hj);
		
		System.out.println(hj.isLeapYear(2020));
		
		GregorianCalendar hj2 = new GregorianCalendar(2017, 0, 1);
		
		imprimeData(hj2);
		
		GregorianCalendar hj3 = new GregorianCalendar(2017, 0, 1, 14, 30, 23);
		
		imprimeData(hj3);

	}

	private static void imprimeData(Calendar hj) {

		int ano = hj.get(Calendar.YEAR);
		int mes = hj.get(Calendar.MONTH);
		int dia = hj.get(Calendar.DAY_OF_MONTH);
		int hora = hj.get(Calendar.HOUR_OF_DAY);
		int minutos = hj.get(Calendar.MINUTE);
		int segundos = hj.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos);
		
		System.out.println();
	}

}
