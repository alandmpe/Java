// Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenem os nomes lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.

import java.util.Scanner;

public class Quest1 {

	 private static Scanner scan;
	 
	 public static void main(String[] args) {
		 
		 scan = new Scanner(System.in);
		 
		 String[] nomes = new String[10];
		 String nome;
		 boolean encontrar=false;
		 
		 	for(int i=0; i < nomes.length; i++) {
		 		System.out.println("Digite o nome do Aluno" + (i+1)+ ":");
		 		nomes[i] = scan.next();
		 	}
		 		System.out.println("Informe o nome a ser encontrado: ");
		 		nome = scan.next();		
		 		
		 		
		 		for(int i=0; i < 10; i++) {
		 			if(nomes[i].equals(nome)) {
		 				encontrar=true;
		 			}
		 		}
		 		
		 		if(encontrar==true) {
		 			System.out.println("Achou!");
		 		}
		 		else {
		 			System.out.println("Não Achou!");
		 		}
		 		System.out.println();
	 }
}
