package com.poli.javaIntermediario.aulas85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");
		
		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hj = new Date();
		
		System.out.println(sdf.format(hj));
		
		String d = sdf.format(hj);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		try {

			Date minhaDataEmDate = sdf1.parse(minhaData);
			
			System.out.println(minhaDataEmDate);
			
			System.out.println(sdf.format(minhaDataEmDate));
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
