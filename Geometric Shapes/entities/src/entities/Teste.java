package entities;

public abstract class Teste {
	
	//Declaração de atributo
	private final String nome;

	//Método construtor
	public Teste(String nome) {
		this.nome = nome;
	}

	//Retorna o nome (atributo da classe)
	public String getNome() {
		return nome;
	}
	
	//Exemplo de método abstrato
	public abstract double calcularArea();


}