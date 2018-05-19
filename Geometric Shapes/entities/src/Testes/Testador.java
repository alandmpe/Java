package Testes;

import entities.Draw;
import entities.Circulo;
import entities.Triangulo;

public class Testador {

	public static void main(String[] args) {
		
		Circulo circle = new Circulo ("Círculo", 5 , 6);
		circle.calcularArea();
		
		Draw cc = circle;
		System.out.println("O nome desta forma é " + cc.getNome());
		
		System.out.println("--------------------------------------------------------");
		
		Triangulo triangle = new Triangulo ("Triângulo", 50 , 50, 50);
		triangle.checarTr();
		
		Triangulo tr = triangle;
		System.out.println("O nome desta forma é " + tr.getNome());
		}

		
	}
