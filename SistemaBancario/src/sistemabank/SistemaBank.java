package sistemabank;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SistemaBank {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList();
        String[] bt1 = {"Criar Conta", "Sair do Sistema", "Outros"};

        while (true) {

            int opcao = JOptionPane.showOptionDialog(null, "Caixa Eletrônico", "Banco",
                    JOptionPane.PLAIN_MESSAGE, -1, null, bt1, bt1);

            switch (opcao) {

                
                case 0: {
                    String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Nova Conta", JOptionPane.PLAIN_MESSAGE);
                    String numeConta = JOptionPane.showInputDialog(null, "Numero da conta", "Nova Conta", JOptionPane.PLAIN_MESSAGE);
                    String senha = JOptionPane.showInputDialog(null, "Senha", "Nova Conta", JOptionPane.PLAIN_MESSAGE);
                    
                    if (!nome.equals("") && !numeConta.equals("") && !senha.equals("")) {
                        contas.add(new Conta(new Cliente(nome), numeConta, senha));
                        JOptionPane.showMessageDialog(null, "Conta salva com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao fazer conta!");
                    }
                    break;
                }

                
                case 1: {
                    System.exit(0);
                    break;
                }

                
                case 2: {
                    String[] bt2 = {"Saque", "Depósito", "Transferência", "Saldo"};
                    int opcao1 = JOptionPane.showOptionDialog(null, "Caixa Eletrônico", "Outros",
                            JOptionPane.PLAIN_MESSAGE, -1, null, bt2, bt2);

                    switch (opcao1) {

                        //Saque
                        case 0: {
                            String numeConta = JOptionPane.showInputDialog(null, "Numero da conta", "Saque", JOptionPane.PLAIN_MESSAGE);
                            String senha = JOptionPane.showInputDialog(null, "Senha", "Saque", JOptionPane.PLAIN_MESSAGE);
                            for (Conta ct : contas) {
                                if (ct.getNumeConta().equals(numeConta) && ct.getSenha().equals(senha)) {
                                    int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor ", "Saque", JOptionPane.PLAIN_MESSAGE));
                                    if (ct.setSacar(valor)) {
                                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Erro ao sacar!");
                                    }
                                    break;
                                }
                            }
                            break;
                        }

                        //Déposito
                        case 1: {
                            String numeConta = JOptionPane.showInputDialog(null, "Numero da conta", "Depósito", JOptionPane.PLAIN_MESSAGE);
                            String senha = JOptionPane.showInputDialog(null, "Senha", "Depósito", JOptionPane.PLAIN_MESSAGE);
                            for (Conta ct : contas) {
                                if (ct.getNumeConta().equals(numeConta) && ct.getSenha().equals(senha)) {
                                    int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor ", "Depósito", JOptionPane.PLAIN_MESSAGE));
                                    if (ct.setDeposito(valor)) {
                                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Erro ao depositar!");
                                    }
                                    break;
                                }
                            }
                            break;
                        }

                        //Transferência
                        case 2: {
                            String numeConta = JOptionPane.showInputDialog(null, "Numero da conta", "Transferência", JOptionPane.PLAIN_MESSAGE);
                            String senha = JOptionPane.showInputDialog(null, "Senha", "Transferência", JOptionPane.PLAIN_MESSAGE);
                            for (Conta ct : contas) {
                                if (ct.getNumeConta().equals(numeConta) && ct.getSenha().equals(senha)) {
                                    int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor ", "Transferência", JOptionPane.PLAIN_MESSAGE));
                                    for (Conta ct1 : contas) {
                                        String numeConta1 = JOptionPane.showInputDialog(null, "Numero da conta de Destino", "Transferência", JOptionPane.PLAIN_MESSAGE);
                                        String titula = JOptionPane.showInputDialog(null, "Nome do Titular", "Transferência", JOptionPane.PLAIN_MESSAGE);
                                        if (ct1.getNumeConta().equals(numeConta1) && ct1.getCliente().getNome().equalsIgnoreCase(titula) && ct1.getNumeConta() != ct.getNumeConta()) {
                                            if (ct.setSacar(valor)) {
                                                ct1.setDeposito(valor);
                                                JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }

                        //Saldo
                        case 3: {
                            String numeConta = JOptionPane.showInputDialog(null, "Numero da conta", "Saldo", JOptionPane.PLAIN_MESSAGE);
                            String senha = JOptionPane.showInputDialog(null, "Senha", "Saldo", JOptionPane.PLAIN_MESSAGE);
                            for (Conta ct : contas) {
                                if (ct.getNumeConta().equals(numeConta) && ct.getSenha().equals(senha)) {
                                    JOptionPane.showMessageDialog(null, "Saldo: " + ct.getSaldo(), ct.getCliente().getNome(), JOptionPane.PLAIN_MESSAGE);
                                    break;
                                }
                            }
                            break;
                        }

                    }
                    break;
                }
            }
        }

    }
}
