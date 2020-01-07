package com.poli.javaIntermediario.aulas85_100;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.Resource;

public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual " +Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println();

		System.out.println("Olá Inglês: " +rb.getString("hello"));
		System.out.println("Mundo Inglês: " +rb.getString("world"));
		
		System.out.println();

		Locale.setDefault(new Locale("pt-BR", "pt-BR"));
		rb = ResourceBundle.getBundle("meu-texto_pt_BR");
		
		System.out.println("Olá: " +rb.getString("hello"));
		System.out.println("Mundo: " +rb.getString("world"));
		
		
		

	}

}
