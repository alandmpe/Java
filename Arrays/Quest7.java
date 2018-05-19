// Faça um algoritmo para ler um vetor de 30 números. Após isto, ler mais um número qualquer, calcular e escrever quantas vezes esse número aparece no vetor.

import java.util.Scanner;

public class Quest7 {
    
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan=new Scanner(System.in);
		
		int[] vet = new int[30];
		int num;
		int cont;
		
		for(int i=0; i<30; i++) {
			System.out.println("Digite um número: ");
			vet[i]=scan.nextInt();
		}
		
		System.out.println("Digite o número a ser pesquisado: ");
		num=scan.nextInt();
		cont=0;
		
		for(int i=0; i<30; i++) {
			if(vet[i]==num) {
				cont=cont+1;
			}
		}
		System.out.println("O número " + num + " aparece " + cont + " vezes no vetor");

	}

}
