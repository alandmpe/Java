// Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos). Escrever a seguir o valor do maior elemento de Q e a respectiva posi��o que ele ocupa no vetor.

import java.util.Scanner;

public class Quest3 {
     
	private static Scanner scan;
	 
     public static void main(String[] args) {
		
    	 scan=new Scanner(System.in);
		int[] Q = new int[10];
		int posicao =0;
		int maior =0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o " + (i+1) + " � n�mero: ");
			Q[i]=scan.nextInt();
			
			while(Q[i]<0) {
				System.out.println("Informe um valor positivo: ");
				Q[i]=scan.nextInt();
			}
			if(i==1) {
				maior=Q[i];
			}
			if(Q[i]>maior) {
				maior =Q[i];
				posicao =i+1;
			}
		}
		System.out.println("Maior elemento �: " + maior + "\n Est� na posi��o: " + posicao);
      
	}

}
