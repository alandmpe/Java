package contas;

public class TesteConta {

public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0001, "Messias Batista", 1500, 3000);
		ContaPoupanca cp = new ContaPoupanca(0001, "Messias Batista", 1500);
		
		System.out.println("--------------- Conta Corrente --------------- \n");	
				
		cc.sacar(200);
		System.out.println("----------------------------------");
		cc.depositar(500);
		System.out.println("----------------------------------");
		cc.VerificarSaldo();
		System.out.println("----------------------------------");
		cc.checarTitularidade();
		
		System.out.println("\n");
		System.out.println("--------------- Conta Poupança --------------- \n");
		
		cp.sacar(200);
		System.out.println("----------------------------------");
		cp.depositar(500);
		System.out.println("----------------------------------");
		cp.VerificarSaldo();
		System.out.println("----------------------------------");
		cp.checarTitularidade();
		

	}

}