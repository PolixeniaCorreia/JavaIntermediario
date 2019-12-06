package com.poli.javaIntermediario.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {

		//autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 2.55555;
		Boolean flag2 = true;
		Character b = 'b';

		//auto un-boxing
		int num13 = num9;

		num9++;

		System.out.println(num9);

		Integer num14 = num13/19;

		Double a, e, i;
		a = 10.0;
		e = 12.2;
		i = 5.5;

		Double media = (a+e+i)/3; // mau usoda classe Double, deve-se usar tipos primitivos.
		System.out.println(media);

	}

}
