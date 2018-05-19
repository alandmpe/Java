// O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor e a respectiva posição dele nesse vetor.

import java.util.Scanner;

public class Quest4 {
     
	private static Scanner scan;
	 
     public static void main(String[] args) {
		
    	 scan=new Scanner(System.in);
		int[] Q = new int[10];
		int posicao =0;
		int menor =0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o " + (i+1) + " º número: ");
			Q[i]=scan.nextInt();
			
			while(Q[i]<0) {
				System.out.println("Informe um valor positivo: ");
				Q[i]=scan.nextInt();
			}
			if(i==1) {
				menor=Q[i];
			}
			if(Q[i]<menor) {
				menor =Q[i];
				posicao =i+1;
			}
		}
		System.out.println("Menor elemento é: " + menor + "\n Está na posição: " + posicao);
      
	}

}
