package com.poli.javaIntermediario.aula65;

@interface InformacaoAula {
	
	String autor();
	int aulaNumero();
	
	String blog() default "http://poli.com";
	String site() default "http://poli.correia";
}
