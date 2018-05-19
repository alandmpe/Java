package contas;

public class ContaCorrente extends ContaBancaria {
	
	private double chequeEspecial;
	private double valorDoDeposito;

	public ContaCorrente(int numConta, String titulaDaConta, double saldoConta, double chequeEspecial) {
		super(numConta, titulaDaConta, saldoConta);
		this.chequeEspecial = chequeEspecial;
		this.valorDoDeposito = valorDoDeposito;
	}
	
	public void sacar(double valorDoSaque) {
		
		if (valorDoSaque < (this.getSaldoConta() + this.chequeEspecial)) {
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
		System.out.println("A Saldo atual � de: \n" + saldoAtual );
	}
	
	public void checarTitularidade() {
		System.out.println("O Titular da conta �: " + this.getTitulaDaConta()
				+ "\n" + "O n�mero da conta �: " + this.getNumConta() );
	}
}