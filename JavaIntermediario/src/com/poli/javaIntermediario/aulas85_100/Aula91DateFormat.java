package com.poli.javaIntermediario.aulas85_100;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {

		Date hj = new Date();

		System.out.println(Locale.getDefault());

		String  hjFormatado = DateFormat.getInstance().format(hj);
		System.out.println(hjFormatado);

		System.out.println(new Locale("pt", "Brazil"));

		hjFormatado = DateFormat.getInstance().format(hj);
		System.out.println(hjFormatado);

		hjFormatado = DateFormat.getTimeInstance().format(hj);
		System.out.println(hjFormatado);
		
		hjFormatado = DateFormat.getDateTimeInstance().format(hj);
		System.out.println(hjFormatado);

		hjFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hj);
		System.out.println(hjFormatado);
		
		hjFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hj);
		System.out.println(hjFormatado);

		hjFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hj);
		System.out.println(hjFormatado);

		hjFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hj);
		System.out.println(hjFormatado);

		String data = "12-02-2017 14:25";
		
		try {
			
			Date dataDate = DateFormat.getDateInstance().parse(data);
			System.out.println(dataDate);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataDate);
			
			System.out.println(calendar);
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
