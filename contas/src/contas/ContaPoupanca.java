package contas;

public class ContaPoupanca extends ContaBancaria {
	
	public ContaPoupanca(int numConta, String titulaDaConta, double saldoConta) {
		super(numConta, titulaDaConta, saldoConta);
		
		
	}
		public void sacar(double valorDoSaque) {
			
			if (valorDoSaque < this.getSaldoConta()) {
			double saldoAnterior = this.getSaldoConta();
			this.setSaldoConta(this.getSaldoConta() - valorDoSaque);
				System.out.println("Saldo anterior: " + saldoAnterior
						+ "\n" + "Valor do saque: " + valorDoSaque
						+ "\n" + "Saldo atual: " + this.getSaldoConta());
				
			}
			
		}
		
		public void depositar(double valorDoDeposito) {
			this.setSaldoConta(this.getSaldoConta() + valorDoDeposito);
			System.out.println("Deposito Concluido!"
					 + "\n" + "Saldo Atual:" + this.getSaldoConta());
					 		
			
		}
	    
		public void VerificarSaldo() {
			double saldoAtual = this.getSaldoConta();
			System.out.println("A Saldo atual é de: \n" + saldoAtual );
		}
		
		public void checarTitularidade() {
			System.out.println("O Titular da conta é: " + this.getTitulaDaConta()
					+ "\n" + "O número da conta é: " + this.getNumConta() );
		}
	
	}