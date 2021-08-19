package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	//8. Escreva um programa que, dados dois números 
	// inteiros, mostre na tela o maior deles, 
	// assim como a diferença existente entre ambos.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MAIOR E A DIFERENCA ##");
		System.out.println("Digite o primeiro número");
		int primeiroLido = teclado.nextInt();
		System.out.println("Digite o segundo número");
		int segundoLido = teclado.nextInt();
		
		if (primeiroLido == segundoLido) {
			System.out.println("Os número são iguais, portanto, não há um diferença");
		} else if (primeiroLido > segundoLido) {
			int diferenca = primeiroLido - segundoLido;
			System.out.printf("O primeiro número digitado é maior e a "
					+ "diferença dos dois números é %d", diferenca);
		} else {
			int diferenca = segundoLido - primeiroLido;
			System.out.printf("O segundo número digitado é maior e a "
					+ "diferença dos dois números é %d", diferenca);
		}
		
		teclado.close();
	}
}
