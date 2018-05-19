package Testes;

import entities.Draw;
import entities.Circulo;
import entities.Triangulo;

public class Testador {

	public static void main(String[] args) {
		
		Circulo circle = new Circulo ("C�rculo", 5 , 6);
		circle.calcularArea();
		
		Draw cc = circle;
		System.out.println("O nome desta forma � " + cc.getNome());
		
		System.out.println("--------------------------------------------------------");
		
		Triangulo triangle = new Triangulo ("Tri�ngulo", 50 , 50, 50);
		triangle.checarTr();
		
		Triangulo tr = triangle;
		System.out.println("O nome desta forma � " + tr.getNome());
		}

		
	}
