package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {

	
	//4. Leia um número real e imprima o resultado 
	//do quadrado desse número.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculadora de Quadrados ##");
		System.out.println("Digite um número: ");
		float numeroLido = teclado.nextFloat();
		
		float quadrado = numeroLido * numeroLido;
		System.out.printf("O quadrado de %.2f é %.2f", numeroLido, quadrado);
		
		teclado.close();
	}
}
