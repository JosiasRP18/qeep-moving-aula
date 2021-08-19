package br.com.qm.aula03;

public class ExercicioSeis {

	
	// Escreva um programa que declare um inteiro, 
	// inicialize-o com 0, e incremente-o de 1000 em 1000, 
	// imprimindo seu valor na tela, 
	// até que seu valor seja 100000 (cem mil).
	
	public static void main(String[] args) {
		
		System.out.println("## MIL EM MIL ##");
		
		for (int i = 0; i <= 100000; i += 1000) {
			System.out.println(i);
		}
		
	}
}
