// Fa�a um algoritmo para ler um vetor de 30 n�meros. Ap�s isto, ler mais um n�mero qualquer, calcular e escrever quantas vezes esse n�mero aparece no vetor.

import java.util.Scanner;

public class Quest7 {
    
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan=new Scanner(System.in);
		
		int[] vet = new int[30];
		int num;
		int cont;
		
		for(int i=0; i<30; i++) {
			System.out.println("Digite um n�mero: ");
			vet[i]=scan.nextInt();
		}
		
		System.out.println("Digite o n�mero a ser pesquisado: ");
		num=scan.nextInt();
		cont=0;
		
		for(int i=0; i<30; i++) {
			if(vet[i]==num) {
				cont=cont+1;
			}
		}
		System.out.println("O n�mero " + num + " aparece " + cont + " vezes no vetor");

	}

}
