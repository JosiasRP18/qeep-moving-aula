package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDez {

	// 10. Faça um algoritmo que calcule a média ponderada das 
	// notas de 3 provas. A primeira e a segunda prova tem peso 
	// 1 e a terceira tem peso 2. Ao final, mostrar a média do 
	// aluno e indicar se o aluno foi aprovado ou reprovado. 
	// A nota para aprovação deve ser igual ou 
	// superior a 60 pontos.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## APROVACAO ##");
		System.out.println("Digite a primeira nota: ");
		float primeiraNota = teclado.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float segundaNota = teclado.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float terceiraNota = teclado.nextFloat();
		
		float media = (primeiraNota * 1F + segundaNota * 1F + terceiraNota * 2F) 
				/ (1F + 1F + 2F);
		
		if (media >= 60) {
			System.out.printf("O aluno foi aprovado com média %.2f", media);
		} else {
			System.out.printf("O aluno foi reprovado :( coma média %.2f", media);
		}
		
		teclado.close();
	}
	
}
