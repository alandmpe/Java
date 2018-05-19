package entities;

	public class Triangulo extends Draw {

	private int a;
	private int b;
	private int c;
	
	public Triangulo(String nome, int a, int b, int c) {
		super(nome);
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

		public void checarTr() {
			if ((a == b) && (b == c) && (c == a)){
				System.out.println("Ele � um " + getNome() + " Equil�tero ");
			}
			else if ((a != b) && ( b ==c) && (c == a)){
				System.out.println("\n Ele � um " + getNome() + " Is�sceles ");	
			}
			
			else if ((a != b) && (b != c) && (c != a)) {
				System.out.println("\n Ele � um " + getNome() + " Escaleno ");
			}
		
		}
	}
