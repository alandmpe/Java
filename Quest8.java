// Fa�a um algoritmo para ler 50 n�meros e armazenar em um vetor VET, verificar e escrever se existem n�meros repetidos no vetor VET e em que posi��es se encontram.

import java.util.Scanner;

public class Quest8 {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan=new Scanner(System.in);
		
		int[] vet = new int[50];
		int qtd = 0;
		int total;
		
		for(int i=0; i<50; i++) {
			System.out.println("Digite o " + (i+1) + " n�mero: ");
			vet[i]=scan.nextInt();
			
		}
        total=0;
        for(int i=0; i<49; i++) {
        	qtd=0;
        	for(int j=0; j<50;j++) {
        		if(vet[i]==vet[j]) {
        			if(qtd==0) {
        				System.out.println("O n�mero " + vet[i] + " foi repetido na posi��o: " + i);
        			}
        			System.out.println(" e " + j);
        			qtd=qtd+1;
        		}
        	}
        
        total=total+qtd;
        
        if(qtd>0) {
        	System.out.println("");
        }
	}
       if(total==0) {
    	   System.out.println("N�o existem valores repetidos no vetor!");
       }
}
}
