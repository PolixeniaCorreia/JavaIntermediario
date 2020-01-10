package com.poli.javaIntermediario.aulas85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntegerBigDecimal {

	public static void main(String[] args) {
		
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		
		System.out.println(c);
		
		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);
		
		BigDecimal bdc1 = new BigDecimal("25465444444444442.2666666666666");
		BigDecimal bdc2 = new BigDecimal("25465444444444442.2666666666666");
		System.out.println(bdc1.add(bdc2));
		
		System.out.println(bdc1.multiply(bdc2));
		
		BigInteger bi = new BigInteger("1500000000000");
		System.out.println(bi);

	}

}
