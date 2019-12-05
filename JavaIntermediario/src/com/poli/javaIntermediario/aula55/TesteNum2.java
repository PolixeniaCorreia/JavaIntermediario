package com.poli.javaIntermediario.aula55;

import com.poli.javaIntermediario.aula54.DiaSemana;

public class TesteNum2 {

	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);

	}

}
