package br.com.qm.aula03;

import java.util.Scanner;

// Faça um programa que some os números ímpares contidos
//em um intervalo definido pelo usuário. O usuário define o 
//valor inicial do intervalo e o valor final deste intervalo e 
//o programa deve somar todos os números ímpares contidos neste
//intervalo. Caso o usuário digite um intervalo inválido 
//(começando por um valor maior que o valor final) deve ser 
//escrito uma mensagem de erro na tela, 
//“Intervalo de valores inválido” e o programa termina.
public class ExercicioSete {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## SOMA EM UM INTERVALO ##");
		System.out.println("Digite o início do intervalo: ");
		int inicio = teclado.nextInt();
		System.out.println("Digite fim do intervalo: ");
		int fim = teclado.nextInt();
		
		if (fim <= inicio) {
			System.out.println("Intervalo inválido");
			return;
		}
		
		int soma = 0; //8 //12
		// inicio = 8
		// fim = 12
		// soma = 20
		for (int i = inicio; i <= fim; i++) {
			// 1 iteração i = 8
			// 2 iteração i = 9
			// 3 iteração i = 10
			// 4 iteração i = 11
			// 5 iteração i = 12
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.printf("A soma dos valores ímpares no intervalo de %d a %d é %d", 
				inicio, fim, soma);
		teclado.close();
	}
	
}
