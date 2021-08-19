package br.com.qm.aula05;

import java.util.Scanner;

public class ProgramaPrincipal {

	// 1. Crie uma função que recebe como parâmetro um 
	// número inteiro e devolve o seu dobro.

	// 2. Faça uma função que receba 3 números inteiros 
	// como parâmetro, representando horas, minutos e segundos, e os converta em segundos.

	// 3. Faça uma função que receba uma temperatura em 
	// graus Celsius e retorne-a convertida em graus Fahrenheit.

	// 4. Faça uma função que receba a altura e 
	// o raio de um cilindro circular e retorne o volume do cilindro.
	public static void dobro(Scanner teclado) {
		// 96
		System.out.println("Digite um valor e eu mostrarei o seu dobro:");
		int numero = teclado.nextInt();
		System.out.printf("O dobro do número é: %d\n", numero * 2);
	}
	
	/// (C × 9/5) + 32 = F
	public static float celsiusParaFarenheit(float celsius) {
		float farenheit = (celsius * (9 / 5F)) + 32;
		// 41
		return farenheit;
	}
	
	public static void imprimeLinhas(int qtdLinhas) {
		
		for (int i = 0; i < qtdLinhas; i++) {
			System.out.println("------------------------");
		}
		
	}
	
	public static String menorValor(float primeiroProduto, float segundoProduto, float terceiroProduto) {
		
		if (primeiroProduto == segundoProduto 
				&& segundoProduto == terceiroProduto) {
			return "Tanto faz, todos os produtos tem o mesmo preço.";
		} else if (primeiroProduto < segundoProduto 
				&& primeiroProduto < terceiroProduto) {
			return "Compre o primeiro produto.";
		} else if (segundoProduto < primeiroProduto 
				&& segundoProduto < terceiroProduto) {
			return "Compre o segundo produto.";
		} else {
			return "Compre o terceiro produto.";
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## EXERCITANDO MENUS ##");
		
		int opcaoMenu = 0;
		do {
			imprimeLinhas(2);
			System.out.println("Escolha uma das operações à seguir");
			System.out.println("Digite 1 para a função dobro");
			System.out.println("Digite 2 para a conversão de Celsius para Farenheit");
			System.out.println("Digite 3 para a escolha ");
			System.out.println("Digite 0 para sair");
			imprimeLinhas(2);
			opcaoMenu = teclado.nextInt();
			
			switch (opcaoMenu) {
				case 0:
					System.out.println("Obrigado por usar o nosso programa!");
					break;
				case 1:
					dobro(teclado);
					break;
				case 2:
					System.out.println("Digite um valor em Celsius e eu converterei para Farenheit");
					float tempCelsius = teclado.nextFloat();
					float tempFarenheit = celsiusParaFarenheit(tempCelsius);
					System.out.printf("A temperatura em Farenheit é %.2f", tempFarenheit);
					break;
				case 3:
					System.out.println("Digite o primeiro valor: ");
					float primeiroProduto = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoProduto = teclado.nextFloat();
					System.out.println("Digite o terceiro valor: ");
					float terceiroProduto = teclado.nextFloat();
					System.out.println(menorValor(primeiroProduto, segundoProduto, terceiroProduto));
				default:
					System.out.println("Digite uma opção válida!");
			}
			
		} while (opcaoMenu != 0);
		
		
		
		
//		imprimeLinhas(10);
//		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("## EXEMPLO DE EXECUÇÃO DAS FUNÇÕES ##");
//		

//		
//		imprimeLinhas(5);
//		

//		
//		imprimeLinhas(1);
//		teclado.close();
	}
	
}
