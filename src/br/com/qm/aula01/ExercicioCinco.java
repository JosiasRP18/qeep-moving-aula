package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioCinco {

	//5. Leia um numero real e imprima a quinta parte deste número.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## DIVISÃO ##");
		System.out.println("Digite um número real");
		float numeroLido = teclado.nextFloat();
		
		float quintaParte = numeroLido / 5F;
		
		System.out.printf("A quinta parte de %.2f é %.2f", numeroLido,
				quintaParte);
		
		teclado.close();
	}
}
