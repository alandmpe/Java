package entities;

	public class Circulo extends Draw {
		
		private int r;
		private double pi;

		public Circulo(String nome, int r, double pi) {
			super(nome);
			
			this.r 	= r;
			this.pi = 3.14;
		}
		
		public void calcularArea() {
			System.out.println("A área do " + getNome() +  " é " + ((r*r) * pi));
		}
		
		

	}