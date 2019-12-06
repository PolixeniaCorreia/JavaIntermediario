package com.poli.javaIntermediario.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 3;
	
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		System.out.println(pow(a,b));
		System.out.println(sqrt(c));
		
	}

}
