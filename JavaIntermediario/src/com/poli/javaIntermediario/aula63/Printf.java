package com.poli.javaIntermediario.aula63;

public class Printf {

	public static void main(String[] args) {
		
		System.out.printf("%s", "Olá, Mundo!");
		System.out.printf("%S", "Olá, Mundo!");
		
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		
		System.out.printf("%n");
		
		int valor = 123;
		System.out.printf("%d" ,valor);
		
		System.out.println();
		
		double pontoFlutuante = 2.123456; 
		System.out.printf("%f", pontoFlutuante);
		
		System.out.println();
		
		String olaMundo ="Olá Mundo!";
		System.out.printf("%20s", olaMundo);
		
		System.out.println();

		System.out.printf("%-20s", olaMundo);
		
		System.out.println();
		
		System.out.printf("%+d" , valor);
		
		System.out.println();
		
		System.out.printf("%015d", valor);
		
		System.out.println();
		
		System.out.printf("%,d", valor);
		
		System.out.println();
		
		int valor2 = 123654;
		System.out.printf("% d", valor2);
		
		System.out.println();
		
		System.out.printf("%3f" , pontoFlutuante);
		
		System.out.println();
		System.out.printf("R$% 10.2f", pontoFlutuante);
		
		System.out.println();
		
		testeMaisCompleto();
		
	}

	private static void testeMaisCompleto() {
		
		double[] precos = {1000, 12.3, 856936.659, 1, 9.666};
		
		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de r$, 10.2f%n", "Item", i+1, precos[i]);
		}
		//Java.util.Formater
	}

}
