package contas;

public class ContaBancaria {

	private int numConta;
	private String titulaDaConta;
	private double saldoConta;
	
	
	public ContaBancaria(int numConta, String titulaDaConta, double saldoConta) {
		this.numConta = numConta;
		this.titulaDaConta = titulaDaConta;
		this.saldoConta = saldoConta;
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTitulaDaConta() {
		return titulaDaConta;
	}
	public void setTitulaDaConta(String titulaDaConta) {
		this.titulaDaConta = titulaDaConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
	

}