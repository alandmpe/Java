// Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. Calcular a média da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem.

import java.util.Scanner;

public class Quest2 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		double[] notas = new double[20];
		double media=7;
		int media_acima;
		
		
		for(int i = 0; i<20; i++) {
			System.out.println("Informe a nota do " + i + " º aluno: ");
			notas[i]= scan.nextDouble();
			}
		
		
		media_acima = 0;
		
		for(int i = 0; i<20; i++) {
			if (notas[i] > media) {
				media_acima = media_acima +1;
				} 	
		}
		System.out.println(media_acima + " alunos com nota acima da média!");	
	}
	
}
