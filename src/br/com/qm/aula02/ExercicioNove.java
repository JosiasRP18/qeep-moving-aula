package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioNove {

	// 9. Leia o salário de um trabalhador e o valor da 
	// prestação de um empréstimo. Se a prestação for 
	// maior que 20% do salário imprima: "Empréstimo não concedido", 
	// caso contrário imprima: "Empréstimo concedido"
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## EMPRESTIMO ##");
		System.out.println("Digite o seu salário: ");
		float salario = teclado.nextFloat();
		System.out.println("Digite o valor da prestação");
		float prestacao = teclado.nextFloat();
		
		boolean emprestimoConcedido = prestacao < salario * 0.2F && salario > 1500F;
		
		
		if (emprestimoConcedido) {
			System.out.println("Empréstimo concedido!");
		} else {
			System.out.println("Empréstimo não concedido!");
		}
		
		teclado.close();
	}
	
}
