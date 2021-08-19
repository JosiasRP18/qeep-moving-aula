package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioUm {

	// 1. Leia um valor de comprimento em polegadas e apresente-o 
	// convertido em centímetros.
	
	// POL * 2,54
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## CONVERTE POL EM CM ##");
		System.out.println("Digite o valor em polegadas:");
		float valorPolegadas = teclado.nextFloat();
		
		
		float valorCentimetros = valorPolegadas * 2.54F;
		
		System.out.printf("O valor %.2f polegadas equivale à %.2f centímetros", valorPolegadas, 
				valorCentimetros);
		
		teclado.close();
	}
}
