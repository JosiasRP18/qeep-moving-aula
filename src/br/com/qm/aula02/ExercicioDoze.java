package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	// 12. Faça um programa que pergunte o preço de três produtos e 
	// informe qual produto você deve comprar, 
	// sabendo que a decisão é sempre pelo mais barato.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MENOR VALOR ##");
		System.out.println("Digite o primeiro valor: ");
		float primeiroProduto = teclado.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float segundoProduto = teclado.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		float terceiroProduto = teclado.nextFloat();
		
		
		if (primeiroProduto == segundoProduto 
				&& segundoProduto == terceiroProduto) {
			System.out.println("Tanto faz, todos os produtos tem o mesmo preço.");
		} else if (primeiroProduto < segundoProduto 
				&& primeiroProduto < terceiroProduto) {
			System.out.println("Compre o primeiro produto.");
		} else if (segundoProduto < primeiroProduto 
				&& segundoProduto < terceiroProduto) {
			System.out.println("Compre o segundo produto.");
		} else {
			System.out.println("Compre o terceiro produto.");
		}
		
		teclado.close();
	}
	
}
