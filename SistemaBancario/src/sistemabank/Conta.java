package sistemabank;

public class Conta {


    public Conta(Cliente cl, String numeConta, String senha) {
        this.cliente = cl;
        this.numeConta = numeConta;
        this.senha = senha;
        this.saldo = 0;
    }


    private Cliente cliente;
    private String numeConta;
    private String senha;
    private double saldo;


    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeConta() {
        return numeConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean setSacar(double valor) {
        if (valor > 0 && saldo - valor >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean setDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

}
